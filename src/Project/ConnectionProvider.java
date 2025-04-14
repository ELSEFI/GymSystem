package Project;
import java.sql.*;
/**
 *
 * @author Elsefi
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymm","root","root");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
