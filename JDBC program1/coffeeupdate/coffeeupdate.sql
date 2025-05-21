-- Create a database named 'test' if it doesn't already exist
CREATE DATABASE IF NOT EXISTS test;

-- Select the 'test' database for use
USE test;

-- Create a table named 'coffee' if it doesn't already exist
CREATE TABLE IF NOT EXISTS coffee (
    id INT PRIMARY KEY,               -- Unique identifier for each coffee entry
    coffee_name VARCHAR(50),         -- Name of the coffee (max 50 characters)
    price DECIMAL(5,2)               -- Price of the coffee (up to 999.99)
);
