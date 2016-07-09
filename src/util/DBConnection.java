package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sarasumit on 6/24/2016.
 */

public class DBConnection {
    public static final String DB_URL = "jdbc:mysql://localhost/studentdetails";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "";
    private Connection connection;
    public DBConnection(){

            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            } catch ( SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }

    public Connection getConnection(){

        return connection;
    }
}
