import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionFactory {
    private static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=swing_demo;";
    private static final String
            DATABASE_USER_NAME = "sa";
    private static final String DATABASE_PASSWORD = "Docker@123";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USER_NAME, DATABASE_PASSWORD);
    }
}
