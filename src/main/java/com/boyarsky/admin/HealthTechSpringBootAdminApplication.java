package com.boyarsky.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class HealthTechSpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthTechSpringBootAdminApplication.class, args);
	}

}
