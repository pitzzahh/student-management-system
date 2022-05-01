package database;

import java.sql.*;
import model.Course;
import model.Student;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class DatabaseConnection {
    private static final String STATEMENT = "CREATE TABLE IF NOT EXISTS students (" +
            "first_name VARCHAR(50) NOT NULL," +
            "last_name VARCHAR(50) NOT NULL," +
            "age INT NOT NULL," +
            "address VARCHAR(200) NOT NULL," +
            "student_number VARCHAR(100) NOT NULL PRIMARY KEY," +
            "course BYTEA NOT NULL );";
    public DatabaseConnection() {
        Consumer<Connection> createTable = connection -> {
            try {
                connection.prepareStatement(STATEMENT).executeUpdate();
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        };
        createTable.accept(connect());
        System.out.println("Connected to the PostgreSQL Server Successfully.");
    }

    /**
     * Method that connects to the PostgreSQL database
     * @return a Connection object
     */
    private Connection connect() {
        Connection connection = null;
        try {
            final String USER = "peter";
            final String PASSWORD = "!Password123";
            final String URL = "jdbc:postgresql://localhost:5432/peter";
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
    /**
     * Method that inserts values into the table.
     * @param firstName the first name of a person to be inserted in the first_name column in the table
     * @param lastName the last name of a person to be inserted in the last_name column in the table
     * @param age the age of a person to be inserted in the age column in the table
     * @param address the address of a person to be inserted in the address column in the table
     * @param studentNumber the studentNumber of a person to be inserted in the studentNumber column in the table
     * @param course the course of a person to be inserted in the course column in the table
     */
    @SuppressWarnings("USED")
    public void insertValues(String firstName, String lastName, int age, String address, String studentNumber, Course course) {
        final String INSERT_STATEMENT = "INSERT INTO students (first_name, last_name, age, address, student_number, course) VALUES (?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement preparedStatement = connect().prepareStatement(INSERT_STATEMENT);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, studentNumber);
            preparedStatement.setObject(6, course);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * BiFunction that returns a query based on the parameter give.
     * If setLimit is true, the limit that was set will be used as a limit on how many rows will be queried.
     * If setLimit is false, it will get all the values in the table.
     */
    private static final BiFunction<Integer, Boolean, String> getQuery = (limit, setLimit) -> setLimit ? "SELECT * FROM students LIMIT " + limit : "SELECT * FROM students";
    /**
     * Function that retrieves data from the table.
     * First argument is the number of rows to be retrieved.
     * Second argument is the name of the table on the database.
     */
    public Function<Integer, ArrayList<Student>> retrieveData =
            limit -> {
                ArrayList<Student> studentsArrayList = new ArrayList<>();
                try {
                    Statement statement = connect().createStatement();
                    ResultSet resultSet = statement.executeQuery(getQuery.apply(limit,true));
                    while (resultSet.next()) {
                        studentsArrayList.add(new Student(
                                resultSet.getString("first_name"),
                                resultSet.getString("last_name"),
                                (byte)resultSet.getInt("age"),
                                resultSet.getString("address"),
                                resultSet.getString("student_number"),
                                (Course)resultSet.getObject("course")));
                    }
                    return studentsArrayList;
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            };
}

