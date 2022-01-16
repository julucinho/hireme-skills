package com.capitolio.hiremeskills.dtos;

import lombok.Data;

import java.util.List;

@Data
public class UserSkillSetDto {

    private Long userId;
    private List<SkillDto> skills;

}
