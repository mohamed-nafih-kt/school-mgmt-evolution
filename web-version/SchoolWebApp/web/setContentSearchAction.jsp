<%@page import="java.util.ArrayList"%>
<jsp:useBean id="studentDAO" class="model.StudentDAO"/>
<jsp:useBean id="student" class="model.Student" />
<%
    String userId = request.getParameter("adm");
    ArrayList<model.Student> students = studentDAO.searchStudentById(userId);
    student = students.get(0);
    if(student.getName().equals("Ajmal")){
        response.getWriter().write("success");
    }else{
    response.getWriter().write("error");
    }
%>