<jsp:useBean id="studentDAO" class="model.StudentDAO"/>
<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>
<%@ page import="model.StudentDAO" %>

<%
    String action =request.getParameter("action"); 
    
    if (action == null) {
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing action parameter");
        return;
    }
    switch(action){
        case "add": {
            String  name = request.getParameter("name");
            String clas = request.getParameter("class");
            String place = request.getParameter("place");
            String contact = request.getParameter("contact");
            int res = studentDAO.addStudent(name,clas,place, contact);
            response.sendRedirect("add-student.html");
            break; }
        case "remove":{
            String admNum = request.getParameter("adm_num");
            if (admNum == null || admNum.isEmpty()) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing admission number");
                return;
            }
            try {
                int removeResult = studentDAO.removeStudents(Integer.parseInt(admNum));
                response.sendRedirect("list-students.jsp");
            } catch (NumberFormatException e) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid admission number format");
            }
            break;}
        case "edit": {
            // Edit Student: update details based on adm_num (primary key)
            String admNum = request.getParameter("adm_num");
            String name = request.getParameter("name");
            String clas = request.getParameter("class");
            String place = request.getParameter("place");
            String contact = request.getParameter("contact");

            if (admNum == null || admNum.isEmpty()) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing admission number");
                return;
            }

            try {
                int admNumber = Integer.parseInt(admNum);
                int updateResult = studentDAO.editStudentDetails(admNumber, name, clas, place, contact);
                response.sendRedirect("list-students.jsp");
            } catch (NumberFormatException e) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid admission number format");
            }
            break;
        }
        case "get": {
            // Fetch single student details by adm_num or by filters (name/place)
            String admNum = request.getParameter("adm_num");
            String name = request.getParameter("name");
            String place = request.getParameter("place");

            Student student = null;

            if (admNum != null && !admNum.isEmpty()) {
                try {
                    int admNumber = Integer.parseInt(admNum);
                    student = studentDAO.getStudentDetails(admNumber);
                } catch (NumberFormatException e) {
                    response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid admission number format");
                    return;
                }
            } else if (name != null && !name.isEmpty()) {
                student = studentDAO.getStudentDetailsByName(name);
            } else if (place != null && !place.isEmpty()) {
                student = studentDAO.getStudentDetailsByPlace(place);
            } else {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing search parameter");
                return;
            }

            if (student == null) {
                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Student not found");
                return;
            }

            request.setAttribute("student", student);
            request.getRequestDispatcher("view-student.jsp").forward(request, response);
            break;
        }

        case "list": {
            // List students optionally filtered by place or name
            String place = request.getParameter("place");
            String name = request.getParameter("name");
            List<Student> students;

            if (place != null && !place.isEmpty()) {
                students = studentDAO.listStudentsByPlace(place);
            } else if (name != null && !name.isEmpty()) {
                students = studentDAO.listStudentsByName(name);
            } else {
                students = studentDAO.listAllStudents();
            }

            request.setAttribute("students", students);
            request.getRequestDispatcher("list-students.jsp").forward(request, response);
            break;
        }

        case "totalCount": {
            // Get total count of students
            int totalCount = studentDAO.getTotalCount();
            request.setAttribute("totalCount", totalCount);
            request.getRequestDispatcher("student-stats.jsp").forward(request, response);
            break;
        }
        default: 
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Unknown action: " + action);
            break;
                    
    }
        
%>