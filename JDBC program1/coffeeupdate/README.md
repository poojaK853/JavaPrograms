☕ Coffee Product JDBC program
This project allows users to:

View all coffee products from the coffee table.

Update a coffee product using its ID via an HTML form and JSP.

📌 Prerequisites
Apache Tomcat server

MySQL server

JDBC driver (mysql-connector-java.jar)

Java SDK

⚙️ Steps to Set Up and Run the Project
1. 🛠️ Create the Database and Table
Run the following SQL commands in MySQL:
CREATE DATABASE test;

USE test;

CREATE TABLE coffee (
  id INT PRIMARY KEY,
  coffee_name VARCHAR(100),
  price DECIMAL(10, 2)
);
2. 📄 Create HTML Form to Update Coffee (updateForm.html)
3. 🧩 Create JSP to Handle Update (updateCoffee.jsp)
4. 📋 Create JSP to Display All Coffees (listCoffee.jsp)
▶️ How to Run
Start MySQL and Apache Tomcat.

Deploy files (updateForm.html, updateCoffee.jsp, listCoffee.jsp) to your Tomcat webapp folder.

Access in browser: http://localhost:8080/your_app_name/updateForm.html

Use the form to update a coffee product by its ID.

Click “View All Coffees” to verify the update.

OUTPUT LINK:-

coffeeupdate output link=>[coffeeupdate output link](https://github.com/poojaK853/JavaPrograms/blob/main/JDBC%20program1/coffeeupdate/p8_b.png)
