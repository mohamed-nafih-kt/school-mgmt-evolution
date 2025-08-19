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
        <link rel="stylesheet" href="<%= cssDirectory%>students.css?v=<%=System.currentTimeMillis()%>" />
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
                <div class="contents-container active" id="info">
                    <div class="add-student-section">
                        <a href="#register" id="toggleRegister">Register Student</a>
                    </div>
                    <div class="search-field-section">
                        <div class="search-bar">
                            <img src="<%=imageDirectory%>/search-icon.png" alt="">
                            <input type="text" placeholder="Search Student" />
                        </div>

                        <div class="search-filter">
                            <label>Filters</label>
                            <select name="filters" id="filters" size="1">
                                <option>Name</option>
                                <option value="class">Class</option>
                                <option value="place">Place</option>
                            </select>
                        </div>
                    </div>
                    <div class="student-list-section">
                        <table class="student-table">
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Name</th>
                                    <th>Class</th>
                                    <th>Contact</th>
                                    <th>Place</th>
                                    <th> </th>
                                </tr>
                            </thead>
                            <tbody>

                            </tbody>
                        </table>

                    </div>
                </div>
                            
                <!-- student registration -->
                <div id="register" class="register-student-section">
                    <h1>Student Registration</h1>
                    <form action="" class="student-registration-form">
                        <div class="personal-information">
                            <h3>Personal Information</h3>
                            <div class="student-form-item">
                                <label for="">Admission Number</label>
                                <input type="text" placeholder="auto generated" readonly>
                            </div>
                            <div class="student-form-item">
                                <label for="">Name</label>
                                <input type="text">
                            </div>
                            <div class="student-form-item">
                                <label for="">Class</label>
                                <input type="text">
                            </div>
                        </div>
                        <div class="contact-information">
                            <h3>Contact Information</h3>
                            <div class="student-form-item">
                                <label for="">Phone Number</label>
                                <input type="text" placeholder="+91-xxxxxxxxxx">
                            </div>
                            <div class="student-form-item">
                                <label for="">Place</label>
                                <input type="text">
                            </div>
                        </div>
                    </form>
                    <div class="student-register-actions">
                        <a href="#info" id="toggleInfo">Cancel</a>
                        <button type="submit">Submit</button>
                    </div>
                </div>
            </div>
    </body>
    <script>
        document.getElementById('toggleRegister').addEventListener('click', () => {
            
            const info = document.getElementById('info');
            const register = document.getElementById('register');
            register.classList.add('active');
            info.classList.remove('active');
            register.scrollIntoView({behaviour: 'smooth'});
        });

        document.getElementById('toggleInfo').addEventListener('click', () => {
        const info = document.getElementById('info');
        const register = document.getElementById('register');
        register.classList.remove('active');
        info.classList.add('active');
        info.scrollIntoView({behaviour: 'smooth'});
        }
        );

    </script>

</html>
