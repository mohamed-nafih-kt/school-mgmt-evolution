<% String imageDirectory = request.getContextPath() + "/resources/images/";%>   
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/sidebar.css">
<div class="sidebar">
    <div class="icon">
        <a href="">
            <img src="<%=imageDirectory%>icon-education.png" alt="icon-education" />
            <span>School Management</span>
        </a>
    </div>
    <div class="navbar-links">
        <ul>
            <li class="nav-link">
                <a href=""><img src="<%= imageDirectory%>icon-student.png" alt="" /><span>Dashboard</span></a>
            </li>
            <li class="nav-link">
                <a href=""><img src="<%=imageDirectory%>icon-student.png" alt="" /><span>Students</span></a>
            </li>
            <li class="nav-link">
                <a href=""><img src="<%=imageDirectory%>icon-student.png" alt="" /><span>Teachers</span></a>
            </li>
            <li class="nav-link">
                <a href=""><img src="<%=imageDirectory%>icon-student.png" alt="" /><span>Classes</span></a>
            </li>
            <li class="nav-link">
                <a href=""><img src="<%=imageDirectory%>icon-student.png" alt="" /><span>Reports</span></a>
            </li>
        </ul>
    </div>
    <div class="contact">
        <!-- add icon description -->
        <ul>
            <li>
                <a href=""><img src="<%=imageDirectory%>announcement.png" alt="" /></a>
            </li>
            <li>
                <a href=""><img src="<%=imageDirectory%>add-notice.png" alt="" /></a>
            </li>
            <li>
                <a href=""><img src="<%=imageDirectory%>notification-sms.png" alt="" /></a>
            </li>
        </ul>
    </div>
</div>