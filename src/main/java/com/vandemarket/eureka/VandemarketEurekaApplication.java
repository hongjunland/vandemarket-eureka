package com.vandemarket.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VandemarketEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(VandemarketEurekaApplication.class, args);
    }

}
