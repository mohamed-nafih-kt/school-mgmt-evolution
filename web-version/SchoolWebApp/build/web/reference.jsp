<jsp:useBean id="dpObj" class="model.StudentDAO"/>
<jsp:useBean id="student" class="model.Student"/>
<jsp:setProperty name="student" property="*"/>
<%
    int res = dpObj.addStudent(student.getName(),student.getClas(), student.getContact(),student.getPlace());
    response.sendRedirect("add-student.html");
%>



