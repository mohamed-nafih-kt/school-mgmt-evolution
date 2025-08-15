<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String cssDirectory = request.getContextPath() + "/resources/css/"; %>
<% String imageDirectory = request.getContextPath() + "/resources/images/";%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="<%= cssDirectory%>index2.css?v=<%=System.currentTimeMillis()%>" />
    </head>
    <body>
        <div class="main-content">
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
                        <h2 class="count">9,999</h2>
                    </div>
                    <div class="teachers-count">
                        <h3>Total Teachers</h3>
                        <h2 class="count">999</h2>
                    </div>

                    <!-- notice -->
                    <div class="notice">
                        <h2>NOTICE</h2>
                        <div class="notice-container">
                            <div class="notice-content">
                                <h4>Important</h4>
                                <p>This is the space to add notice</p>
                                <br />
                            </div>
                            <div class="notice-content">
                                <h4>Notice 1</h4>
                                <p>This is the second notice</p>
                                <br />
                            </div>
                            <% for (int i = 0; i < 10; i++) {%>
                            <div class="notice-content">
                                <h4>Notice <%= i + 2%></h4>
                                <p>This is notice is code generated. Lorem ipsum is the which eath serving along</p>
                                <br />
                            </div>
                            <% }%>
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
    </body>
</html>
