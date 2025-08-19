package dao;

import java.sql.*;
import connections.MakeConnection;
import java.util.ArrayList;
import model.Notice;

public class NoticeDAO {
    
    static MakeConnection mc = new MakeConnection();
    
    public ArrayList<Notice> getAllNotice(){
        ArrayList<Notice> noticeList = new ArrayList();
        try(
            PreparedStatement ps = mc.setConnection().prepareStatement("SELECT * FROM notices");
            ResultSet rs = ps.executeQuery();
                ){
            while(rs.next()){
                Notice notice = new Notice();
                notice.setId(rs.getInt("id"));
                notice.setTitle(rs.getString("title"));
                notice.setContent(rs.getString("content"));
                noticeList.add(notice);
            }
        }catch(Exception e){
            System.out.println("error getting notice: "+e);
        }
        return noticeList;
            
    }
    
    public int addNotice(String title,String content){
        return 0;
    }
    
    public String removeNotice(int id){
        int rs =0;
        try(
            PreparedStatement ps = mc.setConnection().prepareStatement("DELETE FROM notices WHERE id ="+id);            
                ){
            rs = ps.executeUpdate();
        }catch(Exception e){
            System.out.println("error delete note: "+e);
        }finally{
            if(rs > 0){
                return "success";
            }else{
                return "failed";
            }
            
        }
    }
    
}
