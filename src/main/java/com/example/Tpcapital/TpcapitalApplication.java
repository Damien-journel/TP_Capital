package com.example.Tpcapital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.Tpcapital")
@EnableJpaRepositories(basePackages = "com.example.Tpcapital.repository")
public class TpcapitalApplication {
	public static void main(String[] args) {
		SpringApplication.run(TpcapitalApplication.class, args);
	}
}
