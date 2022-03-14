package model;

public class Student extends Person {
    private String studentNumber;
    private Course course;
    
    /**
     * public Constructor, no args
     */
    public Student() {}

    /**
     * public Constructor that initializes the private fields {@code studentNumber} and {@code course}
     * @param firstName firstName of Student
     * @param lastName lastName of student
     * @param age age of a student
     * @param address address of Student
     * @param studentNumber the student number.
     * @param studentCourse the student course.
     */
    public Student(String firstName, String lastName, byte age, String address, String studentNumber, Course studentCourse) {
        super(firstName, lastName, age ,address);
        this.studentNumber = studentNumber;
        this.course = studentCourse;
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
