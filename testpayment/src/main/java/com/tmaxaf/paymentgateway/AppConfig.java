package com.tmaxaf.paymentgateway;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ModelMapper modelMapper(){
        System.out.println("Carete Configuration Model Mapper");
        return new ModelMapper();
    }
}
