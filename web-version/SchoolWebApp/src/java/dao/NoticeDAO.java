package dao;

import java.sql.*;

public class NoticeDAO {
    
    static MakeConnection mc = new MakeConnection();
    
    public ArrayList<Notice> getAllNotice(){
        ArrayList<Notice> noticeList;
        try(
            PreparedStatement ps = mc.setConnection().PrepareStatement("SELECT * FROM notices");
            ResultSet rs = ps.executeQuery();
                ){
            while(rs.next()){
                Notice notice = new Notice();
            }
        }
            
    }
    
    public int addNotice(String title,String content){
        
    }
    
    public int removeNotice(int id){
        
    }
    
}
