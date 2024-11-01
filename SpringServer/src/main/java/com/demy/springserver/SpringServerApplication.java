package com.demy.springserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServerApplication.class, args);
    }

}
