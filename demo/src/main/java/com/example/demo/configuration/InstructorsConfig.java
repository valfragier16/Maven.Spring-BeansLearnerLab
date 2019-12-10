package com.example.demo.configuration;

import com.example.demo.instructors.Instructor;
import com.example.demo.instructors.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    @Bean(name = "UsaInstructors")
    public Instructors usaInstructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor((long) 12, "Valerie"));
        instructors.add(new Instructor((long) 13, "Kendra"));
        return instructors;
    }

    @Bean(name = "PhiliInstructors")
    public Instructors philiInstructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor((long) 11, "Kai"));
        return instructors;
    }

    @Bean
    @Primary
    public Instructors instructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor((long) 8, "Ryan"));
        instructors.add(new Instructor((long) 9, "King"));
        instructors.add(new Instructor((long) 10, "Brandon"));
        return instructors;
    }

}
