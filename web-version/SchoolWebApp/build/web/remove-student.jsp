<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Search Student</title>
    <link rel="stylesheet" href="remove-student.css" />
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
    <%
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (errorMessage != null) {
    %>
        <div style=" display:flex; width:100%; color:red; font-size:1.5rem; font-weight:bold; justify-content: center; position:fixed;">
            <%= errorMessage %>
        </div>
    <%
        }
        String success = request.getParameter("success");
        if ("1".equals(success)) {
    %>
        <div style="display:flex; width:100%; color:green; font-size:1.5rem; font-weight:bold; justify-content: center; position:fixed;">
            Deleted Student successfully.
        </div>
    <%
        }
    %>
    <section>
      <div class="container">
        <div class="header">
          <h1>REMOVE STUDENT</h1>
        </div>
        <div class="search-section">
          <div class="search-selection">
            <label>search by</label>
            <label class="search-by">Admission Number</label>
          </div>
          <div class="search-bar">
            <form class="search-bar" action="StudentController.jsp" method="GET">
                <input type="hidden" name="action" value="searchToRemove" />
                <input type="text" value="" name="admNum"/>
                <button class="search-button" type="submit"></button>
            </form>
          </div>
        </div>
        <div class="main-content">
          <div class="student-details">
            <div class="detail-group">
              <label>Name</label>
              <input type="text" value="${Student.name}" readonly />
            </div>
            <div class="detail-group-row">
              <div class="detail-group small">
                <label>Adm No.</label>
                <input type="text" value="${Student.admNum}"  readonly />
              </div>
              <div class="detail-group small">
                <label>Class</label>
                <input type="text" value="${Student.clas}" readonly />
              </div>
            </div>
            <div class="detail-group">
              <label>Place</label>
              <input type="text" value="${Student.place}" readonly />
            </div>
            <div class="detail-group">
              <label>Contact</label>
              <input type="text" value="${Student.contact}" readonly />
            </div>
          </div>
          <div class="grid-item-2nd-column">
            <div class="profile-pic-container">
              <img
                src="./resources/icons8-customer-100.png"
                alt="profile photo"
              />
            </div>
          </div>
          <div class="disclaimer">
            <h4>Disclaimer</h4>
            <p>
              The student has been removed from the system in accordance with
              institutional policies. All actions have been taken based on the
              information available to the administration at the time of
              removal. Under substantiated by verifiable documentation, if the
              removal of the student from the system is found to be an error,
              the institution and the Student Information Systems (SIS)
              Administrator will be held accountable.
            </p>
            <form  class="confirm" action="StudentController.jsp" method="GET">
              <div>
                <input type="hidden" name="action" value="remove" />
                <input type="hidden" name="admNum" value="${Student.admNum}" />
                <input
                  type="checkbox"
                  id="newsletter"
                  name="newsletter"
                  value="yes"
                />
                <label for="newsletter">Confirm</label>
              </div>
              <button type="submit">Remove</button>
            </form>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
