package com.example.demo.models.instructors;

import com.example.demo.interfaces.Learner;
import com.example.demo.models.Person;
import com.example.demo.interfaces.Teacher;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher{
    Iterable<? extends Learner> learners;
    public Instructor(long id, String name) {
        super(id, name);
        learners = new ArrayList<>();
    }

    private int getSize(Iterable<? extends Learner> learners) {
        int size = 0;
        for (Learner learner : learners) {
            size++;
        }
        return size;
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        for (Learner learner : learners) {
            teach(learner, numberOfHours/ getSize(learners));
        }
    }
}
