# java-junit-unit-testing

This codealong was written with the junit4 testing package.

## Setup
- Clone the repo
- Open in Intellij
- Right click -> Maven -> Reload project

## Junit

- Looking at Junit syntax. 
- Testing the `calculateGrade()` method on the `CoachUtils` class.
  - Positive & Negative tests
  - Arrange, Act and Assert

```
@Before
public void setUp() {}

@After
public void tearDown() {}

@Test
public void MethodName_StateUnderTest_ExpectedBehavior() {
    // Test in here 
}
```

### Challenge 1

```
// Create a new class Student.java
// Create a new class StudentTest.java
// Student should have properties of: 
// - "studentId" a string
// - "subject" a string
// - "name" a string
// - "interests" an ArrayList<String>
// - "location" a string
// Student should have methods of "greet()" and hasInterest()
// Try to Write both POSITIVE and NEGATIVE tests for both methods in StudentTest.java
// greet() should return a string "Hello my name is NAME, I am currently studying SUBJECT at LOCATION."
// hasInterest() should take an interest and return a boolean
// - if the given interest is in students interests ArrayList return true otherwise false
// TDD please :) 
// - The tests should fail, return to Student.java to implement these functions
// Watch the tests pass as your code works correctly
```

## Exceptions & Try & Catch

- Looked at in built Exceptions
  -  ArrayIndexOutOfBoundsException 
  -  NullPointerException
- Created custom `GradeRangeException`
  - This is used in the `calculateGrade()` method on the `CoachUtils` class.
- Looked how we can use try catch block to catch exceptions in `App`

### Challenge 2

```
// Create a new class StudentRepository.java
// Create a new class StudentRepositoryTests.java
// StudentRepository has a property students which is a Arraylist<Student>,
// - in the constructor add some students
// StudentRepository has a method getStudent(String studentId) that returns the student
// StudentRepositoryTest should test that a student is found, and
// StudentRepositoryTest should test that a custom StudentNotFoundException is thrown
```
