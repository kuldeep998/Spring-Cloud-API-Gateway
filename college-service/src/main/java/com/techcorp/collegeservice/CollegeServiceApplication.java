package com.techcorp.collegeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/college")
public class CollegeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollegeServiceApplication.class, args);
    }


    @GetMapping("/")
    public String defaultMethod() {
        return "Welcome to college service " + new Date();
    }
}
