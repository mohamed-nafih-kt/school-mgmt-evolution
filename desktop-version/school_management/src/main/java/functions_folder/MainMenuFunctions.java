/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package functions_folder;

import com.mycompany.school_management.*;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author az
 */
public class MainMenuFunctions {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    void makeConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","password");
            System.out.println("DataBase Connected: main menu loading..");
        } catch (SQLException ex) {
            System.out.println("DataBase Error");
            JOptionPane.showMessageDialog(null,"couldnt connect to database","DB ERROR",JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public int getTotalStudents(){
        try{
            makeConnection();
            ps = con.prepareStatement("SELECT COUNT(*) FROM students");
            rs = ps.executeQuery();
            if(rs.next())return rs.getInt(1);
            return 0;
            
        }catch(SQLException e){
            System.out.println("couldn't fetch student details");
            return 0;
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.getLogger(MainMenuFunctions.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }
    
    public int[] getAttendance(){
        int[] arr = new int[3];
        try{
            makeConnection();
            ps = con.prepareStatement("SELECT COUNT(*) FROM attendance WHERE status=1");
            rs = ps.executeQuery();
            int i =0;
            rs.next();
            arr[i]=rs.getInt(1);

            ps = con.prepareStatement("SELECT COUNT(*) FROM attendance WHERE status=0");
            rs = ps.executeQuery();
            i ++;
            rs.next();
            arr[i]=rs.getInt(1);
            
            ps = con.prepareStatement("SELECT COUNT(*) FROM students AS s LEFT JOIN attendance AS a ON s.adm_num = a.adm_num WHERE a.adm_num IS NULL");
            rs = ps.executeQuery();
            i ++;
            rs.next();
            arr[i]=rs.getInt(1);    
        }catch(SQLException e){
            System.out.println("couldn't update attendance");
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.getLogger(MainMenuFunctions.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            return arr;
        }
    }

    public void openSearchStudent() {
        new SearchStudent().setVisible(true);
    }

    public void openListStudent() {
        new ListStudents().setVisible(true);
    }

    public void openAddStudent(MainMenu mainMenu) {
        new AddStudent(mainMenu).setVisible(true);
    }

    public void openRemoveStudent(MainMenu mainMenu) {
        new RemoveStudents(mainMenu).setVisible(true);
    }
    
    public void showDataBase(){
        new DataBaseViewer().setVisible(true);
    }
    
}

