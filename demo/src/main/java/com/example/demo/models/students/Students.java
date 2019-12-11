package com.example.demo.models.students;

import com.example.demo.models.People;

import java.util.List;

public class Students extends People<Student>{

    public Students(List<Student> personList) {
        super(personList);
    }
}
