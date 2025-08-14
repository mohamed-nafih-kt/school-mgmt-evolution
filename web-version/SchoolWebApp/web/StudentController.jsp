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
        case "home":{
            int totalStudents = studentDAO.getTotalStudents();
            int[] arr = studentDAO.getAttendance();
            request.setAttribute("totalCount",totalStudents);
            request.setAttribute("present",arr[0]);
            request.setAttribute("absent",arr[1]);
            request.setAttribute("unmarked",arr[2]);
            request.getRequestDispatcher("index.jsp").forward(request, response);
            System.out.println("fetched total count succesfully. Total students ="+totalStudents);
            return;
        }
        case "add": {
            String  name = request.getParameter("name");
            String clas = request.getParameter("class");
            String place = request.getParameter("place");
            String contact = request.getParameter("contact");
            int res = studentDAO.addStudent(name,clas,place, contact);

            break; }
            
        case "searchToRemove":{
            List<Student> students;
            String admNum = request.getParameter("admNum");
            if (admNum == null || admNum.isEmpty()) {
                request.setAttribute("errorMessage", "Type a Valid Admission Number");
                request.getRequestDispatcher("remove-student.jsp").forward(request, response);
                return;
            }
           else{
                try {
                    students = studentDAO.searchStudentById(admNum);
                    if(students.isEmpty()){
                    request.setAttribute("errorMessage", "No student exist");
                    request.getRequestDispatcher("remove-student.jsp").forward(request, response);
                    return;
                    }
                    Student student = students.get(0);
                    request.setAttribute("Student", student);
                    request.getRequestDispatcher("remove-student.jsp").forward(request, response);
                    
                } catch (NumberFormatException e) {
                    request.setAttribute("errorMessage", "Couldn't fetch results");
                    request.getRequestDispatcher("remove-student.jsp").forward(request, response);
                    return;
                }
            }
            break;
            
        }
        case "remove":{
            String admNum = request.getParameter("admNum");
            try {
                int removeResult = studentDAO.removeStudent(Integer.parseInt(admNum));
                if(removeResult <= 0){
                    request.setAttribute("errorMessage", "Could not Remove the Student");
                    request.getRequestDispatcher("remove-student.jsp").forward(request, response);
                }
                else response.sendRedirect("remove-student.jsp?success=1");
            } 
            catch (NumberFormatException e) {
                request.setAttribute("errorMessage", "Invalid admission number format.");
                request.getRequestDispatcher("remove-student.jsp").forward(request, response);
            }
            break;}
//        case "edit": {
//            String admNum = request.getParameter("adm_num");
//            String name = request.getParameter("name");
//            String clas = request.getParameter("class");
//            String place = request.getParameter("place");
//            String contact = request.getParameter("contact");
//
//            if (admNum == null || admNum.isEmpty()) {
//                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing admission number");
//                return;
//            }
//
//            try {
//                int admNumber = Integer.parseInt(admNum);
//                int updateResult = studentDAO.editStudentDetails(admNumber, name, clas, place, contact);
//                response.sendRedirect("list-students.jsp");
//            } catch (NumberFormatException e) {
//                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid admission number format");
//            }
//            break;
//        }
        case "search": {
            
            // Fetch single student details by adm_num or by filters (name/place)
            String option = request.getParameter("option");
            String input = request.getParameter("inputValue");
            List<Student> students = null;
            
            if (option == null || input == null || input.isEmpty()) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing search parameters");
                return;
            }


            if (option.equals("Name")) {
                try {
                    students = studentDAO.searchStudentByName(input);
                    System.out.println("student name= "+ students.get(1).getName());
                    request.setAttribute("students", students);
                    request.getRequestDispatcher("search-student.jsp").forward(request, response);
                    return;
                    
                } catch (Exception e) {
                    response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid Name format");
                    return;
                }
            } else if (option.equals("Admission Number")) {
            try{
                    students = studentDAO.searchStudentById(input);                     
                    request.setAttribute("students", students);
                    request.getRequestDispatcher("search-student.jsp").forward(request, response);
                    return;
            }catch(Exception e){
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid Id format");
                return;}
            }

            if (students == null) {
                System.out.println("student not found");
                return;
            }
            
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,"Unknown Error");
            break;
        }

        case "list": {
            String option = request.getParameter("option");
            String input = request.getParameter("inputValue");
            List<Student> students = null;
            if (!option.equals("All")) {
                if(option.equals("Class")){
                    students = studentDAO.getListByClass(input);            
                }else if(option.equals("Place")){
                    students = studentDAO.getListByPlace(input);
                }                
            }
            else {
                students = studentDAO.getAllList();
            }
            request.setAttribute("students", students);
            request.getRequestDispatcher("list-students.jsp").forward(request, response);
            break;
        }

        case "totalCount": {
            // Get total count of students
            int totalCount = studentDAO.getTotalStudents();
            request.setAttribute("totalCount", totalCount);
            request.getRequestDispatcher("student-stats.jsp").forward(request, response);
            break;
        }
        default: 
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Unknown action: " + action);
            break;
                    
    }
        
%>