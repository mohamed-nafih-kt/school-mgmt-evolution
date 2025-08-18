<!-- notice form -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/notice-form.css?v=<%=System.currentTimeMillis()%>">
<div class="notice-module-main-content hide" id="notice-form-id">
    <div class="notice-form-container" id="notice-form">
        <div class="close"><button id="notice-module-close-button">X</button></div>
        <h2>NOTICE</h2>
        <form method="POST" action="${pageContext.request.contextPath}/actions/propAction.jsp" class="notice-form" >
            <div class="title">
                <label for="noticeTitle">Title</label>
                <input type="text" name="noticeTitle"/>
            </div>
            <div class="content">
                <label>Description</label>
                <textarea name="noticeMessage" rows="20" cols="40"></textarea>
            </div>
            <div class="notice-module-submit-section">
                <button type="reset">reset</button><button type="submit">add notice</button>
            </div>
        </form>
    </div>
</div>

