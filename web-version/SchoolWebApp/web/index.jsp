<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.PreparedStatement, java.sql.ResultSet" %>
<jsp:useBean id="studentDAO" class="dao.StudentDAO"/>
<jsp:useBean id="teacherDAO" class="dao.TeacherDAO"/>
<jsp:useBean id="makeConnection" class="connections.MakeConnection"/>
<%
    String cssDirectory = request.getContextPath() + "/css/";
    String imageDirectory = request.getContextPath() + "/images/";
    int totalStudents = studentDAO.getTotalStudents();
    int totalTeachers = teacherDAO.getTeachersCount();
    System.out.println("students = " + totalStudents + "| Teachers =" + totalTeachers);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="<%= cssDirectory%>index.css?v=<%=System.currentTimeMillis()%>" />
        
    </head>
    <body>

        <div class="main-content">
            <jsp:include page="WEB-INF/modules/notice-form.jsp"/>
            <!-- module - sidebar -->
            <jsp:include page="/WEB-INF/modules/sidebar.jsp" />

            <!-- module - title bar -->
            <jsp:include page="/WEB-INF/modules/menu-bar.jsp" />

            <!-- module - contents -->
            <div class="contents">
                <div class="contents-grid">
                    <div class="analysis">
                        <div class="mark-analysis">
                            <img src="<%=imageDirectory%>bar-graph.png" alt="mark analysis" />
                        </div>
                        <div class="class-distribution">
                            <img src="<%=imageDirectory%>pie-chart.jpg" alt="class distribution" />
                        </div>
                    </div>

                    <!-- counts -->
                    <div class="students-count">
                        <h3>Total Students</h3>
                        <h2 class="count"><%=totalStudents%></h2>
                    </div>
                    <div class="teachers-count">
                        <h3>Total Teachers</h3>
                        <h2 class="count">${teachersCount}</h2>
                    </div>

                    <!-- notice -->
                    <div class="notice">
                        <h2>NOTICE</h2>
                        <div class="notice-container">
                            <%
                                try (
                                        PreparedStatement ps = makeConnection.setConnection().prepareStatement("SELECT * FROM notices"); ResultSet rs = ps.executeQuery();) {
                                    while (rs.next()) {
                                        int id = rs.getInt("id");
                                        String title = rs.getString("title");
                                        String content = rs.getString("content");
                            %>
                            <div class="notice-content">
                                <div class="index-notice-content-header"><h4><%= title%></h4> <button onclick="deleteNotice(<%=id%>, this)">x</button></div>
                                <p><%= content%></p>
                                <br />
                            </div>       
                            <%
                                    }
                                } catch (Exception e) {
                                    System.out.println("could'nt fetch data");
                                }
                            %>


                        </div>
                    </div>

                    <div class="events">
                        <h2>EVENTS</h2>
                        <div class="event-container">
                            <% for (int i = 0; i < 10; i++) {%>
                            <div class="event-content">
                                <div class="event-title">
                                    <img src="<%=imageDirectory%>time-line.png" alt="event icon"/>
                                    <h4>Event <%=i + 2%></h4>
                                </div>
                                <p>This is notice is code generated. Lorem ipsum is the which eath serving along</p>
                            </div>
                            <% }%>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script>

        </script>
    </body>
</html>
