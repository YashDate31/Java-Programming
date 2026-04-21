package Manual.Unit_5_JDBC.Pr30_ResultSetNavigation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetNavigationDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement(
                     ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_READ_ONLY);
             ResultSet resultSet = statement.executeQuery("SELECT id, name, marks FROM students")) {

            if (resultSet.next()) {
                System.out.println("First row: " + resultSet.getInt("id") + " " + resultSet.getString("name"));
            }

            if (resultSet.last()) {
                System.out.println("Last row: " + resultSet.getInt("id") + " " + resultSet.getString("name"));
            }

            resultSet.beforeFirst();
            System.out.println("All rows:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getInt("marks"));
            }
        } catch (Exception ex) {
            System.out.println("ResultSet error: " + ex.getMessage());
        }
    }
}
