package com.example.demo.configuration;

import com.example.demo.models.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {
    @Autowired
    @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    Classroom previousCohort;

    @Test
    public void currentCohortTest() {
        Assert.assertEquals("Ryan", currentCohort.getInstructors().findById(1L).getName());
        Assert.assertEquals("Valerie", currentCohort.getStudents().findById(1L).getName());
    }

    @Test
    public void previousCohortTest(){
        Assert.assertEquals("King", previousCohort.getInstructors().findById(2L).getName());
        Assert.assertEquals("Davis", previousCohort.getStudents().findById(2L).getName());
    }
}
