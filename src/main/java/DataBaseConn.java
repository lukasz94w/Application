import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConn {

    private static String URL = "jdbc:postgresql://localhost:8012/data_base";
    private static String USER = "postgres";
    private static String PASSWORD = "3W3n3m3nt";

    public static Connection connect()
    {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Połączono z bazą");
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }

}

