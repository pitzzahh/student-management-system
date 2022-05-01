package database;

import model.Course;
import model.Student;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        DatabaseConnection databaseConnection = new DatabaseConnection();

        students.add(new Student(
                "Juan Dela",
                "Cruz",
                (byte)19,
                "Manila",
                "12345",
                new Course("BSIT102A", "Bachelor of Science in Information Technology")));
        students.add(new Student(
                "John",
                "Araña",
                (byte)19,
                "Cavite",
                "123123",
                new Course("BSIT102A", "Bachelor of Science in Information Technology")));

        for (Student student : students) {
            databaseConnection.insertValues(student.getFirstName(), student.getLastName(), student.getAge(), student.getAddress(), student.getStudentNumber(), student.getCourse());
        }
        students.clear();
        students = databaseConnection.retrieveData.apply(2); // 2 is the row limit to retrieve.
        students.forEach(System.out::println);
    }
}
