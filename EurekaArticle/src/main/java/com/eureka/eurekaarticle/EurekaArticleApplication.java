package com.eureka.eurekaarticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaArticleApplication.class, args);
	}

}
