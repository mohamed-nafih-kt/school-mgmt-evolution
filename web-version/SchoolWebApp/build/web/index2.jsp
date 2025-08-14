<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String cssDirectory= request.getContextPath()+"/resources/css/"; %>
<% String imageDirectory = request.getContextPath()+"/WEB-INF/resources/images/";%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="<%= cssDirectory%>index2.css" />
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
                <div class="mark-analysis"></div>
                <div class="class-distribution"></div>
              </div>
              <div class="students-count"></div>
              <div class="teachers-count"></div>
              <div class="notice"></div>
              <div class="events"></div>
            </div>
        </div>
        </div>
    </body>
</html>
