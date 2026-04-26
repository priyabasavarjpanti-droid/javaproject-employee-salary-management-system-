package com.servlet;
import com.dao.EmployeeDAO;
import com.model.Employee;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DisplayEmployeeServlet")
public class DisplayEmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeeDAO dao = new EmployeeDAO();
        try {
            List<Employee> list = dao.getAllEmployees();
            request.setAttribute("empList", list);
            request.getRequestDispatcher("empdisplay.jsp").forward(request, response);
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }
}