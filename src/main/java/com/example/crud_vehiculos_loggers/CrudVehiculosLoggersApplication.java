package com.example.crud_vehiculos_loggers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CrudVehiculosLoggersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudVehiculosLoggersApplication.class, args);
	}

}
