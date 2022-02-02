package com.capitolio.hiremeskills.controllers;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import com.capitolio.hiremeskills.exceptions.RoleSkillSetDoestNotExistException;
import com.capitolio.hiremeskills.exceptions.UserSkillSetDoestNotExistException;
import com.capitolio.hiremeskills.services.RetrievingSkillSetsForCompaniesService;
import com.capitolio.hiremeskills.services.RetrievingSkillSetsForUsersService;
import com.capitolio.hiremeskills.services.SavingSkillSetsForCompaniesService;
import com.capitolio.hiremeskills.services.SavingSkillSetsForUsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skill-sets")
@RequiredArgsConstructor
public class SkillSetsController {

    private final SavingSkillSetsForCompaniesService savingSkillSetsForCompaniesService;
    private final SavingSkillSetsForUsersService savingSkillSetsForUsersService;
    private final RetrievingSkillSetsForCompaniesService retrievingSkillSetsForCompaniesService;
    private final RetrievingSkillSetsForUsersService retrievingSkillSetsForUsersService;

    @PutMapping("/roles/{roleId}")
    public ResponseEntity<Void> saveRoleSkillSet(
            @PathVariable Long roleId,
            @RequestBody RoleSkillSetDto roleSkillSet){
        roleSkillSet.setRoleId(roleId);
        this.savingSkillSetsForCompaniesService.save(roleSkillSet);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/users/{userId}")
    public ResponseEntity<Void> saveUserSkillSet(
            @PathVariable Long userId,
            @RequestBody UserSkillSetDto userSkillSet){
        userSkillSet.setUserId(userId);
        this.savingSkillSetsForUsersService.saveNew(userSkillSet);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/roles/{roleId}")
    public ResponseEntity<RoleSkillSetDto> retrieveRoleSkillSet(@PathVariable Long roleId){
        return ResponseEntity.ok(this.retrievingSkillSetsForCompaniesService.retrieveBy(roleId).orElseThrow(() -> new RoleSkillSetDoestNotExistException(roleId)));
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<UserSkillSetDto> retrieveUserSkillSet(@PathVariable Long userId){
        return ResponseEntity.ok(this.retrievingSkillSetsForUsersService.retrieveBy(userId).orElseThrow(() -> new UserSkillSetDoestNotExistException(userId)));
    }

}
