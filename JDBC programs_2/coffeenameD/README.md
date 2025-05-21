☕ Coffee Product Deletion Web App
A simple web application built using HTML, JSP, and MySQL to delete a coffee product from the database and display the updated list.

📂 Project Overview
This project allows users to:

🔍 View all coffee products from the coffee table.

❌ Delete a coffee product using its unique ID.

⚙️ Prerequisites
Tool	Required
MySQL	✅
Apache Tomcat	✅
Java JDK	✅
MySQL JDBC Driver	✅

🗃️ Step 1: Create Database and Table
Run the following SQL commands in your MySQL client:

sql
Copy
Edit
CREATE DATABASE test;

USE test;

CREATE TABLE coffee (
  id INT PRIMARY KEY,
  coffee_name VARCHAR(100),
  price DECIMAL(10,2)
);
📝 Step 2: Create HTML Form to Delete Coffee (deleteForm.html)

🔁 Step 3: JSP to Delete Coffee (deleteCoffee.jsp)

📋 Step 4: JSP to Display All Coffee Records (listCoffee.jsp)

🚀 How to Run
✅ Start MySQL and ensure the test database and coffee table exist.

✅ Deploy files to your Tomcat server under the webapps/your_project directory.

🌐 Open your browser and visit:

http://localhost:8080/your_project/deleteForm.html

🧪 Enter a coffee ID to delete and view updated records.

OUTPUT LINK:-

deletecoffee output link=>[deletecoffee output link](https://github.com/poojaK853/JavaPrograms/blob/main/JDBC%20programs_2/p9_a.png)

