# Trace-Case

With the increasing number of coronavirus cases day by day it's becoming hard to keep the track of records. So this application is built with a motive to serve the same purpose. It's a JAVA application built on the Spring Boot framework that lists the <b>total number of cases for the current day</b>, <b>cases reported since the previous day</b> globally.

## Requirements

- JDK 1.8 or later
- Intellij IDEA or Eclipse
- Maven 3.2+

## Run the application locally

1. Clone the repository.
2. Open in Intellij IDEA or Eclipse
3. Run <b>CoronavirusTrackerApplication.java</b> located at src/main/java/com/company/coronavirustracker/
4. Open http://localhost:8090/ in your browser. You'll be able to see the web app running as follows:

![alt text](https://github.com/Anushka-shukla/Trace-Case/blob/main/images/img.jpeg)

<img width="1920" height="1080" alt="Tracking report" src="https://github.com/user-attachments/assets/5e845779-2dca-4bb9-93cf-88ab1a9a603f" />

## 📌 Features

- 🌐 **Country-wise COVID-19 Case Monitoring**
- 📊 **Bar Chart Visualization** using Chart.js
- 📋 **Dynamic Table View** of all country statistics
- 🗄 **Spring Boot REST API Integration**
- 💾 **MySQL Database Storage**
- ⚡ **Fast Data Processing & Real-Time Updates**
- 🖥 **Responsive UI with JSP / HTML / CSS / Bootstrap**
- 🔐 **Secure Backend with Spring Boot**

---

## 🛠 Tech Stack

| Category | Technologies |
|---------|-------------|
| Frontend | HTML, CSS, Bootstrap, JavaScript, Chart.js |
| Backend | Java, Spring Boot, REST APIs |
| Database | MySQL |
| Tools | GitHub, Maven, Postman, Apache Tomcat |
| Architecture | MVC Pattern |

---

## 📂 Project Structure

COVID-Tracking-Platform/
┣ src/
┣ main/
┃ ┣ java/com/example/controller
┃ ┣ java/com/example/service
┃ ┣ java/com/example/model
┃ ┗ resources/application.properties
┣ webapp/
┃ ┣ index.jsp
┃ ┗ dashboard.jsp
┣ pom.xml
┗ README.md

yaml
Copy code

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the repository
```bash
git clone https://github.com/classic-coders/corona-tracking-platform.git


2️⃣ Open in Spring Tool Suite / Eclipse


3️⃣ Create MySQL Database
sql
Copy code
CREATE DATABASE covid_tracking;


4️⃣ Update DB configuration in application.properties
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/covid_tracking
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


5️⃣ Run the Project
bash
Copy code
mvn spring-boot:run


6️⃣ Open Browser
arduino
Copy code
http://localhost:8080


🎯 Output

Interactive Bar Chart Graph representing COVID deaths and active case counts country-wise

Responsive Table format listing real-time statistics

Efficient & clean UI for better visualization

👨‍💻 Author

Arun Kumar M
Java Full Stack Developer
📌 Dindigul, Tamil Nadu – India
🔗 LinkedIn: https://linkedin.com/in/arunkumar-m2002

🔗 GitHub: https://github.com/classic-coders


