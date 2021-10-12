package com.fabiankevin.grpchelloworld;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GrpcHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcHelloworldApplication.class, args);
    }
}
