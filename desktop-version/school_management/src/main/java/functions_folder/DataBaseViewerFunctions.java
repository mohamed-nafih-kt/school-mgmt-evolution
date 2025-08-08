/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions_folder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author az
 */
public class DataBaseViewerFunctions {
  
    public String setView(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID-NAME-CLASS-CONTACT-PLACE \n");
        sb.append("--------------------------- \n");

        try(
            Connection con = MakeConnection.setConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM students");
            ResultSet rs = ps.executeQuery();
                ){
            while(rs.next()){
                sb.append(rs.getInt("adm_num")+"-");
                sb.append(rs.getString("name")+"-");
                sb.append(rs.getString("class")+"-");
                sb.append(rs.getString("contact")+"-");
                sb.append(rs.getString("place"));
                sb.append(" \n");
            }
            
        }catch(Exception e){
            System.out.println("data base viewer error: "+e.getMessage());
        }
        return sb.toString();
    }
}
