# 📝 Notes App – Spring Boot Backend

A simple **Notes Application** built with **Spring Boot** that allows users to **create, read, update, and delete notes**.  
This project is perfect for learning **Spring Boot, REST APIs, MySQL, DTOs, Mappers, and Layered Architecture**.

---

## 🌟 Features

- Create new notes  
- View all notes  
- View a single note by ID  
- Update a note  
- Delete a note  
- Built with **Spring Boot**, **Spring Data JPA**, and **MySQL**  

---

## 🛠️ Technologies Used

- Java 17+  
- Spring Boot 3.x  
- Spring Data JPA  
- MySQL 8.x  
- Maven  
- REST API  

---

## 📁 Project Structure

notes-app/
│
├── src/main/java/com/example/notesapp/
│ ├── controller/ -> REST Controllers
│ ├── dto/ -> Data Transfer Objects
│ ├── entity/ -> JPA Entities
│ ├── exception/ -> Custom Exceptions
│ ├── mapper/ -> Mapper Classes (DTO ↔ Entity)
│ ├── repository/ -> Spring Data Repositories
│ ├── service/ -> Business Logic
│ └── NotesAppApplication.java
│
└── src/main/resources/
└── application.properties




---

## ⚙️ Configuration

In `src/main/resources/application.properties`, configure your **MySQL database**:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/notes_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

server.port=8080




Make sure to create the database notes_db in MySQL before running the application.

🚀 Running the Project

Clone the repository:
       https://github.com/Amt610/Notes_Application_Api.git

Open in your favorite IDE (IntelliJ IDEA, Eclipse, VS Code).

Build the project using Maven:

mvn clean install


Run the application:

mvn spring-boot:run


Application runs at:

http://localhost:8080



🔗 API Endpoints
Method	Endpoint	Description	Body Example
POST	/api/notes	Create note	{ "title": "My Note", "content": "Spring Boot Rocks!" }
GET	/api/notes	Get all notes	—
GET	/api/notes/{id}	Get note by ID	—
PUT	/api/notes/{id}	Update note	{ "title": "Updated", "content": "Changed content" }
DELETE	/api/notes/{id}	Delete note	—



Test endpoints using Postman, Insomnia, or your browser (for GET requests).

💡 Example JSON
Create Note
{
  "title": "My First Note",
  "content": "This is my first note in Spring Boot!"
}

Response
{
  "id": 1,
  "title": "My First Note",
  "content": "This is my first note in Spring Boot!",
  "createdAt": "2025-10-05T21:00:00"
}

👨‍💻 Author

Amit Yadav
BCA Student | Java & Spring Boot Developer
📧 Email: ay3106222@gmail.com

🌐 GitHub: https://github.com/amt610

🏷️ Hashtags / Tags

#SpringBoot #JavaDeveloper #NotesApp #CRUD #RESTAPI #MySQL #DTO #Mapper #MiniProject #BackendDevelopment

 



