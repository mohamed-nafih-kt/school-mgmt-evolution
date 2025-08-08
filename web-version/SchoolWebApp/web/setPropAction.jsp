<jsp:useBean id="obj" class="data.DataProcess"/>
<jsp:useBean id="student" class="data.Student"/>

<jsp:setProperty name="student" property="*"/>
<%
    int res = obj.addStudent(student.getUserId(),clas,place, contact);
    response.sendRedirect("add-student.html");
%>


