package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
public class StudentService {

    public int findNumberOfNullMarks(Student data[]) {
        int count = 0;
        for (Student student : data) {
            if (student != null && student.getMarks() == null) {
                count++;
            }
        }
        return count;
    }

    public int findNumberOfNullName(Student data[]) {
        int count = 0;
        for (Student student : data) {
            if (student != null && student.getName() == null) {
                count++;
            }
        }
        return count;
    }

    public int findNumberOfNullObjects(Student data[]) {
        int count = 0;
        for (Student student : data) {
            if (student == null) {
                count++;
            }
        }
        return count;
    }
}