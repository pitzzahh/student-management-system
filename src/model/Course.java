package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable {
    
    private String courseCode;
    private String courseDescription;
    private ArrayList<Subject> subjects;

    /**
     * public constructor, no args. Empty Course
     */
    public Course() {
        this.courseCode = "";
        this.courseDescription = "";
        this.subjects = new ArrayList<>();
    }

    /**
     * public Constructor that initializes the private fields {@code courseCode}, and {@code courseDescription}.
     * @param courseCode the code of the course.
     * @param courseDescription the description of the course.
     */
    public Course(String courseCode, String courseDescription) {
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
    }

    /**
     * public Constructor that initializes the private fields {@code courseCode}, and {@code courseDescription}, and {@code subjects}
     * @param courseCode the code of the course.
     * @param courseDescription the description of the course.
     * @param subjects the subjects.
     */
    public Course(String courseCode, String courseDescription, ArrayList<Subject> subjects) {
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
        setSubjects(subjects);
    }

    /**
     * Method that sets the course code.
     * @param courseCode the course code.
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * Method that sets the course description.
     * @param courseDescription the course description.
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    /**
     * Method that sets the subjects.
     * @param subjects the subjects of a course.
     */
    public final void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    /**
     * Method that returns the course code of  course.
     * @return {@code courseCode}.
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Method that returns the course description.
     * @return {@code courseDescription}.
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * Method that returns the subjects of a course.
     * @return {@code subjects}.
     */
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
}
