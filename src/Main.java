import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
        String username = "test";
        String password = "testeren";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected successfully to SQL Server!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        }
    }