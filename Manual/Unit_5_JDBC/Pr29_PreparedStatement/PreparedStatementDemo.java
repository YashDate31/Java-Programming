package Manual.Unit_5_JDBC.Pr29_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        String query = "INSERT INTO students(id, name, marks) VALUES(?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Yash");
            preparedStatement.setInt(3, 90);

            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + " row inserted using PreparedStatement");
        } catch (Exception ex) {
            System.out.println("PreparedStatement error: " + ex.getMessage());
        }
    }
}
