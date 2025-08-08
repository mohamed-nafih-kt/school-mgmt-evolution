package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DataProcess {
    public int getTotalStudents(){
        MakeConnection mc = new MakeConnection();
        try(
            PreparedStatement ps = mc.setConnection().prepareStatement("");
                ){
            ResultSet rs = ps.executeQuery();
            if(rs.next())return rs.getInt(1);
            return 0;
    }catch(Exception e){
        System.out.println(e.getMessage());
        return 0;
    }
        
    }
    public int addStudent(String name,String clas,String place, String contact){
        MakeConnection mc = new MakeConnection();
        try(
            
            PreparedStatement ps = mc.setConnection().prepareStatement("INSERT INTO students (name,class,place,contact) VALUES ('"+name+"','"+clas+"','"+place+"','"+contact+"')");            
                ) {
        
            int rowsAffected = ps.executeUpdate();   
            if (rowsAffected > 0){
                System.out.println("success");
            }else System.out.println("success");
            
            return rowsAffected;
        } catch (Exception ex) {
            System.out.println("Exception caught: "+ex.getMessage());
            return 0;
        }
    }

}
