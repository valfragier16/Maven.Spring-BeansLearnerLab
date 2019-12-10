package com.example.demo.instructors;

import com.example.demo.interfaces.Learner;
import com.example.demo.Person;
import com.example.demo.interfaces.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        Integer numberOfLearners = 0;
        for(Learner l : learners){
            numberOfHours++;
        }
        for(Learner l : learners){
            teach(l, numberOfHours/numberOfLearners);
        }
    }
}
