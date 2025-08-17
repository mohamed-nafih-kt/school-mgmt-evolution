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
                        <h2 class="count">${totalCount}</h2>
                    </div>
                    <div class="teachers-count">
                        <h3>Total Teachers</h3>
                        <h2 class="count">${teachersCount}</h2>
                    </div>

                    <!-- notice -->
                    <div class="notice">
                        <h2>NOTICE</h2>
                        <div class="notice-container">
                            <% for (int i = 0; i < 10; i++) {%>
                            <div class="notice-content">
                                <div class="index-notice-content-header"><h4>Notice <%= i + 2%></h4> <button>x</button></div>
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
    <script>
        // index notice form
        const addNoticeIcon = document.getElementById('sidebar-message-btn');
        const closeButton = document.getElementById('notice-module-close-button');
        const container = document.getElementById('notice-form-id');

        addNoticeIcon.addEventListener('click', () => {
            console.log("btn clicked");
            container.classList.remove('hide');
        });

        closeButton.addEventListener('click', () => {
            container.classList.add('hide');
        });
</script>
<c:if test="${not empty sessionScope.toastMessage}">
    <script>
        alert("${sessionScope.toastMessage}");
    </script>
    <c:remove var="toastMessage" scope="session"/>
</c:if>
</html>
