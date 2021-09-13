package com.example.studentdemo_lab1;

import com.example.studentdemo_lab1.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentDemoLab1Application {

    public static void main(String[] args) {
        SpringApplication.run(StudentDemoLab1Application.class, args);
    }
    @Bean
    public CommandLineRunner run(StudentRepository studentRepository){
        return (args -> {
            System.out.println(studentRepository.findAll()
            );
        });
    }
}
