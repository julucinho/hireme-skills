package com.capitolio.hiremeskills.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class UserSkillSetDto {

    @JsonIgnore
    private Long userId;
    private List<SkillDto> skills;

}
