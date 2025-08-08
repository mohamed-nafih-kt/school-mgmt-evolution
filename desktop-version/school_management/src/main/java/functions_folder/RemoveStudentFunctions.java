package functions_folder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RemoveStudentFunctions {
    
    public ArrayList getStudentDetails(String adm){
        ArrayList<String> results = new ArrayList<>();
        int a = Integer.parseInt(adm);
        try(
            Connection con = MakeConnection.setConnection();            
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE adm_num = "+a);
            ResultSet rs = ps.executeQuery();
        ){
            while(rs.next()){
                results.add(rs.getString("adm_num"));
                results.add(rs.getString("name"));
                results.add(rs.getString("class"));
                results.add(rs.getString("place"));
                results.add(rs.getString("contact"));
            }
            System.out.println("successfully fetched");
            return results;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void deleteStudent(String text) {
       int a = Integer.parseInt(text);
       try(
            Connection con = MakeConnection.setConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE adm_num = "+a);
               ){
            int rowsAffected = ps.executeUpdate();        
            if (rowsAffected > 0)
                JOptionPane.showMessageDialog(null, "Removed Student Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                     
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    
}
