# Employee Management JDBC program

This project allows users to insert employee records into a MySQL database using JSP and JDBC, and view all employee records in a report format.

## 🔧 Requirements

- Java (JDK)
- Apache Tomcat Server
- MySQL Database
- MySQL JDBC Driver

## 📦 Setup Steps

1. **Create Database and Table in MySQL**
   ```sql
   CREATE DATABASE Employee;
   USE Employee;
   CREATE TABLE Emp (
       Emp_NO INT PRIMARY KEY,
       Emp_Name VARCHAR(50),
       BasicSalary DOUBLE
   );
Clone or Copy the Project

Place MySQL JDBC Driver

Download mysql-connector-java.jar

Add it to your project’s lib folder or build path

Update DB Credentials

In DBConnection.java, update:

DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "your_password");

Deploy to Tomcat

Copy the project folder to Tomcat/webapps/

Start the Tomcat server

Run the App

Open browser and go to:http://localhost:8080/YourProjectName/


OUTPUTLINKS:-




reportemployee output link=>[reportemployee output link](https://github.com/poojaK853/JavaPrograms/blob/main/JDBC%20programs_2/p9_c.png)

deleteempbyname output link=>[deleteempbyname output link](https://github.com/poojaK853/JavaPrograms/blob/main/JDBC%20programs_2/p9_d.png)
