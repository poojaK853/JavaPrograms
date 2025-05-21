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
