package org.example;

import java.util.ArrayList;

public class StudentRepository {
    private ArrayList<Student> students;

    public StudentRepository(ArrayList<Student> students) {
        this.students = students;
    }

    public Student getStudent(String studentId) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getStudentID().equals(studentId)) {
                return student;
            }
        }
        throw new StudentNotFoundException();
    }
}
