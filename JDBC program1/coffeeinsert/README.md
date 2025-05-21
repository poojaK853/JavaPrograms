Coffee Product Management Web App
This project allows you to:

Display all records from the coffee table in the test database.

Insert a new coffee product using an HTML form and JSP backend.

📁 Project Structure

webapp/
│
├── index.html             // HTML form for input
├── addCoffee.jsp          // JSP to insert new coffee
└── listCoffee.jsp         // JSP to display coffee table contents

⚙️ Step-by-Step Setup
1. 📦 Create Database and Table
In MySQL or any SQL console:
CREATE DATABASE test;

USE test;

CREATE TABLE coffee (
  id INT PRIMARY KEY,
  coffee_name VARCHAR(100),
  price DECIMAL(10, 2)
);

3. 🧩 Insert Coffee Record (addCoffee.jsp)

 4. 📄 Display All Coffee Records (listCoffee.jsp)
  
   5. 🔧 Requirements
Apache Tomcat server

MySQL database server

JDBC Driver (mysql-connector-java.jar)

Place .jsp and .html in webapp directory of your Tomcat project

✅ How to Run
Start MySQL server and ensure test database is created.

Deploy your web app to Tomcat.

Access http://localhost:8080/your_app_name/index.html.

Add new coffee and click “View All Coffees” to see the updated table.

OUTPUT LINKS:-

coffee insert output link=>[coffee insert output link](https://github.com/poojaK853/JavaPrograms/blob/main/JDBC%20program1/coffeeinsert/p8_a.png)
