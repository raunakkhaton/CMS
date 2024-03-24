package com.dkyoutube.dineshyoutube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DineshYoutubeApplication {

	public static void main(String[] args) {

			SpringApplication.run(DineshYoutubeApplication.class, args);
	}




}
