package less23DAOTransactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Tom on 14.12.2017.
 */
public class ConnectionManager {
    private static final String URL = ("jdbc:mysql://localhost/restaurant_base");
    private static final String USER = ("root");
    private static final String PASSWORD = ("root");

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getDBConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
