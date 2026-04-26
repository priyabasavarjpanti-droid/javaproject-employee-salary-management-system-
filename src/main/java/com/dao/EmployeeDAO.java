package com.dao;
import com.model.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private String url = "jdbc:mysql://localhost:3306/EmployeeDB?useSSL=false";
    private String user = "root";
    private String pass = "password"; // Update this

    protected Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }

    public void insertEmployee(Employee e) throws Exception {
        String sql = "INSERT INTO Employee VALUES (?,?,?,?,?)";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, e.getEmpno());
            ps.setString(2, e.getEmpName());
            ps.setDate(3, e.getDoj());
            ps.setString(4, e.getGender());
            ps.setDouble(5, e.getBsalary());
            ps.executeUpdate();
        }
    }

    public List<Employee> getAllEmployees() throws Exception {
        List<Employee> list = new ArrayList<>();
        try (Connection conn = getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM Employee")) {
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getDouble(5)));
            }
        }
        return list;
    }
    
    public List<Employee> getReportByName(String letter) throws Exception {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM Employee WHERE EmpName LIKE ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, letter + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getDouble(5)));
            }
        }
        return list;
    }
}