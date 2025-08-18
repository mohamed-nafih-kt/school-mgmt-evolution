<% String imageDirectory = request.getContextPath() + "/images/";%>   
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/sidebar.css?v=<%=System.currentTimeMillis()%>">
<div class="sidebar">
    <div class="icon">
        <a href="${pageContext.request.contextPath}/index.jsp">
            <img src="<%=imageDirectory%>icon-education.png" alt="icon-education" />
            <span>School Management</span>
        </a>
    </div>
    <div class="navbar-links">
        <ul>
            <li class="nav-link">
                <a href="${pageContext.request.contextPath}/index.jsp"><img src="<%= imageDirectory%>icon-student.png" alt="" /><span>Dashboard</span></a>
            </li>
            <li class="nav-link">
                <a href="${pageContext.request.contextPath}/students"><img src="<%=imageDirectory%>icon-student.png" alt="" /><span>Students</span></a>
            </li>
            <li class="nav-link">
                <a href="${pageContext.request.contextPath}/teachers"><img src="<%=imageDirectory%>icon-student.png" alt="" /><span>Teachers</span></a>
            </li>
<!--            <li class="nav-link">
                <a href=""><img src="<%=imageDirectory%>icon-student.png" alt="" /><span>Classes</span></a>
            </li>
            <li class="nav-link">
                <a href=""><img src="<%=imageDirectory%>icon-student.png" alt="" /><span>Reports</span></a>
            </li>-->
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
<script>
    //  notice form
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