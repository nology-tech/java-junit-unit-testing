package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CoachUtilsTest {

    // ARRANGE
    public CoachUtils coachUtils;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        coachUtils = new CoachUtils();
//        System.out.println("setting up");
    }

    @After
    public void tearDown() throws Exception {
        coachUtils = null;
//        System.out.println("tear down");
    }

    @Test
    public void MethodName_StateUnderTest_ExpectedBehaviour() {
        assertTrue(true);
    }

    @Test
    public void calculateGrade_OneHundred_ReturnsA() throws GradeRangeException {
        // ACT
        char result = coachUtils.calculateGrade(100);
        //ASSERT
        assertEquals(result, 'A');
    }

    @Test
    public void calculateGrade_EightyOne_ReturnsA() throws GradeRangeException {
        char result = coachUtils.calculateGrade(81);
        assertEquals(result, 'A');
    }

    @Test
    public void calculateGrade_Eighty_ReturnsB() throws GradeRangeException {
        char result = coachUtils.calculateGrade(80);
        assertEquals(result, 'B');
    }

    @Test
    public void calculateGrade_SixtyOne_ReturnsB() throws GradeRangeException {
        char result = coachUtils.calculateGrade(61);
        assertEquals(result, 'B');
    }

    @Test
    public void calculateGrade_Sixty_ReturnsC() throws GradeRangeException {
        char result = coachUtils.calculateGrade(60);
        assertEquals(result, 'C');
    }

    @Test
    public void calculateGrade_FortySix_ReturnsC() throws GradeRangeException {
        char result = coachUtils.calculateGrade(46);
        assertEquals(result, 'C');
    }

    @Test
    public void calculateGrade_FortyFive_ReturnsD() throws GradeRangeException {
        char result = coachUtils.calculateGrade(45);
        assertEquals(result, 'D');
    }

    @Test
    public void calculateGrade_Zero_ReturnsD() throws GradeRangeException {
        char result = coachUtils.calculateGrade(0);
        assertEquals(result, 'D');
    }

    @Test
    public void calculateGrade_OverOneHundred_ThrowsGradeRangeException() throws GradeRangeException {
        exception.expect(GradeRangeException.class);
        exception.expectMessage(("This grade is over 100"));

        coachUtils.calculateGrade(111);
    }

    @Test
    public void calculateGrad_BelowZero_ThrowsGradeRangeException() throws GradeRangeException {
        exception.expect(GradeRangeException.class);
        exception.expectMessage("This grade is below 0");

        coachUtils.calculateGrade(-1);
    }
}