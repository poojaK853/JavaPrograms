<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Employees Starting With...</title>
</head>
<body>
    <h2>Delete Employees Whose Name Starts With Given Input</h2>

<%
    String url = "jdbc:mysql://localhost:3306/Employee?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "password"; // ⬅ Replace with your real MySQL password

    String prefix = request.getParameter("prefix");

    Connection conn = null;
    PreparedStatement deleteStmt = null;
    PreparedStatement selectStmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        if (prefix != null && !prefix.isEmpty()) {
            String deleteSQL = "DELETE FROM Emp WHERE empname LIKE ?";
            deleteStmt = conn.prepareStatement(deleteSQL);
            deleteStmt.setString(1, prefix + "%");

            int rowsDeleted = deleteStmt.executeUpdate();
            out.println("<p style='color:blue;'>" + rowsDeleted + " record(s) deleted.</p>");
        }

        // Show the current records
        String selectSQL = "SELECT * FROM Emp";
        selectStmt = conn.prepareStatement(selectSQL);
        rs = selectStmt.executeQuery();
%>

        <h3>Current Employee Records</h3>
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
        try { if (deleteStmt != null) deleteStmt.close(); } catch (Exception ignored) {}
        try { if (selectStmt != null) selectStmt.close(); } catch (Exception ignored) {}
        try { if (conn != null) conn.close(); } catch (Exception ignored) {}
    }
%>
    </table>
    <br>
    <a href="deleteEmpByName.html">Back to Delete Form</a>
</body>
</html>
