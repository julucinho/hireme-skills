package com.capitolio.hiremeskills.configs;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class IntegrationsConfig {

    @Value("${integration.config.hireme.users.context.uri}")
    private String usersServiceUri;

}
