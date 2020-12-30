package com.bielarski.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SPLIT THIS INTO SEPARATE SERVICE AND CONTROLLER LAYERS
@SpringBootApplication
public class BielarskiCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BielarskiCrudApplication.class, args);
	}

}
