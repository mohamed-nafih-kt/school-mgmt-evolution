package functions_folder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListStudentFunctions {

    public ArrayList<Student> getListByClass(String cls) {
               ArrayList<Student> studentList = new ArrayList();
        try(
            Connection con = MakeConnection.setConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE class LIKE '"+cls+"'");
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
                studentList.add(s);
            }
            System.out.println("fetched data by class");                    
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Couldn't fetch data","ERROR",JOptionPane.ERROR_MESSAGE);
        
            }
        return studentList;
    }

    public ArrayList<Student> getListByPlace(String place) {
        ArrayList<Student> studentList = new ArrayList();
        try(
            Connection con = MakeConnection.setConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE LOWER(place) LIKE '%"+place.toLowerCase()+"%'");
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
                studentList.add(s);
            }
            System.out.println("fetched data by place");  
        
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Couldn't fetch data","ERROR",JOptionPane.ERROR_MESSAGE);
        
            }
        return studentList;
    }

    public ArrayList<Student> getAllList() {
        ArrayList<Student> studentList = new ArrayList();
        try(
            Connection con = MakeConnection.setConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students");
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
                studentList.add(s);
            }
            
        
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Couldn't fetch data","ERROR",JOptionPane.ERROR_MESSAGE);
        
            }
        return studentList;
    }
    
}
