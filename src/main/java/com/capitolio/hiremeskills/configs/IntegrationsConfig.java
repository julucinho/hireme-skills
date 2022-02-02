package com.capitolio.hiremeskills.configs;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class IntegrationsConfig {

    @Value("${integration.config.hireme.users.service.uri}")
    private String usersServiceUri;

    @Value("${integration.config.hireme.companies.service.uri}")
    private String companiesServiceUri;

}
