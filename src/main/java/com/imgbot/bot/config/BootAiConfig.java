package com.imgbot.bot.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BootAiConfig {

    private static final String KEY="you'r select Key!!!";

    @Bean
    public RestTemplate getRestTemplate(){

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add((request,body,execution)->{
            request.getHeaders().add("Authorization","Bearer "+KEY);
            return execution.execute(request,body);
        });

        return restTemplate;
    }
}
