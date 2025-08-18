<jsp:useBean id="mc" class="model.MakeConnection"/>
<%@page import="java.sql.PreparedStatement, java.sql.ResultSet"%>
<%
    String id = request.getParameter("id");
    try (
            PreparedStatement ps = mc.setConnection().prepareStatement("DELETE FROM notices WHERE id =" + id);) {
        int rs = ps.executeUpdate();
        if (rs > 0) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error id ="+id);
        }

    } catch (Exception e) {
        System.out.print("error deleting user: " + e);
        response.getWriter().write("error");
    }

%>