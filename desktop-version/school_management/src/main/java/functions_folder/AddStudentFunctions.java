package functions_folder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddStudentFunctions {
    public void addStudent(String name,String clas,String place, String contact){
        try(
            Connection con = MakeConnection.setConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO students (name,class,place,contact) VALUES ('"+name+"','"+clas+"','"+place+"','"+contact+"')");            
                ) {
        
        int rowsAffected = ps.executeUpdate();        
        if (rowsAffected > 0)
            JOptionPane.showMessageDialog(null, "Added Student Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "could not add student","Failed",JOptionPane.WARNING_MESSAGE);
        }
    }
}
