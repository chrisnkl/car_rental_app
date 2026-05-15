package com.chrisnkl.backend.infrastracture.config;

import com.chrisnkl.backend.application.service.RentCarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {

    @Bean
    public RentCarService rentCarUseCase() {
        return new RentCarService();
    }


}
