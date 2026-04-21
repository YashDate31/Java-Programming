package Manual.Unit_5_JDBC.Pr28_DB_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcCrudDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate("INSERT INTO students(id, name, marks) VALUES(1, 'Amit', 78)");
            statement.executeUpdate("UPDATE students SET marks = 85 WHERE id = 1");
            statement.executeUpdate("DELETE FROM students WHERE id = 1");

            System.out.println("Insert, update, delete operations completed");
        } catch (Exception ex) {
            System.out.println("CRUD error: " + ex.getMessage());
        }
    }
}
