package com.lowkey.busrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusRabbitmqApplication.class, args);
    }
}
