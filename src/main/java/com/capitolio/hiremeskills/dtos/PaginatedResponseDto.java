package com.capitolio.hiremeskills.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaginatedResponseDto<T> {

    private List<T> content;
    private Integer size;
    private Integer number;
    private Integer totalPages;
    private Integer totalElements;
    private Boolean last;

}
