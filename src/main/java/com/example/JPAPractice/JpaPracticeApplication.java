package com.example.JPAPractice;

import com.example.JPAPractice.model.Student;
import com.example.JPAPractice.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaPracticeApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student femi = new Student(
					"Femi",
					"Lano",
					"femilano@gmail.com",
					23
			);
			studentRepository.save(femi);
		};
	}
}
