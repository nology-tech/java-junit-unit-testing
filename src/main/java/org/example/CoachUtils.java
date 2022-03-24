package org.example;

class CoachUtils {
    public char calculateGrade(int grade) throws GradeRangeException {
        if (grade <= 100 && grade > 80) {
            return 'A';
        } else if (grade <= 80 && grade > 60) {
            return 'B';
        } else if (grade <= 60 && grade > 45) {
            return 'C';
        } else if (grade <= 45 && grade >= 0) {
            return 'D';
        } else if (grade > 100) {
            throw new GradeRangeException("This grade is over 100");
        } else {
            throw new GradeRangeException("This grade is below 0");
        }
    }
}
