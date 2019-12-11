package com.example.demo.configuration;

import com.example.demo.models.instructors.Instructor;
import com.example.demo.models.instructors.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUsaInstructors()")
    public Instructors tcUsaInstructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(1L, "Dolio"));
        instructors.add(new Instructor(2L, "Chris"));
        instructors.add(new Instructor(3L, "Roberto"));
        return instructors;
    }

    @Bean(name = "tcUkInstructors()")
    public Instructors tcUkInstructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(1L, "Kris"));
        instructors.add(new Instructor(2L, "Froilan"));
        return instructors;
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors(){
        Instructors instructors = new Instructors(new ArrayList<>());
        instructors.add(new Instructor(1L, "Ryan"));
        instructors.add(new Instructor(2L, "King"));
        instructors.add(new Instructor(3L, "Tariq"));
        return instructors;
    }

}
