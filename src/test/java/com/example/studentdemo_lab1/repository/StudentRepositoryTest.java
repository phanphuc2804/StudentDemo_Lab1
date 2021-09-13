package com.example.studentdemo_lab1.repository;

import com.example.studentdemo_lab1.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    void save() {
        Student student= Student.builder()
                .firstName("Binh1")
                .lastName("B")
                .email("b@gmail.com")
                .build();
        studentRepository.save(student);
    }

    @Test
    void findStudentByLastName() {
    }

    @Test
    void findAll() {

    }

    @Test
    void findStudentByEmail() {
    }

    @Test
    void findStudentByLastNameJPQL() {
    }

    @Test
    void findStudentByLastNameAndEmailJPQL() {
    }

    @Test
    void findStudentByIDNative() {
    }

    @Test
    void findAllStudent() {
    }

    @Test
    void updateByIdJPQL() {
    }

    @Test
    void deleteByStudentID() {
    }

    @Test
    void deleteStudentByIdJPQL() {
    }

    @Test
    void deleteStudentByEmailJPQL() {
    }

    @Test
    void deleteStudentByIdNative() {
    }

    @Test
    void updateFirstNameStudentByIDJPQL() {
    }

    @Test
    void updateLastNameStudentByIdNative() {
    }
}