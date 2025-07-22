# 🗣️ Community Forum - Spring Boot Backend

A backend API for a simple **Community Forum** project built with **Spring Boot**.  
It supports **tag-based content filtering**, **email notifications**, and **CRUD operations** for posts, comments, and users.

---

## 🚀 Features

- ✅ **Create, Read, Update, Delete (CRUD)** for Posts, Comments, and Likes
- ✅ **Tag-based filtering** of posts (search posts by topic)
- ✅ **Email Notification** system via Gmail SMTP
- ✅ **RESTful APIs** with Spring Boot MVC
- ✅ **MySQL Database** integration using Spring Data JPA
- ✅ Clean **3-Layer Architecture** (Controller, Service, Repository)

---

## 🛠️ Tech Stack

| Technology | Details |
|-------------|---------|
| Backend | Spring Boot, Java 17 |
| Database | MySQL |
| ORM | Spring Data JPA |
| Email | Spring Mail (Gmail SMTP) |
| API Testing | Swagger UI |
| Build Tool | Maven |

---

## 📁 Project Structure

src/main/java/com/community/forum
├── controller/ # API endpoints
├── entity/ # JPA entities (Post, Comment, Tag, etc.)
├── repository/ # Spring Data JPA repositories
├── service/ # Business logic
└── ProjectApplication.java
src/main/resources
└── application.properties

---

## ⚙️ Setup Instructions

### 🖥️ 1. Clone the Repository
```bash
git clone https://github.com/madhavan1402/community-forum-springboot.git

📦 2. Install Dependencies

mvn clean install
📝 3. Configure Database & Email
In src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/Project
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.mail.username=YOUR_EMAIL
spring.mail.password=YOUR_EMAIL_PASSWORD

▶️ 4. Run the Application

./mvnw spring-boot:run

✅ 5. Test APIs
Use Postman to test API endpoints like:

/api/posts

/api/comments

/api/posts/filter?tag=Java

📝 API Endpoints
Method	Endpoint	Description
GET	/api/posts	Get all posts
POST	/api/posts	Create new post
GET	/api/posts/filter?tag=XYZ	Filter posts by tag
POST	/api/sendMail	Send email notification

🌱 Future Scope
 ✅ JWT Authentication

 ✅ User Roles (Admin/User)

 ✅ Frontend (React)

 ✅ Comment Reply Threads

 ✅ Docker Deployment

🧑‍💻 Author
👤 Madhavan R
GitHub: @madhavan1402

