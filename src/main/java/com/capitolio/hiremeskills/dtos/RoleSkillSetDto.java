package com.capitolio.hiremeskills.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class RoleSkillSetDto {

    @JsonIgnore
    private Long roleId;
    private List<SkillDto> skills;
}
