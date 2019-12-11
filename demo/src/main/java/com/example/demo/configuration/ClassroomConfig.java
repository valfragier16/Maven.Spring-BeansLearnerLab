package com.example.demo.configuration;

import com.example.demo.models.Classroom;
import com.example.demo.models.instructors.Instructors;
import com.example.demo.models.students.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean
    @Qualifier("currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean
    @Qualifier("previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, Students previousStudents){
        return new Classroom(instructors, previousStudents);
    }
}
