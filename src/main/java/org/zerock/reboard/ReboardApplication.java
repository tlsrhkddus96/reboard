package org.zerock.reboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ReboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReboardApplication.class, args);
	}

}
