<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>Add Student</title>
    <link rel="stylesheet" href="add-student.css" />
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
    <div class="container">
      <h2>Add Student</h2>
      
      <form class="student-form" action="StudentController.jsp" method="post">
        <!-- form submitted as action: add -->
        <input type="hidden" name="action" value="add" />

        <label for="adm_num">Admission Number</label>
        <input
          type="text"
          id="adm_num"
          name="adm_num"
          placeholder="Auto Generated"
          readonly
        />
        <label for="name">Name</label>
        <input type="text" id="name" name="name" required />

        <label for="class">Class</label>
        <input type="text" id="class" name="class" required />

        <label for="place">Place</label>
        <input type="text" id="place" name="place" required />

        <label for="contact">Contact</label>
        <input type="text" id="contact" name="contact" required />

        <button type="submit">Add Student</button>
      </form>
    </div>
  </body>
</html>
