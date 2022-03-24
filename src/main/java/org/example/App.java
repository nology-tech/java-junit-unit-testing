package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            int mark = -102;
            CoachUtils coachUtils = new CoachUtils();
            System.out.println(coachUtils.calculateGrade(mark));
        } catch (GradeRangeException error) {
            System.out.println(error.getMessage());
        }
    }
}
