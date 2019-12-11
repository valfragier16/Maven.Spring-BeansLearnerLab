package com.example.demo.models;

import com.example.demo.models.instructors.Instructors;
import com.example.demo.interfaces.Teacher;
import com.example.demo.models.students.Students;

import java.util.ArrayList;

public class Classroom {
    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors, Students students){
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(new ArrayList<>(10), numberOfHours);

    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}
