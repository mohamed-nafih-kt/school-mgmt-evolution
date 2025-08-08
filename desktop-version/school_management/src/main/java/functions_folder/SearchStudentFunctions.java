package functions_folder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SearchStudentFunctions {
    
    public ArrayList<Student> searchStudentByName(String name){
        ArrayList<Student> students = new ArrayList<>();
        try(
            Connection con = MakeConnection.setConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE LOWER(name) LIKE '%"+name.toLowerCase()+"%'");
            ResultSet rs = ps.executeQuery();
            ){
                while(rs.next()){
                Student s = new Student(
                rs.getInt("adm_num"),
                rs.getString("name"),
                rs.getString("class"),
                rs.getString("place"),
                rs.getString("contact")
                );
                students.add(s);
                } 
                
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return students;
    }
    
        public ArrayList<Student> searchStudentById(String adm){
        ArrayList<Student> students = new ArrayList<>();
        int id = Integer.parseInt(adm);
        try(
            Connection con = MakeConnection.setConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE adm_num = "+id);
            ResultSet rs = ps.executeQuery();
            ){
                if(rs.next()){
                Student s = new Student(
                rs.getInt("adm_num"),
                rs.getString("name"),
                rs.getString("class"),
                rs.getString("place"),
                rs.getString("contact")
                );
                students.add(s);
                }else JOptionPane.showMessageDialog(null, "No student Found","No Data",JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return students;
    }

}
