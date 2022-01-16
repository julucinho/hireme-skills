package com.capitolio.hiremeskills.services;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import com.capitolio.hiremeskills.services.commons.RetrievingByIdService;
import org.springframework.stereotype.Service;

@Service
public interface RetrievingSkillSetsForCompaniesService extends RetrievingByIdService<RoleSkillSetDto, Long> {
}
