package claseConectar;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Sony
 */

public class conectar {
Connection conect = null;
   public Connection conexion()
    {
        
     try {
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/tienda";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conect = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } /*finally {
            if (conect != null) {
                try {
                    conect.close();
                    System.out.println("Database Connection Terminated");
                } catch (Exception e) {}
            }
        }*/
    return conect;
    }
}
     

