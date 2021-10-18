package com.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankingEServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingEServerApplication.class, args);
	}

}
