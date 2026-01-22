package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class MakeConnection {
    public Connection setConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management", "<username>",
                    "<password>");
        } catch (Exception ex) {
            System.out.println("Couldn't connect database: " + ex.getMessage());
        }
        return con;
    }

}
