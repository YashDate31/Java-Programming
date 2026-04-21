package Manual.Unit_5_JDBC.Pr27_DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database connected successfully");
        } catch (Exception ex) {
            System.out.println("Connection error: " + ex.getMessage());
        }
    }
}
