package com.nikita.eventcreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
public class EventCreationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventCreationApplication.class, args);
    }

}
