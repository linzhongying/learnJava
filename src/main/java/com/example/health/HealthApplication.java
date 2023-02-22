package com.example.health;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HealthApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(HealthApplication.class, args);
        }catch (Exception e){
            System.out.println("!!!!!!!");
            e.printStackTrace();
            System.out.println("!!!!!!!");
        }
    }
}
