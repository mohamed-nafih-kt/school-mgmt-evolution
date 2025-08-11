<!DOCTYPE html>
<jsp:useBean id="student" class="model.Student"/>
<% java.util.ArrayList al = (java.util.ArrayList) request.getAttribute("students"); %>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Search Student</title>
    <link rel="stylesheet" href="search-student.css?12" />
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
                <tr>
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
              <input type="text" value="${students[0].name}"  readonly />
            </div>
            <div class="detail-group-row">
              <div class="detail-group small">
                <label>Adm No.</label>
                <input type="text" value="${students[0].admNum}" readonly />
              </div>
              <div class="detail-group small">
                <label>Class</label>
                <input type="text"  value="${students[0].clas}" readonly />
              </div>
            </div>
            <div class="detail-group">
              <label>Place</label>
              <input type="text" value="${students[0].place}" readonly />
            </div>
            <div class="detail-group">
              <label>Contact</label>
              <input type="text" value="${students[0].contact}" readonly />
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
