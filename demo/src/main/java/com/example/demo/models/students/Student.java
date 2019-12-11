package com.example.demo.models.students;

import com.example.demo.interfaces.Learner;
import com.example.demo.models.Person;

public class Student extends Person implements Learner {

    private double totalStudyTime = 0;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
