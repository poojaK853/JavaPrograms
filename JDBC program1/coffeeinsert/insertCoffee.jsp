<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Coffee Table</title>
</head>
<body>
<%
    String url = "jdbc:mysql://localhost:3306/test";
String username = "root"; // or another username
String password = "password"; // replace this with your actual MySQL password

    Connection conn = null;
    PreparedStatement ps = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);

        // Insert if parameters are provided
        String id = request.getParameter("id");
        String name = request.getParameter("coffee_name");
        String price = request.getParameter("price");

        if (id != null && name != null && price != null) {
            String insertSQL = "INSERT INTO coffee (id, coffee_name, price) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(insertSQL);
            ps.setInt(1, Integer.parseInt(id));
            ps.setString(2, name);
            ps.setDouble(3, Double.parseDouble(price));
            ps.executeUpdate();
        }

        // Display all records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");

%>
    <h2>All Coffee Products</h2>
    <table border="1">
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
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (ps != null) ps.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
    </table>
</body>
</html>
