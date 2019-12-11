package com.example.demo.configuration;

import com.example.demo.models.students.Student;
import com.example.demo.models.students.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudent(){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L, "Valerie"));
        list.add(new Student(2L, "Kai"));
        list.add(new Student(3L, "Kendra"));
        list.add(new Student(4L, "Ryan"));
        return new Students(list);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L, "William"));
        list.add(new Student(2L, "Davis"));
        list.add(new Student(3L, "April"));
        list.add(new Student(4L, "Kate"));

        return new Students(list);
    }
}
