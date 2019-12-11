package com.example.demo.models.instructors;

import com.example.demo.models.People;

import java.util.List;

public class Instructors extends People<Instructor> {

    public Instructors(List<Instructor> personList) {
        super(personList);
    }

}
