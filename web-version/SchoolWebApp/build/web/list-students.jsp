<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Search Student</title>
    <link rel="stylesheet" href="list-students.css" />
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
        <div class="search-section">
          <div class="search-selection">
            <label>search by</label>
            <select id="search-by">
              <option>Name</option>
              <option>Admission Number</option>
            </select>
          </div>
          <div class="search-bar">
            <input type="text" value="" />
            <button class="search-button"></button>
          </div>
        </div>
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
                <tr>
                  <td>1</td>
                  <td>Ajmal</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
