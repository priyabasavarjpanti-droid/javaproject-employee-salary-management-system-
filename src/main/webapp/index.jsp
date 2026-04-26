<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Management System</title>
<style>
    body { font-family: Arial, sans-serif; background-color: #f4f7f6; margin: 40px; }
    .container { max-width: 600px; background: white; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }
    h2 { color: #333; border-bottom: 2px solid #007bff; padding-bottom: 10px; }
    ul { list-style: none; padding: 0; }
    li { margin: 10px 0; }
    a { text-decoration: none; color: #007bff; font-weight: bold; }
    a:hover { color: #0056b3; }
</style>
</head>
<body>
<div class="container">
    <h2>Employee Management System</h2>
    <ul>
        <li><a href="empadd.jsp">Add New Employee</a></li>
        <li><a href="DisplayEmployeeServlet">Display All Employees</a></li>
        <li><a href="empupdate.jsp">Update Employee</a></li>
        <li><a href="empdelete.jsp">Delete Employee</a></li>
        <li><a href="report_form.jsp">Generate Reports</a></li>
    </ul>
</div>
</body>
</html>