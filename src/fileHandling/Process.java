/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileHandling;

import java.awt.Color;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Course;
import model.Student;
import model.Subject;

/**
 *
 * @author pitzzahh
 */
public class Process {
    
    public static final Color LIGHT_COLOR = new Color(255, 255, 255);
    public static final Color DARK_COLOR = new Color(33,37,43);

    public static ArrayList<String> listOfAddedSubjects;
    public static ArrayList<Subject> listOfCourseSubjects;
    
    public static ArrayList<Student> students;
    public static ArrayList<Course> courses;
    public static ArrayList<Subject> subjects;
    
    public static Boolean theme = false;
    public static boolean exist;
    
    private static boolean endOfFile;
    
    public static void populateSubjects() {
        try {
            try (ObjectInputStream subjectsObjectInputStream = new ObjectInputStream(new FileInputStream("src/resource/Subjects.dat"))) {
                endOfFile = false;
                while(!endOfFile) {
                    try {
                        subjects.add((Subject)subjectsObjectInputStream.readObject());
                    } catch(EOFException ignored) {
                        endOfFile = true;
                    } catch (IOException | ClassNotFoundException exception) {
                        JOptionPane.showMessageDialog(null, exception.getMessage());
                    }
                }
            }
            
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }
    public static void populateCourses() {
        try {
            try (ObjectInputStream coursesObjectInputStream = new ObjectInputStream(new FileInputStream("src/resource/Courses.dat"))) {
                endOfFile = false;
                while(!endOfFile) {
                    try {
                        courses.add((Course)coursesObjectInputStream.readObject());
                    } catch(EOFException ignored) {
                        endOfFile = true;
                    } catch (IOException | ClassNotFoundException exception) {
                        JOptionPane.showMessageDialog(null, exception.getMessage());
                    }
                }
            }
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }
    
    public static void populateStudents() {
        try {
            try (ObjectInputStream studentsObjectInputStream = new ObjectInputStream(new FileInputStream("src/resource/Students.dat"))) {
                endOfFile = false;
                while(!endOfFile) {
                    try {
                        students.add((Student)studentsObjectInputStream.readObject());
                    } catch(EOFException ignored) {
                        endOfFile = true;
                    } catch (IOException | ClassNotFoundException exception) {
                        JOptionPane.showMessageDialog(null, exception.getMessage());
                    }
                }
            }
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }
    
    public static void saveSubjectsToAFile(){
        try {
            try (ObjectOutputStream subjectsObjectOutputStream = new ObjectOutputStream(new FileOutputStream("src/resource/Subjects.dat"))) {
                for(Subject subject : subjects) {
                    subjectsObjectOutputStream.writeObject(subject);
                }
            }
        } catch(IOException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }
    
    public static void saveCoursesToAFile() {
        try {
            try (ObjectOutputStream coursesObjectOutputStream = new ObjectOutputStream(new FileOutputStream("src/resource/Courses.dat"))) {
                for(Course course : courses) {
                    coursesObjectOutputStream.writeObject(course);
                }
            }
        } catch(IOException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }
    
    public static void saveStudentsToAFile() {
        try {
            try (ObjectOutputStream studentsObjectOutputStream = new ObjectOutputStream(new FileOutputStream("src/resource/Students.dat"))) {
                for(Student student : students) {
                    studentsObjectOutputStream.writeObject(student);
                }
            }
        } catch(IOException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }
    
    public static String[] getSubjects() {
        String[] subjectsList = new String[subjects.size()];
        for(int i = 0; i < subjects.size(); i++) {
            subjectsList[i] = subjects.get(i).getSubjectDescription();
        }
        return subjectsList;
    }
    
    public static String[] getCourses() {
        String[] coursesList = new String[courses.size()];
        for(int i = 0; i < courses.size(); i++) {
            coursesList[i] = courses.get(i).getCourseDescription();
        }
        return coursesList;
    }
    
    public static String[] getStudents() {
        String[] studentsList = new String[students.size()];
        for(int i = 0; i < students.size(); i++) {
            studentsList[i] = students.get(i).getFirstName() + " " + students.get(i).getLastName();
        }
        return studentsList;
    }
    public static boolean isNumber(String numberString) {
        try {
            Integer.parseInt(numberString);
            return true;
        }catch(Exception ignored) {}
        return false;
    }
    
    public static void setTheme(boolean theme) {
        Process.theme = theme;
    }
    
    public static boolean isDarkTheme() {
        return theme;
    }
    public static void populateTheme() {
        try {
            try (ObjectInputStream themesObjectInputStream = new ObjectInputStream(new FileInputStream("src/resource/Theme.dat"))) {
                theme = (Boolean)themesObjectInputStream.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Process.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "ERROR LOADING THEME");
        }
    }
    public static void saveTheme() {
        try {
            try (ObjectOutputStream statesObjectOutputStream = new ObjectOutputStream(new FileOutputStream("src/resource/Theme.dat"))) {
                statesObjectOutputStream.writeObject(theme);
            }
        } catch(IOException exception) {
            JOptionPane.showMessageDialog(null, "ERROR SAVING THEME");
        }
    }
}
