package com.capitolio.hiremeskills.clients.impl;

import com.capitolio.hiremeskills.clients.UsersClient;
import com.capitolio.hiremeskills.configs.IntegrationsConfig;
import com.capitolio.hiremeskills.dtos.UserDto;
import com.capitolio.hiremeskills.exceptions.SomeException;
import io.github.julucinho.httpclient.HttpRequestStarter;
import io.github.julucinho.httpclient.HttpResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;




            @Component
            @RequiredArgsConstructor
            @Slf4j
            public class UsersClientImpl implements UsersClient {

                private final IntegrationsConfig integrationsConfig;
                private final HttpRequestStarter httpRequestStarter;

                @Override
                public UserDto retrieveUserById(Long id) {
                    var request = this.httpRequestStarter
                            .startGetRequestModelFor(this.integrationsConfig.getUsersServiceUri())
                            .andAddPathVariableOf("users","1")
                            .andAddResponseHandlerByHttpStatusCode(404, this::handleAPossible404Response)
                            .andAddResponseHandlerByHttpStatusCode(500, response -> {throw new SomeException("ouch!");})
                            .andAddExceptionHandlerByExceptionType(RuntimeException.class, exception -> {throw new SomeException("Something went wrong: ".concat(exception.getMessage()));})
                            .andFinishBuildingModel();
                    return request.sendRequestReturning(UserDto.class);
                }

                private void handleAPossible404Response(HttpResponse httpResponse) {
                    throw new SomeException("Oh no! It seems like what you're looking for doesn't exist: ".concat(httpResponse.getStatusCode().toString()));
                }
            }


















