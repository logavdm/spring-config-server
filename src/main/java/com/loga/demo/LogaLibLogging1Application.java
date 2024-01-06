package com.loga.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LogaLibLogging1Application {

	public static void main(String[] args) {
		SpringApplication.run(LogaLibLogging1Application.class, args);
	}

}
