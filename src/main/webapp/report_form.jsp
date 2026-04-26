<!DOCTYPE html>
<html>
<head><title>Reports</title></head>
<body>
    <h2>Employee Reports</h2>
    <form action="ReportCriteriaServlet" method="get">
        <label>Filter Type:</label><br>
        <input type="radio" name="criteria" value="name" checked> Start with Letter: <input type="text" name="letter" maxlength="1"><br>
        <input type="radio" name="criteria" value="service"> Years of Service (>=): <input type="number" name="years"><br>
        <input type="radio" name="criteria" value="salary"> Salary More Than (>): <input type="number" name="min_salary"><br><br>
        <input type="submit" value="Generate Report">
    </form>
</body>
</html>