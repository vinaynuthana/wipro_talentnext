package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

class StudentGradeCalculationTest {

    StudentReport studentReport;
    StudentService studentService;
    Student studentData[];

    @BeforeEach
    void setUp() {
        studentReport = new StudentReport();
        studentService = new StudentService();
        studentData = new Student[8];
        
        // Sample data for testing null counts
        studentData[0] = new Student("Sekar", new int[]{80, 85, 90});
        studentData[1] = new Student(null, new int[]{70, 75, 80}); // Null Name
        studentData[2] = null; // Null Object
        studentData[3] = new Student("Manoj", null); // Null Marks
        studentData[4] = new Student(null, new int[]{90, 95, 100}); // Null Name
        studentData[5] = null; // Null Object
        studentData[6] = new Student("John", null); // Null Marks
        studentData[7] = new Student("Abhi", new int[]{34, 90, 95}); // Contains a mark < 35
    }

    // TC1: Calculate the grade for valid objects - Check for A grade
    @Test
    void testCalculateGradeA() {
        Student studentA = new Student("Alice", new int[]{90, 95, 98}); // Sum = 283
        assertEquals("A", studentReport.findGrade(studentA));
    }

    // TC2: Calculate the grade for valid objects - Check for D grade
    @Test
    void testCalculateGradeD() {
        Student studentD = new Student("Bob", new int[]{40, 45, 50}); // Sum = 135
        assertEquals("D", studentReport.findGrade(studentD));
    }

    // TC3: Calculate the grade for valid objects - Check for F grade
    @Test
    void testCalculateGradeF() {
        // studentData[7] has a mark < 35, so should be F
        assertEquals("F", studentReport.findGrade(studentData[7]));
    }

    // TC4: Check whether the validate function handles the following situations:
    // If the Object is null, throw NullStudentException().
    @Test
    void testValidateNullStudent() {
        assertThrows(NullStudentException.class, () -> {
            studentReport.validate(null);
        });
    }

    // TC5: If the Name is null, throw NullNameException().
    @Test
    void testValidateNullName() {
        Student student = new Student(null, new int[]{80, 85, 90});
        assertThrows(NullNameException.class, () -> {
            studentReport.validate(student);
        });
    }

    // TC6: If the Marks array is null, throw NullMarksArrayException().
    @Test
    void testValidateNullMarks() {
        Student student = new Student("Charlie", null);
        assertThrows(NullMarksArrayException.class, () -> {
            studentReport.validate(student);
        });
    }

    // TC7: Test findNumberOfNullName function.
    @Test
    void testFindNumberOfNullName() {
        assertEquals(2, studentService.findNumberOfNullName(studentData));
    }

    // TC8: Test findNumberOfNullObjects function.
    @Test
    void testFindNumberOfNullObjects() {
        assertEquals(2, studentService.findNumberOfNullObjects(studentData));
    }

    // TC9: Test findNumberOfNullMarks function.
    @Test
    void testFindNumberOfNullMarks() {
        assertEquals(2, studentService.findNumberOfNullMarks(studentData));
    }
}
