package org.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentRepositoryTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private StudentRepository studentRepository;

    private Student testStudentOne;
    private Student testStudentTwo;

    @Before
    public void setUp() throws Exception {
        testStudentOne = new Student("student-id-1", "", "", new ArrayList<String>(), "");
        testStudentTwo = new Student("student-id-2", "", "", new ArrayList<String>(), "");

        ArrayList<Student> students = new ArrayList<>();
        students.add(testStudentOne);
        students.add(testStudentTwo);

        studentRepository = new StudentRepository(students);
    }


    @Test
    public void getStudent_CorrectId_ReturnsStudentOne() throws StudentNotFoundException {
        Student result = studentRepository.getStudent("student-id-1");
        assertEquals(result, testStudentOne);
    }


    @Test
    public void getStudent_CorrectId_ReturnsStudentTwo() throws StudentNotFoundException {
        Student result = studentRepository.getStudent("student-id-2");
        assertEquals(result, testStudentTwo);
    }


    @Test
    public void getStudent_IncorrectId_ThrowsStudentNotFoundException() throws StudentNotFoundException {
        exception.expect(StudentNotFoundException.class);
        exception.expectMessage("Student not found");

        studentRepository.getStudent("student-id-0");
    }
}