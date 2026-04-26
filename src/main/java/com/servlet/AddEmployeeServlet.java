package com.servlet;
import com.dao.EmployeeDAO;
import com.model.Employee;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("empno"));
        String name = request.getParameter("empname");
        Date doj = Date.valueOf(request.getParameter("doj"));
        String gender = request.getParameter("gender");
        double salary = Double.parseDouble(request.getParameter("bsalary"));

        Employee emp = new Employee(id, name, doj, gender, salary);
        EmployeeDAO dao = new EmployeeDAO();
        try {
            dao.insertEmployee(emp);
            response.sendRedirect("DisplayEmployeeServlet");
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }
}