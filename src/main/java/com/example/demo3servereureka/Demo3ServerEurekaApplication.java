package com.example.demo3servereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Demo3ServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo3ServerEurekaApplication.class, args);
    }

}
