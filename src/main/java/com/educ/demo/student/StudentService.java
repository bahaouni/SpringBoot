package com.educ.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){

        return List.of(
                new Student("baha", "gouni", LocalDate.now(), "bahaouni",22)
        );
    }
}
