<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Add Employee</title></head>
<body>
    <h2>Add New Employee</h2>
    <form action="AddEmployeeServlet" method="post">
        ID: <input type="number" name="empno" required><br><br>
        Name: <input type="text" name="empname" required><br><br>
        DOJ: <input type="date" name="doj" required><br><br>
        Gender: <input type="radio" name="gender" value="Male" required> Male 
                <input type="radio" name="gender" value="Female"> Female<br><br>
        Base Salary: <input type="number" step="0.01" name="bsalary" required><br><br>
        <input type="submit" value="Save Employee">
    </form>
    <br><a href="index.jsp">Back to Home</a>
</body>
</html>