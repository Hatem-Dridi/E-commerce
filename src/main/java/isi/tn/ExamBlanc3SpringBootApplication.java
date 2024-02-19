package isi.tn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages="isi.tn")
@SpringBootApplication
public class ExamBlanc3SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamBlanc3SpringBootApplication.class, args);
	}

}
