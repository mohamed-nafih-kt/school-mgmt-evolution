package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherDAO {

    static MakeConnection mc = new MakeConnection();

    // Based On Action
    public int getTeachersCount() {
        try (
            PreparedStatement ps = mc.setConnection().prepareStatement("SELECT COUNT(*) FROM teachers");) {
            System.out.println("Ok Fetching teachers count..");
            ResultSet rs = ps.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            return count;
        } catch (Exception e) {
            System.out.println("could'nt fetch teacher count. Error: "+e);
            return 0;
        }
    }
}
