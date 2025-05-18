/*Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively*/

/*create updateEmployee.jsp file*/

<%@ page import="java.sql.*" %>
<%
    String empno = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String basicsalary = request.getParameter("basicsalary");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
        
        String query = "UPDATE Emp SET Emp_Name=?, Basicsalary=? WHERE Emp_NO=?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, empname);
        pstmt.setInt(2, Integer.parseInt(basicsalary));
        pstmt.setInt(3, Integer.parseInt(empno));
        
        int rowsUpdated = pstmt.executeUpdate();

        if (rowsUpdated > 0) {
            out.println("<p>Employee details updated successfully!</p>");
        } else {
            out.println("<p>No employee found with given Emp No.</p>");
        }

        conn.close();
    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    }
%>
<a href="updateForm.jsp">Go Back</a>

      /*create updateForm.jsp file*/

      <html>
<head>
  <title>Update Employee</title>
  <style>
    table {
      border-spacing: 10px; /* Adds gap between rows */
    }
    td {
      padding: 5px;
    }
    input[type="text"] {
      width: 200px;
      padding: 5px;
    }
    input[type="submit"] {
      padding: 6px 12px;
      margin-top: 10px;
    }
  </style>
</head>
<body>
  <h2>Update Employee Details</h2>
  <form action="updateEmployee.jsp" method="post">
    <table>
      <tr>
        <td><label for="empno">Employee No:</label></td>
        <td><input type="text" name="empno" id="empno" required></td>
      </tr>
      <tr>
        <td><label for="empname">Employee Name:</label></td>
        <td><input type="text" name="empname" id="empname" required></td>
      </tr>
      <tr>
        <td><label for="basicsalary">Basic Salary:</label></td>
        <td><input type="text" name="basicsalary" id="basicsalary" required></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="Update">
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
