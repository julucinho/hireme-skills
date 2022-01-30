package com.capitolio.hiremeskills.repositories;

import com.capitolio.hiremeskills.dtos.UserSkillSetDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserSkillSetsRepository {
    void save(UserSkillSetDto userSkillSet);

    Optional<UserSkillSetDto> findById(Long id);
}
