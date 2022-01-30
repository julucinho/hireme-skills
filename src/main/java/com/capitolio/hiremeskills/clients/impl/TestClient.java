package com.capitolio.hiremeskills.clients.impl;

import com.capitolio.hiremeskills.dtos.PaginatedResponseDto;
import com.capitolio.hiremeskills.dtos.RoleDto;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.julucinho.httpclient.HttpRequestStarter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestClient {

    private final HttpRequestStarter httpRequestStarter;

    public RoleDto teste(Long id){
        var uri = "http://localhost:8765/HIREME-COMPANIES";
        var requestModel = this.httpRequestStarter
                .startGetRequestModelFor(uri)
                .andAddPathVariableOf("roles", id.toString())
                .andFinishBuildingModel();
        return requestModel.sendRequestReturning(RoleDto.class);
    }

    public PaginatedResponseDto<RoleDto> teste2(){
        var uri = "http://localhost:8765/HIREME-COMPANIES";
        var requestModel = this.httpRequestStarter
                .startGetRequestModelFor(uri.concat("/companies"))
                .andAddQueryParameterOf("pageNumber", "0")
                .andAddQueryParameterOf("pageSize", "10")
                .andFinishBuildingModel();
        var typeReference = new TypeReference<PaginatedResponseDto<RoleDto>>(){};
        return requestModel.sendRequestReturning(typeReference);
    }

}
