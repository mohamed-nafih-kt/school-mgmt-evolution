<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.PreparedStatement" %>
<jsp:useBean id="studentDAO" class="model.StudentDAO"/>
<jsp:useBean id="makeConnection" class="model.MakeConnection" />
<jsp:useBean id="student" class="model.Student" />
<%
    String title = request.getParameter("noticeTitle");
    String content =request.getParameter("noticeMessage");
    int result=0;
    try{
        PreparedStatement ps = makeConnection.setConnection().prepareStatement("INSERT INTO notices(title,content) VALUES('"+title+"','"+content+"');");
        result = ps.executeUpdate();
        System.out.println("added new notice");
    }catch(Exception e){
        System.out.println("couldn't add notice. Error: "+e);
    }
    if(result>0){
        request.getRequestDispatcher("/StudentController.jsp?action=dashboard").forward(request,response);
    }
    else{
    response.getWriter().write("failed");
    }

%>