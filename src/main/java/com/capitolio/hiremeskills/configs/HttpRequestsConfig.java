package com.capitolio.hiremeskills.configs;

import io.github.julucinho.httpclient.HttpRequestStarter;
import io.github.julucinho.httpclient.impl.HttpRequestStarterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class HttpRequestsConfig {

        @Bean
        public HttpRequestStarter httpRequestModel(){
            return new HttpRequestStarterImpl();
        }

    }





