<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.PreparedStatement, java.sql.ResultSet" %>
<jsp:useBean id="studentDAO" class="dao.StudentDAO"/>
<jsp:useBean id="teacherDAO" class="dao.TeacherDAO"/>
<jsp:useBean id="makeConnection" class="connections.MakeConnection"/>
<%
    String cssDirectory = request.getContextPath() + "/css/";
    String imageDirectory = request.getContextPath() + "/images/";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="<%= cssDirectory%>teachers.css?v=<%=System.currentTimeMillis()%>" />
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
                <div class="contents-container">
                    <div class="add-teacher-section">
                        <button onclick="addTeacher()">+ Add Teacher</button>
                    </div>
                    <div class="search-field-section">
                        <div class="search-bar">
                            <img src="<%=imageDirectory%>/search-icon.png" alt="">
                            <input type="text" placeholder="Search Teacher" />
                        </div>

                        <div class="search-filter">
                            <label>Filters</label>
                            <select name="filters" id="filters" size="1">
                                <option>Name</option>
                                <option value="class">Class</option>
                                <option value="Designation">Place</option>
                            </select>
                        </div>
                    </div>
                    <div class="teachers-list-section">
                        <table class="teachers-table">
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>Class</th>
                                    <th>Email</th>
                                </tr>
                            </thead>
                            <tbody>

                            </tbody>
                        </table>

                    </div>
                </div>
            </div>
    </body>
    <script>
                function addTeacher() {
            window.location.href = "AddTeacher";
        }
    </script>
</html>
