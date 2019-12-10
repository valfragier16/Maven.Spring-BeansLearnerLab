package com.example.demo.students;

import com.example.demo.People;

import java.util.List;

public class Students extends People {

    private double totalStudyTime = 0;

    public Students(List personList) {
        super(personList);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
