package model;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private String studentNumber;
    private Course course;
    
    /**
     * public Constructor, no args
     */
    public Student() {}

    /**
     * public Constructor that initializes the private fields {@code studentNumber} and {@code course}
     * @param studentNumber the student number.
     * @param studentCourse the student course.
     */
    public Student(String studentNumber, Course studentCourse) {
        this.studentNumber = studentNumber;
        this.course = studentCourse;
    }
    
    public boolean equals(Student student) {
        return (this.studentNumber.equals(student.studentNumber) && this.course.equals(student.course));
    }
    
    /**
     * Method that sets the student number.
     * @param studentNumber student number.
     */
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * Method that sets the course of a student.
     * @param course student course.
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * Method that returns the student number.
     * @return {@code studentNumber}
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Method that returns the course of a student.
     * @return {@code course}
     */
    public Course getCourse() {
        return course;
    }
}
