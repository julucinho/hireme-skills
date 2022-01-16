package com.capitolio.hiremeskills.repositories;

import com.capitolio.hiremeskills.dtos.RoleSkillSetDto;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleSkillSetsRepository {
    void save(RoleSkillSetDto roleSkillSet);
    Optional<RoleSkillSetDto> findById(Long id);
}
