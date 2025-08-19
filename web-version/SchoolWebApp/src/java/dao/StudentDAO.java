// This is called MODEL
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import connections.MakeConnection;
import model.Student;

public class StudentDAO {

    static MakeConnection mc = new MakeConnection();

    // index page functions
    public int getTotalStudents() {
        try (
            PreparedStatement ps = mc.setConnection().prepareStatement("SELECT COUNT(*) FROM students"); 
            ResultSet rs = ps.executeQuery();
            ){
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public int[] getAttendance() {
        int[] arr = new int[3];
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = mc.setConnection().prepareStatement("SELECT COUNT(*) FROM attendance WHERE status=1");
            rs = ps.executeQuery();
            int i = 0;
            rs.next();
            arr[i] = rs.getInt(1);

            ps = mc.setConnection().prepareStatement("SELECT COUNT(*) FROM attendance WHERE status=0");
            rs = ps.executeQuery();
            i++;
            rs.next();
            arr[i] = rs.getInt(1);

            ps = mc.setConnection().prepareStatement("SELECT COUNT(*) FROM students AS s LEFT JOIN attendance AS a ON s.adm_num = a.adm_num WHERE a.adm_num IS NULL");
            rs = ps.executeQuery();
            i++;
            rs.next();
            arr[i] = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("couldn't update attendance");
        }
        return arr;
    }

    //add students functions
    public int addStudent(String name, String clas, String place, String contact) {
        try (
                PreparedStatement ps = mc.setConnection().prepareStatement("INSERT INTO students (name,class,place,contact) VALUES ('" + name + "','" + clas + "','" + place + "','" + contact + "')");) {
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("added students");
            } else {
                System.out.println("couldnt add student");
            }

            return rowsAffected;
        } catch (Exception ex) {
            System.out.println("Exception caught: " + ex.getMessage());
            return 0;
        }
    }

    // new functions based on Student (entity) & studentAction (controller) | MVC architecture
    public int removeStudent(int admNum) {
        try (
                PreparedStatement ps = mc.setConnection().prepareStatement("DELETE FROM students WHERE adm_num = " + admNum);) {
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("removed students successfully");
            } else {
                System.out.println("failed to remove student");
            }
            return rowsAffected;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    // list student functions
    public ArrayList<Student> getListByClass(String cls) {
        ArrayList<Student> studentList = new ArrayList();

        try (
                Connection con = mc.setConnection(); PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE class LIKE '" + cls + "'"); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Student s = new Student();
                s.setAdmNum(rs.getInt("adm_num"));
                s.setName(rs.getString("name"));
                s.setClas(rs.getString("class"));
                s.setContact(rs.getString("contact"));
                s.setPlace(rs.getString("place"));
                studentList.add(s);
            }
            System.out.println("fetched data by place");

        } catch (Exception e) {
            System.out.println("Error: getListByClass");

        }
        return studentList;
    }

    public ArrayList<Student> getListByPlace(String place) {
        ArrayList<Student> studentList = new ArrayList();

        try (
                Connection con = mc.setConnection(); PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE LOWER(place) LIKE '" + place.toLowerCase() + "%' OR '%" + place.toLowerCase() + "'"); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Student s = new Student();
                s.setAdmNum(rs.getInt("adm_num"));
                s.setName(rs.getString("name"));
                s.setClas(rs.getString("class"));
                s.setContact(rs.getString("contact"));
                s.setPlace(rs.getString("place"));
                studentList.add(s);
            }
            System.out.println("fetched data by place");

        } catch (Exception e) {
            System.out.println("Error: getListByPlace");

        }
        return studentList;
    }

    public ArrayList<Student> getAllList() {
        ArrayList<Student> studentList = new ArrayList();
        try (
                Connection con = mc.setConnection(); PreparedStatement ps = con.prepareStatement("SELECT * FROM students"); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Student s = new Student();
                s.setAdmNum(rs.getInt("adm_num"));
                s.setName(rs.getString("name"));
                s.setClas(rs.getString("class"));
                s.setContact(rs.getString("contact"));
                s.setPlace(rs.getString("place"));
                studentList.add(s);
            }
        } catch (Exception e) {
            System.out.println("Error: getAllList");
        }
        return studentList;
    }

    //search students functions
    public ArrayList<Student> searchStudentByName(String name) {
        ArrayList<Student> students = new ArrayList<>();

        try (
                Connection con = mc.setConnection(); PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE LOWER(name) LIKE '%" + name.toLowerCase() + "%'"); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Student s = new Student();
                s.setAdmNum(rs.getInt("adm_num"));
                s.setName(rs.getString("name"));
                s.setClas(rs.getString("class"));
                s.setContact(rs.getString("contact"));
                s.setPlace(rs.getString("place"));
                students.add(s);
            }
            System.out.println("fetched data by place");

        } catch (Exception e) {
            System.out.println("Error: getListByPlace");

        }
        return students;
    }

    public ArrayList<Student> searchStudentById(String adm) {
        ArrayList<Student> students = new ArrayList<>();
        Student s = new Student();
        int id = Integer.parseInt(adm);
        try (
                Connection con = mc.setConnection(); PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE adm_num = " + id); ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                s.setAdmNum(rs.getInt("adm_num"));
                s.setName(rs.getString("name"));
                s.setClas(rs.getString("class"));
                s.setContact(rs.getString("contact"));
                s.setPlace(rs.getString("place"));
                students.add(s);
            }
            System.out.println("fetched data by place");

        } catch (Exception e) {
            System.out.println("Error: getListByPlace");

        }
        return students;
    }

    //edit student function
    public int editStudentDetails(int admNun, String name, String cls, String place, String contact) {
        return 0;
    }

}
