<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.PreparedStatement, java.sql.ResultSet, java.util.ArrayList" %>
<%@page import="model.Student" %>
<%
    String cssDirectory = request.getContextPath() + "/css/";
    String imageDirectory = request.getContextPath() + "/images/";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="<%= cssDirectory%>students.css?v=<%=System.currentTimeMillis()%>" />
    </head>
    <body>
        <div class="main-content">
            <!-- module - notice-form -->
            <jsp:include page="/WEB-INF/modules/notice-form.jsp" />
            <!-- module - sidebar -->
            <jsp:include page="/WEB-INF/modules/sidebar.jsp" />

            <!-- module - title bar -->
            <jsp:include page="/WEB-INF/modules/menu-bar.jsp" />

            <!-- module - contents -->
            <div class="contents">
                <div class="contents-container active" id="info">
                    <div class="add-student-section">
                        <a href="#register" id="toggleRegister">Register Student</a>
                    </div>
                    <div class="search-field-section">
                        <div class="search-bar">
                            <img src="<%=imageDirectory%>/search-icon.png" alt="">
                            <input type="text" placeholder="Search Student" id="searchInput" />
                        </div>

                        <div class="search-filter">
                            <label>Filters</label>
                            <select name="filters" id="filters" size="1">
                                <option value="name">Name</option>
                                <option value="class">Class</option>
                                <option value="place">Place</option>
                            </select>
                        </div>
                    </div>
                    <div class="student-list-section">
                        <div class="table-container">
                            <table class="student-table" id="studentTable">
                                <colgroup>
                                    <col style="width: 50px;"> 
                                    <col style="width: auto;"> 
                                    <col style="width: auto;"> 
                                    <col style="width: auto;"> 
                                    <col style="width: auto;"> 
                                    <col style="width: 100px;">  
                                </colgroup>
                                <thead>
                                    <tr class="student-table-list">
                                        <th>Id</th>
                                        <th>Name</th>
                                        <th>Class</th>
                                        <th>Contact</th>
                                        <th>Place</th>
                                        <th> </th>
                                    </tr>
                                </thead>
                                <tbody id="studentTableBody">
                                    <%
                                        ArrayList<Student> studentsList = (ArrayList) request.getAttribute("studentsList");
                                        if (studentsList != null) {
                                            for (Student student : studentsList) {
                                    %>
                                    <tr>
                                        <td><%= student.getAdmNum()%></td>
                                        <td><%= student.getName()%></td>
                                        <td><%= student.getClas()%></td>
                                        <td><%= student.getContact()%></td>
                                        <td><%= student.getPlace()%></td>
                                        <td>
                                            <img src="<%= imageDirectory%>/edit.png" alt="edit" onclick="updateStudent(<%= student.getAdmNum()%>)"/>
                                            <img src="<%= imageDirectory%>/delete.png" alt="delete" onclick="deleteStudent(<%= student.getAdmNum()%>, this)"/>
                                        </td>
                                    </tr>
                                    <% }
                                    } else {
                                    %>
                                    <tr>
                                        <td colspan="5">No students found.</td>
                                    </tr>
                                    <%
                                        }
                                    %>

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

                <!-- student registration -->
                <div id="register" class="register-student-section">
                    <h1>Student Registration</h1>
                    <form action="addStudent" class="student-registration-form" method="post">
                        <div class="personal-information">
                            <h3>Personal Information</h3>
                            <div class="student-form-item">
                                <label for="">Admission Number</label>
                                <input type="text" placeholder="auto generated" class="noclick" readonly>
                            </div>
                            <div class="student-form-item">
                                <label for="">Name</label>
                                <input type="text" name="name"/>
                            </div>
                            <div class="student-form-item">
                                <label for="">Class</label>
                                <input type="text" name="cls"/>
                            </div>
                        </div>
                        <div class="contact-information">
                            <h3>Contact Information</h3>
                            <div class="student-form-item">
                                <label for="">Phone Number</label>
                                <input type="text" placeholder="+91-xxxxxxxxxx" name="phone"/>
                            </div>
                            <div class="student-form-item">
                                <label for="">Place</label>
                                <input type="text" name="place"/>
                            </div>
                        </div>
                        <div class="student-register-actions">
                            <a href="#info" id="toggleInfo">Cancel</a>
                            <button type="submit">Submit</button>
                        </div>
                    </form>

                </div>
            </div>
    </body>
    <!-- setting students table -->
    <script>

        const searchInput = document.getElementById("searchInput");
        const filterSelect = document.getElementById("filters");
        const tableBody = document.getElementById("studentTableBody");

        function updateTable(students) {
            tableBody.innerHTML = "";
            if (students.length === 0) {
                tableBody.innerHTML = "<tr><td colspan='6'>No results found</td></tr>";
                return;
            }

            students.forEach(student => {
                const row = document.createElement("tr");
                row.innerHTML = `                
                <td>\${student.admNum}</td>
                <td>\${student.name}</td>
                <td>\${student.clas}</td>
                <td>\${student.contact}</td>
                <td>\${student.place}</td>
                <td>
                    <img src="<%= imageDirectory%>/edit.png" alt="edit" onclick="UpdateStudent(\${student.admNum})"/>
                    <img src="<%= imageDirectory%>/delete.png" alt="delete" onclick="deleteStudent(\${student.admNum}, this)"/>
                </td>
            `;
                tableBody.appendChild(row);
            });
            console.log(tableBody);
        }

        function searchStudents() {
            const keyword = searchInput.value.trim();
            const filter = filterSelect.value;

            const xhr = new XMLHttpRequest();
            xhr.open("POST", "SearchStudent", true);
            xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xhr.onreadystatechange = function () {
                if (xhr.readyState === 4 && xhr.status === 200) {
                    try {
                        const students = JSON.parse(xhr.responseText);
                        updateTable(students);
                    } catch (e) {
                        console.error("Invalid JSON from server:", xhr.responseText);
                    }
                }
            };
            xhr.send("keyword=" + encodeURIComponent(keyword) + "&filter=" + encodeURIComponent(filter));
        }

        searchInput.addEventListener("input", searchStudents);
        filterSelect.addEventListener("change", searchStudents);
    </script>


    <script>
        function deleteStudent(id, row) {
            var xhr = new XMLHttpRequest();
            xhr.open("POST", "DeleteStudent", true);
            xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xhr.onreadystatechange = function () {
                if (xhr.readyState === 4 && xhr.status === 200) {
                    if (xhr.responseText === "success") {
                        row.parentNode.parentNode.remove();
                    } else {
                        alert("couldn't remove student");
                    }
                }
            };
            xhr.send("id=" + encodeURIComponent(id));
        }
    </script>
    <script>
        function updateStudent(admNum) {
            window.location.href = "UpdateStudent?admNum=" + admNum;
        }
    </script>

    <script>
        document.getElementById('toggleRegister').addEventListener('click', () => {

            const info = document.getElementById('info');
            const register = document.getElementById('register');
            register.classList.add('active');
            info.classList.remove('active');
            register.scrollIntoView({behavior: 'smooth'});
        });

        document.getElementById('toggleInfo').addEventListener('click', () => {
            const info = document.getElementById('info');
            const register = document.getElementById('register');
            register.classList.remove('active');
            info.classList.add('active');
            info.scrollIntoView({behavior: 'smooth'});
        }
        );
    </script>

</html>
