package functions_folder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public final  class MakeConnection {
    static Connection con;

    public MakeConnection(){
        this.con = setConnection();
    }
    
    static Connection setConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management","<username>","<password>");
            System.out.println("database connected");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't connect to database","DB Error",JOptionPane.INFORMATION_MESSAGE);
        }
        return con;
    }
    
    
    
}
