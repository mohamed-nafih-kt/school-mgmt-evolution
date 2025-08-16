<!DOCTYPE html>
<html>
  <head>
    <title>School-Web-App</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="index-styles.css?v=17w1" />
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
          <li><a href="StudentController.jsp?action=dashboard">New Dashboard</a></li>
        </ul>
      </nav>
    </header>
    <section>
      <div class="container">
        <div class="student-count">
          <h2 id="total-student-count">${totalCount}</h2>
        </div>
        <h1>TOTAL STUDENTS</h1>
      </div>
      <div class="pau">
        <div class="pau-content">
          <h3>Present</h3>
          <p>${present}</p>
        </div>
        <div class="pau-content">
          <h3>Absent</h3>
          <p>${absent}</p>
        </div>
        <div class="pau-content">
          <h3>Unmarked</h3>
          <p>${unmarked}</p>
        </div>
      </div>
    </section>
  </body>
</html>
