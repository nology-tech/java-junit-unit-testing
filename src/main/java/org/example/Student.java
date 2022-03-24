package org.example;

import java.util.ArrayList;

public class Student {
    private String studentID;
    private String subject;
    private String name;
    private ArrayList<String> interests;
    private String location;


    public Student(String studentID, String subject, String name, ArrayList<String> interests, String location) {
        this.studentID = studentID;
        this.subject = subject;
        this.name = name;
        this.interests = interests;
        this.location = location;
    }

    public String getStudentID() {
        return studentID;
    }

    public String greet() {
        return "Hello my name is " + name + ", I am currently studying " + subject + " at " + location + ".";
    }

    public boolean hasInterest(String interest) {
        return interests.contains(interest);
    }
}
