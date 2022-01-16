package com.capitolio.hiremeskills.services.impl;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import com.capitolio.hiremeskills.repositories.RoleSkillSetsRepository;
import com.capitolio.hiremeskills.services.RetrievingSkillSetsForCompaniesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RetrievingSkillSetsForCompaniesServiceImpl implements RetrievingSkillSetsForCompaniesService {

    private final RoleSkillSetsRepository roleSkillSetsRepository;

    @Override
    public Optional<RoleSkillSetDto> retrieveBy(Long id) {
        return this.roleSkillSetsRepository.findById(id);
    }
}
