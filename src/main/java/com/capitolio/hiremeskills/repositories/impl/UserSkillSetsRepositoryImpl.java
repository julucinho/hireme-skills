package com.capitolio.hiremeskills.repositories.impl;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import com.capitolio.hiremeskills.repositories.UserSkillSetsRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserSkillSetsRepositoryImpl implements UserSkillSetsRepository {

    private final List<UserSkillSetDto> userSkillSets = new ArrayList<>();

    @Override
    public void save(UserSkillSetDto userSkillSet) {
        var roleIdBeingSaved = userSkillSet.getUserId();
        var userSkillSetToUpdate = this.userSkillSets.stream()
                .filter(skillSet -> skillSet.getUserId().equals(roleIdBeingSaved))
                .findFirst();
        if (userSkillSetToUpdate.isPresent())
            this.updateUserSkillSetFromTo(userSkillSetToUpdate.get(), userSkillSet);
        else
            this.userSkillSets.add(userSkillSet);
    }

    @Override
    public Optional<UserSkillSetDto> findById(Long id) {
        return this.userSkillSets.stream()
                .filter(skillSet -> skillSet.getUserId().equals(id))
                .findFirst();
    }

    private void updateUserSkillSetFromTo(UserSkillSetDto userSkillSetToBeUpdated, UserSkillSetDto userSkillSet) {
        userSkillSetToBeUpdated.setUserId(userSkillSet.getUserId());
        userSkillSetToBeUpdated.setSkills(userSkillSet.getSkills());
    }
}
