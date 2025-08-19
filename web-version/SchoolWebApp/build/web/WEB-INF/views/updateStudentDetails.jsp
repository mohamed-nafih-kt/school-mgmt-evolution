<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.PreparedStatement, java.sql.ResultSet, java.util.ArrayList" %>
<%@page import="model.Student" %>
<%
    String cssDirectory = request.getContextPath() + "/css/";
    String imageDirectory = request.getContextPath() + "/images/";

    Student student = (Student) request.getAttribute("student");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="<%= cssDirectory%>update-student-details.css?v=<%=System.currentTimeMillis()%>" />
    </head>
    <body>
        <div class="main-content">
            <!-- module - notice-form -->
            <jsp:include page="/WEB-INF/modules/notice-form.jsp" />
            <!-- module - sidebar -->
            <jsp:include page="/WEB-INF/modules/sidebar.jsp" />

            <!-- module - title bar -->
            <jsp:include page="/WEB-INF/modules/menu-bar.jsp" />

            <!-- module - contents -->
            <div class="contents">
                <!-- student registration -->
                <div id="register" class="register-student-section">
                    <h1>Student Registration</h1>
                    <form action="UpdateStudentServlet" class="student-registration-form" method="post">
                        <div class="personal-information">
                            <h3>Personal Information</h3>
                            <div class="student-form-item">
                                <label for="admNum">Admission Number</label>
                                <input type="text" id="admNum" name="admNum" 
                                       value="<%= (student != null ? student.getAdmNum() : "")%>" 
                                       class="noclick" readonly>
                            </div>
                            <div class="student-form-item">
                                <label for="name">Name</label>
                                <input type="text" id="name" name="name" 
                                       value="<%= (student != null ? student.getName() : "")%>">
                            </div>
                            <div class="student-form-item">
                                <label for="className">Class</label>
                                <input type="text" id="className" name="cls" 
                                       value="<%= (student != null ? student.getClas() : "")%>">
                            </div>
                        </div>

                        <div class="contact-information">
                            <h3>Contact Information</h3>
                            <div class="student-form-item">
                                <label for="phone">Phone Number</label>
                                <input type="text" id="phone" name="phone" placeholder="+91-xxxxxxxxxx"
                                       value="<%= (student != null ? student.getContact() : "")%>">
                            </div>
                            <div class="student-form-item">
                                <label for="place">Place</label>
                                <input type="text" id="place" name="place" 
                                       value="<%= (student != null ? student.getPlace() : "")%>">
                            </div>
                        </div>
                        <div class="student-register-actions">
                            <button type="reset" class="cancel-button">Reset</button>
                            <button type="submit">Update</button>
                        </div>
                    </form>

                </div>
            </div>
    </body>
    <script>

    </script>
</html>
