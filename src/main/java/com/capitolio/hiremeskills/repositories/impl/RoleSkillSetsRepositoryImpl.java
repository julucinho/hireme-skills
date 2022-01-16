package com.capitolio.hiremeskills.repositories.impl;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import com.capitolio.hiremeskills.repositories.RoleSkillSetsRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RoleSkillSetsRepositoryImpl implements RoleSkillSetsRepository {

    private final List<RoleSkillSetDto> roleSkillSets = new ArrayList<>();

    @Override
    public void save(RoleSkillSetDto roleSkillSet) {
        var roleIdBeingSaved = roleSkillSet.getRoleId();
        var roleSkillSetToUpdate = this.roleSkillSets.stream()
                .filter(skillSet -> skillSet.getRoleId().equals(roleIdBeingSaved))
                .findFirst();
        if (roleSkillSetToUpdate.isPresent())
            this.updateRoleSkillSetFromTo(roleSkillSetToUpdate.get(), roleSkillSet);
        else
            this.roleSkillSets.add(roleSkillSet);
    }

    @Override
    public Optional<RoleSkillSetDto> findById(Long id) {
        return this.roleSkillSets.stream()
                .filter(skillSet -> skillSet.getRoleId().equals(id))
                .findFirst();
    }

    private void updateRoleSkillSetFromTo(RoleSkillSetDto roleSkillSetToBeUpdated, RoleSkillSetDto roleSkillSet) {
        roleSkillSetToBeUpdated.setRoleId(roleSkillSet.getRoleId());
        roleSkillSetToBeUpdated.setSkills(roleSkillSet.getSkills());
    }
}
