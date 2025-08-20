package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connections.MakeConnection;
import model.Teacher;
import util.HibernateUtil;
import javax.persistence.Query;
import javax.persistence.criteria.*;
 
import org.hibernate.Session;
import org.hibernate.Transaction;



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
    
    	public String addTeacher(Teacher teacher) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			transaction = session.beginTransaction();
			
			session.save(teacher);
			
			transaction.commit();
                        return "success";
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
                        return "failed";
		}
	}
    
}
