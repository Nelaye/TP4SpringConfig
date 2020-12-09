package com.example.TP4ConfigArtifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Tp4ConfigNameApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp4ConfigNameApplication.class, args);
	}

}
