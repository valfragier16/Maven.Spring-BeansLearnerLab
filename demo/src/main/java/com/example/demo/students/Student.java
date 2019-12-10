package com.example.demo.students;

import com.example.demo.interfaces.Learner;
import com.example.demo.Person;

public class Student extends Person implements Learner {
    private double totalStudyTime;


    public Student(Long id, String name) {
        super(id, name);
    }

    public Double getTotalStudyTime(){
        return totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;

    }
}
