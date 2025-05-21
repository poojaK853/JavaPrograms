<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coffee Products Starting with 'D'</title>
</head>
<body>
    <h2>Coffee Products Starting with 'D'</h2>

<%
    String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "password";  // ← Change this

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);

        String sql = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
%>
        <table border="1" cellpadding="10">
            <tr>
                <th>ID</th>
                <th>Coffee Name</th>
                <th>Price</th>
            </tr>
<%
        boolean found = false;
        while (rs.next()) {
            found = true;
%>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("coffee_name") %></td>
                <td><%= rs.getDouble("price") %></td>
            </tr>
<%
        }
        if (!found) {
%>
            <tr><td colspan="3">No coffee products found starting with 'D'</td></tr>
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
    <a href="queryCoffeeByName.html">Back to Search</a>
</body>
</html>
