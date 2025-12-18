# LinkedIn REST API

LinkedIn REST API is a Java Spring Boot application that exposes RESTful endpoints to manage user profiles and their education details similar to core LinkedIn profile features.[web:16][web:18]

---

## Features

- User profile CRUD operations (create, read, update, delete users).[web:16]
- Education CRUD operations linked to a user profile.[web:18]
- Layered architecture with controllers, DAO layer, repositories, entities, and response structures for clean separation of concerns.[web:16]
- Standardized JSON responses using a custom response structure class.[web:5][web:12]

---

## Tech Stack

- Java  
- Spring Boot (Web, Spring Data JPA, Validation)[web:16][web:18]  
- Maven  
- Relational database (MySQL / PostgreSQL)[web:6]  
- IDE: Eclipse / IntelliJ or any Java IDE[web:19]

---

## Project Structure

Main package: `com.google.linkedin`

- `controller`  
  - `UserController.java` – REST endpoints for user profile operations.  
  - `EducationController.java` – REST endpoints for education information.  
  - `example.java` – sample or test controller (you can remove/rename as needed).

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
  - Classes for wrapping API responses with data, message, and status fields.[web:16][web:18]

---

## Getting Started

### Prerequisites

- JDK 17+ installed.[web:19]  
- Maven installed.  
- MySQL or PostgreSQL running locally.[web:6]  

### Clone the repository

