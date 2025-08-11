<!DOCTYPE html>
<jsp:useBean id="student" class="model.Student"/>
<%
        java.util.ArrayList al=(java.util.ArrayList)request.getAttribute("students");
    
    %>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Search Student</title>
    <link rel="stylesheet" href="list-students.css?123" />
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
          <h1>LIST STUDENT</h1>
        </div>
        <form class="search-section" action="StudentController.jsp" method="GET">
          <input type="hidden" name="action" value="list"/>
          <div class="search-selection">
            <label>search by</label>
            <select id="search-by" name="option">
              <option>All</option>
              <option value="Class" ${param.option =='Class'?'selected':'' }>Class</option>
              <option value="Place" ${param.option== 'Place'?'selected':''}>Place</option>
            </select>
          </div>
          <div class="search-bar">
            <input type="text" value="${param.inputValue}" name="inputValue" />
            <button class="search-button" type=submit"></button>
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
                 if(al!=null)
                 {
                    for(int i=0;i<al.size();i++)
                      {
                      student=(model.Student)al.get(i);
                      %>
                  
                <tr>
                    <td><%=student.getAdmNum()%></td>
                    <td><%=student.getName()%></td>
                </tr>
                
                <%
                    }
                }
                    %>
                
                
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
