package connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Helper {
    public ResultSet fetchData(Connection connection){
        ResultSet resultSet=null;
        try{
            Statement statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM cars;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
