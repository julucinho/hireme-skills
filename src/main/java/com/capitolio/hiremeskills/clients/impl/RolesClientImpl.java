package com.capitolio.hiremeskills.clients.impl;

import com.capitolio.hiremeskills.clients.RolesClient;
import com.capitolio.hiremeskills.configs.IntegrationsConfig;
import com.capitolio.hiremeskills.dtos.RoleDto;
import com.capitolio.hiremeskills.exceptions.NotFoundByIdException;
import io.github.julucinho.httpclient.HttpRequestStarter;
import io.github.julucinho.httpclient.HttpResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RolesClientImpl implements RolesClient {

    private final HttpRequestStarter httpRequestStarter;
    private final IntegrationsConfig integrationsConfig;

    @Override
    public RoleDto retrieveRoleById(Long id) throws NotFoundByIdException {
        var request = this.httpRequestStarter
                .startGetRequestModelFor(this.integrationsConfig.getCompaniesServiceUri())
                .andAddPathVariableOf("roles", id.toString())
                .andAddResponseHandlerByHttpStatusCode(404, this::handlePossible404Responses)
                .andFinishBuildingModel();
        return request.sendRequestReturning(RoleDto.class);
    }

    private void handlePossible404Responses(HttpResponse httpResponse) {
        throw new NotFoundByIdException("Request returned 404 for trying to find a role instance by a nonexistent ID");
    }
}
