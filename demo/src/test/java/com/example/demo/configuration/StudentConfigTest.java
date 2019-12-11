package com.example.demo.configuration;

import com.example.demo.models.students.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    private Students students;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;


    @Test
    public void currentStudentsTest() {
        Assert.assertEquals("Kai", students.findById(2L).getName());
    }

    @Test
    public void previousStudentsTest() {
        Assert.assertEquals("April", previousStudents.findById(3L).getName());
    }
}
