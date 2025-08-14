<!DOCTYPE html>
<jsp:useBean id="student" class="model.Student"/>
<% java.util.ArrayList al = (java.util.ArrayList) request.getAttribute("students"); %>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Search Student</title>
    <link rel="stylesheet" href="search-student.css?1" />
    <script>
        function setContentSearch(admNum){
            var xhr = new XMLHttpRequest();
            xhr.open("GET","<%= request.getContextPath() %>/setContentSearchAction.jsp?adm="+ encodeURIComponent(admNum),true);
//            xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
            xhr.onreadystatechange = function(){
                console.log(xhr.readyState);
                console.log(xhr.status);
                if(xhr.readyState === 4 && xhr.status === 200){
                    if(xhr.responseText.trim() === "success"){
                        alert("student is ajmal");
                        document.getElementById("adm-field").textContent = "change";
                    }
            }
        };
        xhr.send();
    }
    </script>
  </head>
  <body>
    <header>
      <nav class="navbar">
        <a href="StudentController.jsp?action=home" class="navbar-brand">School Management</a>
        <ul class="navbar-links">
          <li>
            <span>Manage Students &#9660;</span>
            <ul>
              <li><a href="add-student.jsp">Add</a></li>
              <li><a href="remove-student.jsp">Remove</a></li>
            </ul>
          </li>
          <li><a href="search-student.jsp">Search Student</a></li>
          <li><a href="list-students.jsp">List Students</a></li>
        </ul>
      </nav>
    </header>
    <section>
      <div class="container">
        <div class="header">
          <h1>SEARCH STUDENT</h1>
        </div>
        <form class="search-section" action="StudentController.jsp" method="GET">
            <input name="action" value="search"type="hidden"/>
          <div class="search-selection">
            <label>search by</label>
            <select id="search-by" name="option">
              <option values="Name" ${param["search-by"] == "Name"? 'selected':''}>Name</option>
              <option value="Admission Number" ${param["search-by"] == "Admission Number"? 'selected':''}>Admission Number</option>
            </select>
          </div>
          <div class="search-bar">
            <input type="text" value="${param.inputValue}" name="inputValue"/>
            <button class="search-button" type="submit"></button>
          </div>
        </form>
        <div class="main-content">
          <div class="search-results">
            <p>Search Results</p>
            <table>
              <thead>
                <tr>
                  <th>Adm no.</th>
                  <th>Name</th>
                </tr>
              </thead>
              <tbody>
                <% 
                   if(al!=null){ 
                    for(int i = 0;i< al.size();i++ ){ 
                    student =(model.Student) al.get(i);%>
                <tr onclick = "setContentSearch('<%= student.getAdmNum() %>')">
                    <td> <%= student.getAdmNum()%> </td>
                    <td> <%= student.getName() %> </td>
                </tr>
                <% }
                        } %> 
              </tbody>
            </table>
          </div>
          <div class="student-details">
            <div class="detail-group">
              <label>Name</label>
              <input type="text" value="${students[0].name}" Id="name-field" readonly />
            </div>
            <div class="detail-group-row">
              <div class="detail-group small">
                <label>Adm No.</label>
                <input type="text" value="${students[0].admNum}" Id="adm-field" readonly />
              </div>
              <div class="detail-group small">
                <label>Class</label>
                <input type="text"  value="${students[0].clas}" Id="cls-field" readonly />
              </div>
            </div>
            <div class="detail-group">
              <label>Place</label>
              <input type="text" value="${students[0].place}" Id="place-field" readonly />
            </div>
            <div class="detail-group">
              <label>Contact</label>
              <input type="text" value="${students[0].contact}" Id="contact-field" readonly />
            </div>
          </div>
          <div class="grid-item-3rd-column">
            <div class="profile-pic-container">
              <img
                src="./resources/icons8-customer-100.png"
                alt="profile photo"
              />
            </div>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
