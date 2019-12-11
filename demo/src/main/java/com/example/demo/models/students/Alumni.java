package com.example.demo.models.students;

import com.example.demo.models.People;
import com.example.demo.models.Person;
import com.example.demo.models.instructors.Instructor;
import com.example.demo.models.instructors.Instructors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;


    @PostConstruct
    public void executeBootCamp() {
//        int numberOfInstructors = instructors.size();
//        int numberOfStudents = previousStudents.size();
//        double numberOfHoursToTeachEachStudent = 1200;
//        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
//        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        for(Instructor instructor : instructors) {
            instructor.lecture(previousStudents, (1200.0 * previousStudents.size()) / instructors.size());
        }
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public void setPreviousStudents(Students previousStudents) {
        this.previousStudents = previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
