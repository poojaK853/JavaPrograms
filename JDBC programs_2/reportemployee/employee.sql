-- Create the 'Employee' database if it doesn't already exist
CREATE DATABASE IF NOT EXISTS Employee;

-- Switch to the 'Employee' database to run subsequent commands
USE Employee;

-- Create the 'Emp' table if it doesn't already exist
CREATE TABLE IF NOT EXISTS Emp (
    EmpNo INT PRIMARY KEY,           -- Unique employee number (used as the primary key)
    EmpName VARCHAR(100),           -- Employee name, up to 100 characters
    BasicSalary DECIMAL(10,2)       -- Basic salary with up to 10 digits in total, 2 digits after the decimal
);
