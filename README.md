# LinkedIn REST API

LinkedIn REST API is a Java Spring Boot application that exposes RESTful endpoints to manage user profiles and their education details, similar to core LinkedIn profile features.

---

## Features

- User profile CRUD operations (create, read, update, delete users).
- Education CRUD operations linked to a user profile.
- Layered architecture with controllers, DAO layer, repositories, entities, and response structures.
- Standardized JSON responses using a custom response structure class.

---

## Tech Stack

- Java  
- Spring Boot (Web, Spring Data JPA, Validation)  
- Maven  
- Relational database (MySQL / PostgreSQL)  
- IDE: Eclipse / IntelliJ (any Java IDE)

---

## Project Structure

Main package: `com.google.linkedin`

- `controller`  
  - `UserController.java` – REST endpoints for user profile operations.  
  - `EducationController.java` – REST endpoints for education information.  
  - `example.java` – sample or test controller (can be removed or renamed).

- `dao`  
  - `UserDao.java` – Data access logic for users.  
  - `EducationDao.java` – Data access logic for education entries.

- `entity`  
  - `User.java` – Entity representing a LinkedIn user profile.  
  - `Education.java` – Entity representing an education record linked to a user.

- `repository`  
  - `UserRepository.java` – Spring Data JPA repository for `User`.  
  - `EducationRepository.java` – Spring Data JPA repository for `Education`.

- `responsestructure` (or similar)  
  - Classes for wrapping API responses with data, message, and status fields.

---

## Getting Started

### Prerequisites

- JDK 17+ installed.  
- Maven installed.  
- MySQL or PostgreSQL running locally.  
- Git installed.

### Clone the repository

```
git clone https://github.com/mdmashoodalam/LinkedIn_RestApi.git
cd LinkedIn_RestApi/linkedin
```


### Configure the database

Edit `src/main/resources/application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/linkedin_db
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Adjust values based on your local setup.

### Build and run

```
mvn clean install
mvn spring-boot:run
```

By default the app runs on:

```
http://localhost:8080
```

---

## API Overview

Base URL (example): `http://localhost:8080/api`  
Change it if your controllers use a different root mapping.

### User APIs

- `POST /users` – Create a new user profile.  
- `GET /users` – Get all users.  
- `GET /users/{id}` – Get a user by id.  
- `PUT /users/{id}` – Update user details.  
- `DELETE /users/{id}` – Delete a user profile.

### Education APIs

- `POST /users/{userId}/educations` – Add an education record to a user.  
- `GET /users/{userId}/educations` – Get all education records of a user.  
- `PUT /educations/{id}` – Update an education record.  
- `DELETE /educations/{id}` – Delete an education record.

Use Postman, curl, or any REST client to call these endpoints.

---

## Running Tests

If tests are defined, run:

```
mvn test
```

This executes unit and integration tests configured for the project.

---

## Future Enhancements

- Add authentication and authorization using JWT.  
- Add more profile sections (experience, skills, projects, connections).  
- Add pagination and filtering on user and education lists.  
- Build a frontend (React / Angular) to consume the APIs and provide a LinkedIn-style UI.
```

