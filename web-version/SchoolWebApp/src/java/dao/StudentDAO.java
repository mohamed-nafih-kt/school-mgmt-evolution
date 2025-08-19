// This is called MODEL
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import connections.MakeConnection;
import model.Student;
import java.util.logging.Logger;

public class StudentDAO {
    private static final Logger logger = Logger.getLogger(StudentDAO.class.getName());

    static MakeConnection mc = new MakeConnection();

    // index page functions
    public int getTotalStudents() {
        try (
                PreparedStatement ps = mc.setConnection().prepareStatement("SELECT COUNT(*) FROM students"); ResultSet rs = ps.executeQuery();) {
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    //add students functions
    public String addStudent(String name, String clas, String place, String contact) {
        try (
                PreparedStatement ps = mc.setConnection().prepareStatement("INSERT INTO students (name,`class`,place,contact) VALUES ('" + name + "','" + clas + "','" + place + "','" + contact + "')");) {
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                return "success";
            } else {
                return "failed";
            }

        } catch (Exception ex) {
            System.out.println("Exception caught: " + ex.getMessage());
            return "error";
        }
    }

    // new functions based on Student (entity) & studentAction (controller) | MVC architecture
    public String removeStudent(int admNum) {
        try (
                PreparedStatement ps = mc.setConnection().prepareStatement("DELETE FROM students WHERE adm_num = " + admNum);) {
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                return "success";
            } else {
                return "failed";
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "failed";
        }
    }

    // list student functions
    public ArrayList<Student> getAllStudentsList() {
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
    public ArrayList<Student> searchStudents(String filter, String keyword) {

        ArrayList<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";

        System.out.println("SQL: " + sql);
        System.out.println("Filter: " + filter + " | Keyword: " + keyword);

        if (filter != null && keyword != null && !keyword.isEmpty()) {
            sql += " WHERE " + filter + " LIKE ?";
        }

        try (PreparedStatement ps = mc.setConnection().prepareStatement(sql)) {
            if (filter != null && keyword != null && !keyword.isEmpty()) {
                ps.setString(1, "%" + keyword + "%");
            }

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setAdmNum(rs.getInt("adm_num"));
                s.setName(rs.getString("name"));
                s.setClas(rs.getString("class"));
                s.setContact(rs.getString("contact"));
                s.setPlace(rs.getString("place"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Student getStudent(int admNum) {
        Student student = null;
        String query = "SELECT * FROM students WHERE adm_num = ?";
        try (
                Connection conn = mc.setConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, admNum);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    student = new Student();
                    student.setAdmNum(rs.getInt("adm_num"));
                    student.setName(rs.getString("name"));
                    student.setClas(rs.getString("class"));
                    student.setContact(rs.getString("contact"));
                    student.setPlace(rs.getString("place"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error fetching student: " + e.getMessage());
        }

        return student;
    }

    //edit student function
    public int updateStudent(int admNum, String name, String cls, String place, String contact) {
        int rowsAffected = 0;
        String sql = "UPDATE students SET name ='"+name+"', class = '"+cls+"' , place = '"+place+"', contact ='"+contact+"' WHERE adm_num ="+admNum;
        logger.info("SQL query: " + sql);
        System.out.print("SQL query: " + sql);
        try (
            PreparedStatement stmt = mc.setConnection().prepareStatement(sql)) {
            rowsAffected = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); 
        }

        return rowsAffected;
    }

}
