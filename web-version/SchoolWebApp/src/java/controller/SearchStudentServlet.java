package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import dao.StudentDAO;
import java.util.ArrayList;
import model.Student;
import org.json.JSONObject;
import org.json.JSONArray;

@WebServlet(name = "SearchStudentServlet", urlPatterns = {"/SearchStudent"})
public class SearchStudentServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        String keyword = request.getParameter("keyword");
        String filter = request.getParameter("filter");
        
        StudentDAO studentDao = new StudentDAO();
        
        ArrayList<Student> students = (ArrayList) studentDao.searchStudents(filter, keyword);
        if (students == null) students = new ArrayList<>();
        JSONArray studentArray = new JSONArray();
        for (Student s : students) {
            JSONObject obj = new JSONObject();
            obj.put("admNum", s.getAdmNum());
            obj.put("name", s.getName());
            obj.put("clas", s.getClas());
            obj.put("contact", s.getContact());
            obj.put("place", s.getPlace());
            studentArray.put(obj);
        }

        try (PrintWriter out = response.getWriter()) {
            out.print(studentArray.toString());
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
