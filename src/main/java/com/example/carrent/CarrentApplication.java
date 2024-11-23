package com.example.carrent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.carrent.security")
@ComponentScan(basePackages = "com.example.carrent")
public class CarrentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrentApplication.class, args);
    }

}
