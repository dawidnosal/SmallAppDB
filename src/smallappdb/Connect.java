package smallappdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    static Connection conn = null;

    public static Connection ConnectDB(){
            
        try{
            Class.forName("com.mysql.jdbc.Driver");             //załadowanie sterownika
            Connection con = DriverManager.getConnection("jdbc:mysql://"+LoginFrame.hostname+":"+LoginFrame.port+"/"+LoginFrame.sid+"", ""+LoginFrame.username+"", LoginFrame.password);
            return con;
        }
        catch(ClassNotFoundException | SQLException ex){
            //JOptionPane.showMessageDialog(null, "Wystąpił problem podczas łączenia z bazą danych"); 
        }
        return null;
    }
}