package com.eyram.docker_compose_dev;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
@Bean
	public CommandLineRunner runner(){
		return args-> {
			System.out.println("J'ai réussi putain!");
		};
}
}
