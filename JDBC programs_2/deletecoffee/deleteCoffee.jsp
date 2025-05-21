<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Coffee Table After Deletion</title>
</head>
<body>
    <h2>Updated Coffee Table</h2>

<%
    String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "password"; // replace with your MySQL password

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    String idStr = request.getParameter("id");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        if (idStr != null) {
            int id = Integer.parseInt(idStr);
            String deleteSQL = "DELETE FROM coffee WHERE id = ?";
            pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setInt(1, id);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
%>
                <p style="color:green;">Coffee product with ID <%= id %> deleted successfully.</p>
<%
            } else {
%>
                <p style="color:red;">No coffee found with ID <%= id %>.</p>
<%
            }
            pstmt.close();
        }

        // Show remaining records
        String selectSQL = "SELECT * FROM coffee";
        pstmt = conn.prepareStatement(selectSQL);
        rs = pstmt.executeQuery();
%>
        <table border="1" cellpadding="10">
            <tr>
                <th>ID</th>
                <th>Coffee Name</th>
                <th>Price</th>
            </tr>
<%
        while (rs.next()) {
%>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("coffee_name") %></td>
                <td><%= rs.getDouble("price") %></td>
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
    <a href="deleteCoffee.html">Delete Another Coffee</a>
</body>
</html>
