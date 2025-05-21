<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Report</title>
</head>
<body>
    <h2>Employee Record Insert and Report</h2>

<%
    String url = "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "password";  // ← Replace this

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    String empNoStr = request.getParameter("empno");
    String empName = request.getParameter("empname");
    String basicSalaryStr = request.getParameter("basicsalary");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        // Insert the record if form is submitted
        if (empNoStr != null && empName != null && basicSalaryStr != null) {
            int empNo = Integer.parseInt(empNoStr);
            double basicSalary = Double.parseDouble(basicSalaryStr);

            String insertSQL = "INSERT INTO Emp (empno, empname, basicsalary) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, empNo);
            pstmt.setString(2, empName);
            pstmt.setDouble(3, basicSalary);

            int rowsInserted = pstmt.executeUpdate();
            pstmt.close();

            if (rowsInserted > 0) {
%>
                <p style="color:green;">Employee inserted successfully!</p>
<%
            } else {
%>
                <p style="color:red;">Insertion failed.</p>
<%
            }
        }

        // Show the report (all employees)
        String selectSQL = "SELECT * FROM Emp";
        pstmt = conn.prepareStatement(selectSQL);
        rs = pstmt.executeQuery();
%>
        <h3>Employee Report</h3>
        <table border="1" cellpadding="10">
            <tr>
                <th>Emp No</th>
                <th>Emp Name</th>
                <th>Basic Salary</th>
            </tr>
<%
        while (rs.next()) {
%>
            <tr>
                <td><%= rs.getInt("empno") %></td>
                <td><%= rs.getString("empname") %></td>
                <td><%= rs.getDouble("basicsalary") %></td>
            </tr>
<%
        }
    } catch (Exception e) {
%>
        <p style="color:red;">Error: <%= e.getMessage() %></p>
<%
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception ignored) {}
        try { if (pstmt != null) pstmt.close(); } catch (Exception ignored) {}
        try { if (conn != null) conn.close(); } catch (Exception ignored) {}
    }
%>
    </table>
    <br>
    <a href="insertEmp.html">Insert Another Employee</a>
</body>
</html>
