package com.example.demo.configuration;

import com.example.demo.models.instructors.Instructors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors()")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors()")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Test
    public void tcUsaInstructors() {
        Assert.assertEquals("Dolio", tcUsaInstructors.findById(1L).getName());
    }

    @Test
    public void tcUkInstructors() {
        Assert.assertEquals("Kris", tcUkInstructors.findById(1L).getName());
    }

    @Test
    public void instructors() {
        Assert.assertEquals("Tariq", instructors.findById(3L).getName());
    }
}