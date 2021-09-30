package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection=null;
    private final static String URL="jdbc:mysql://localhost:3306/test";
    private final static String username="root";
    private final static String password="";

    public Connection getConnection(){
        return connection;

    }

    public boolean attemptConnection() throws SQLException {
        connection= DriverManager.getConnection(URL,username,password);
        return connection!=null;

    }

    public void closeconnection() throws SQLException {
        getConnection().close();
    }

}
