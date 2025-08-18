<% String imageDirectory = request.getContextPath()+"/images/";%> 
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/menu-bar.css"/>
<div class="titlebar">
        <div class="page-name"><span>${pageTitle}</span></div>
        <div class="right-items">
          <div class="notification">
              <a href=""><img src="<%=imageDirectory%>notification.png" alt="notification-icon" /></a>
          </div>
          <div class="login-info"><span>Admin</span><img src="<%=imageDirectory%>user.png" alt="" /></div>
        </div>
</div>