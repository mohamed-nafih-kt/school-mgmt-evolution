<jsp:useBean id="obj" class="data.DataProcess"/>
<%
    String  name = request.getParameter("name");
    String clas = request.getParameter("class");
    String place = request.getParameter("place");
    String contact = request.getParameter("contact");
    int res = obj.addStudent(name,clas,place, contact);
    response.sendRedirect("add-student.html");
%>


