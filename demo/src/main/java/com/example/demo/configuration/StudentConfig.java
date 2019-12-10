package com.example.demo.configuration;

import com.example.demo.students.Student;
import com.example.demo.students.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudent(){
        Students students = new Students(new ArrayList<>());
        students.add(new Student((long) 12, "Valerie"));
        students.add(new Student((long) 13, "Kendra"));
        return students;
    }

    @Bean
    public Students previousStudents(){
        Students students = new Students(new ArrayList<>());
        students.add(new Student((long) 14, "Valerie"));
        return students;
    }
}
