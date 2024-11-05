package com.eureka.eurekaverb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaVerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaVerbApplication.class, args);
	}

}
