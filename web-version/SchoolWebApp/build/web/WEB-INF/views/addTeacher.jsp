<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = " java.sql.ResultSet, java.util.ArrayList" %>
<%@page import="model.Teacher" %>

<%
    String cssDirectory = request.getContextPath() + "/css/";
    String imageDirectory = request.getContextPath() + "/images/";

    Teacher teacher = (Teacher) request.getAttribute("teacher");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add teacher</title>
        <link rel="stylesheet" href="<%= cssDirectory%>add-teacher.css?v=<%=System.currentTimeMillis()%>" />
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
                <div id="register" class="register-teacher-section">
                    <h1>Teacher Registration</h1>
                    <form action="AddTeacherServlet" class="teacher-registration-form" method="post">
                        <div class="personal-information">
                            <h3>Personal Information</h3>
                            <div class="teacher-form-item">
                                <label for="teacherId">Teacher ID</label>
                                <input type="text" id="teacherId" name="teacherId" >
                            </div>

                            <div class="teacher-form-item">
                                <label for="name">Name</label>
                                <input type="text" id="name" name="name" 
                                      >
                            </div>
                            <div class="teacher-form-item">
                                <label for="classAssigned">Class Assigned</label>
                                <input type="text" id="classAssigned" name="classAssigned" 
                                       >
                            </div>
                        </div>

                        <div class="contact-information">
                            <h3>Contact Information</h3>
                            <div class="teacher-form-item">
                                <label for="email">Email</label>
                                <input type="text" id="email" name="email" 
                                       >
                            </div>

                        </div>
                        <div class="teacher-register-actions">
                            <button type="reset" class="cancel-button">reset</button>
                            <button type="submit">add teacher</button>
                        </div>
                    </form>

                </div>
            </div>
    </body>
    <script>

    </script>
</html>
