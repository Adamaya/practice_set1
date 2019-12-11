
package connection;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
    private static final String URL="jdbc:mysql://localhost:3306/stock";
    private static final String USERNAME="root";
    private static final String PASSWORD="@happylife$";
    private static Connection connection=null;

    public static Connection getConnection() {
        return connection;
    }

    public boolean attemptConnection(){
        boolean isConnected=false;
        try{
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            isConnected=true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isConnected;
    }
}
