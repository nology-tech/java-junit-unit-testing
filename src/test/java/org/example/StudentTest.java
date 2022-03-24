package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    public Student testStudentOne;
    public Student testStudentTwo;

    @Before
    public void setUp() throws Exception {
        ArrayList<String> studentOneInterests = new ArrayList<>();
        studentOneInterests.add("cycling");
        studentOneInterests.add("doughnuts");

        ArrayList<String> studentTwoInterests = new ArrayList<>();
        studentTwoInterests.add("running");
        studentTwoInterests.add("cookies");

        testStudentOne = new Student("student-id-1", "english", "charlie richardson", studentOneInterests, "bristol");
        testStudentTwo = new Student("student-id-2", "maths", "dan forder", studentTwoInterests, "chippenham");
    }

    @Test
    public void greet_CalledOnTestStudentOne_ReturnsFormattedMessage() {
        String result = testStudentOne.greet();
        assertEquals(result, "Hello my name is charlie richardson, I am currently studying english at bristol.");
    }

    @Test
    public void greet_CalledOnTestStudentTwo_ReturnsFormattedMessage() {
        String result = testStudentTwo.greet();
        assertEquals(result, "Hello my name is dan forder, I am currently studying maths at chippenham.");
    }

    @Test
    public void hasInterest_StudentOneWithInterest_ReturnTrue() {
        boolean result = testStudentOne.hasInterest("cycling");
        assertTrue(result);
    }

    @Test
    public void hasInterest_StudentTwoWithInterest_ReturnTrue() {
        boolean result = testStudentTwo.hasInterest("running");
        assertTrue(result);
    }

    @Test
    public void hasInterest_StudentOneWithOutInterest_ReturnFalse() {
        boolean result = testStudentOne.hasInterest("disco");
        assertFalse(result);
    }

    @Test
    public void hasInterest_StudentTwoWithOutInterest_ReturnFalse() {
        boolean result = testStudentTwo.hasInterest("dancing");
        assertFalse(result);
    }
}