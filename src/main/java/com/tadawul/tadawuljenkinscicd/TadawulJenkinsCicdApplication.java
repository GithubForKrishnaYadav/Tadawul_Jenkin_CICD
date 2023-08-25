package com.tadawul.tadawuljenkinscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TadawulJenkinsCicdApplication {
	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(TadawulJenkinsCicdApplication.class, args);
	}

	@PostConstruct
	public void logServerPort() {
		String port = environment.getProperty("server.port");
		System.out.println("Server is running on port: " + port);
	}
}
