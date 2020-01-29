package com.moneymani.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MoneymaniApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneymaniApiApplication.class, args);
	}

}
