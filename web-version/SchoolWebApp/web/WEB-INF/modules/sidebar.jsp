<% String imageDirectory = request.getContextPath() + "/resources/images/";%>   
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/sidebar.css?v=<%=System.currentTimeMillis()%>">
<div class="sidebar">
    <div class="icon">
        <a href="${pageContext.request.contextPath}/StudentController.jsp?action=${"home"}">
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
            <li class="announcement">
                <label class="icon-label">make announcement</label>
                <Button id="sidebar-announcement-btn"><img src="<%=imageDirectory%>announcement.png" alt="" /></Button>
            </li>
            <li class="notice">
                <label class="icon-label">add events</label>
                <Button id="sidebar-event-btn"><img src="<%=imageDirectory%>add-ev.png" alt="" /></Button>
            </li>
            <li class="notification">
                <label class="icon-label">add notice</label>
                <Button id="sidebar-message-btn"><img src="<%=imageDirectory%>message.png" alt="" /></Button>
            </li>
        </ul>
    </div>
</div>
