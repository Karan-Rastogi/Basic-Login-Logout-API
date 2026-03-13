# 🎓 Student Management & Auth API — Spring Boot + MongoDB

A beginner-friendly REST API project built with Spring Boot and MongoDB, covering User Registration, Login, and Logout functionality.

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Spring Boot | Backend Framework |
| MongoDB | NoSQL Database |
| Lombok | Reduces boilerplate code |
| Postman | API Testing |

---

## 📁 Project Structure

```
src/main/java/com.example.demo/
├── controller/
│   └── AuthController.java
├── service/
│   └── UserService.java
├── repository/
│   └── UserRepository.java
├── entity/
│   └── Users.java
├── dto/
│   ├── LoginRequest.java
│   └── RegisterRequest.java
└── DemoApplication.java
```

---

## ⚙️ Setup & Installation

### Prerequisites
- Java 17+
- Maven
- MongoDB running locally
- Postman (for testing)

### 1. Clone the project
```bash
git clone https://github.com/yourusername/student-auth-api.git
cd student-auth-api
```

### 2. Configure MongoDB in `application.properties`
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/studentdb
spring.data.mongodb.database=studentdb
```

### 3. Run the project
```bash
mvn spring-boot:run
```

The server will start at: `http://localhost:8080`

---

## 📦 Dependencies (pom.xml)

```xml
<!-- Spring Web -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- Spring Data MongoDB -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>

<!-- Lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>
```

---

## 🔗 API Endpoints

### Auth APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/auth/register` | Register a new user |
| `POST` | `/api/auth/login` | Login user |
| `POST` | `/api/auth/logout` | Logout user |

---

## 🧪 Testing with Postman

### 1. Register a User
```
POST http://localhost:8080/api/auth/register
Content-Type: application/json

{
    "userName": "rahul123",
    "password": "mypassword"
}
```

**Response:**
```
User registered successfully!
```

---

### 2. Login
```
POST http://localhost:8080/api/auth/login
Content-Type: application/json

{
    "userName": "rahul123",
    "password": "mypassword"
}
```

**Response:**
```
Login successful! Welcome rahul123
```

---

### 3. Logout
```
POST http://localhost:8080/api/auth/logout
Content-Type: application/json

{
    "userName": "rahul123"
}
```

**Response:**
```
Logout successful! Bye rahul123
```

---

## 🗂️ Layer Explanation

| Layer | File | Responsibility |
|-------|------|----------------|
| **Controller** | `AuthController.java` | Handles HTTP requests & responses |
| **Service** | `UserService.java` | Contains business logic |
| **Repository** | `UserRepository.java` | Talks to MongoDB database |
| **Entity** | `Users.java` | Maps to MongoDB collection |
| **DTO** | `LoginRequest.java`, `RegisterRequest.java` | Receives data from client |

---

## ⚠️ Known Limitations

- Passwords are stored as **plain text** (not encrypted)
- No JWT token-based authentication
- No role-based access control

---

## 🚀 Future Improvements

- [ ] Add BCrypt password encryption
- [ ] Implement JWT Token authentication
- [ ] Add Spring Security
- [ ] Add Student CRUD APIs
- [ ] Add proper error handling with custom exceptions

---

## 📚 What I Learned

- Spring Boot project structure (Controller, Service, Repository, Entity, DTO)
- How REST APIs work (GET, POST, PUT, DELETE)
- Connecting Spring Boot with MongoDB
- Using Lombok to reduce boilerplate
- Testing APIs with Postman

---

## 👨‍💻 Author

Made with ❤️ while learning Spring Boot from Engineering Digest
