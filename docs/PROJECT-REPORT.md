# Nexora Workforce — Project Report

## Abstract
Nexora Workforce is a full-stack employee management web application designed to maintain employee records through a responsive interface. The React frontend communicates with a Java 21 Spring Boot REST API using Axios. Spring Data JPA persists employee information in MySQL. The application demonstrates layered architecture, CRUD operations, validation, exception handling, and client/server integration.

## Objectives
- Build a responsive employee directory.
- Implement create, read, update, and delete operations.
- Store records in a relational MySQL database.
- Expose REST endpoints and test them with Postman.
- Apply validation and clear error handling.
- Build and package frontend and backend with repeatable CI checks.

## Technology stack
React.js, Vite, Axios, Java 21, Spring Boot, Spring Data JPA, Jakarta Bean Validation, Maven, MySQL, GitHub Actions, Railway.

## Modules
1. Employee UI: form, directory, search, status badges, edit/delete actions.
2. REST API: list/search, fetch by ID, create, update, delete.
3. Persistence: Employee entity, repository, generated primary key, unique email.
4. Validation and errors: required fields, email format, duplicate email conflict, not-found response.
5. Build/deployment: GitHub Actions frontend build and Maven package; environment-based database and CORS configuration.

## Endpoint summary
- GET /api/employees?search=term
- GET /api/employees/{id}
- POST /api/employees
- PUT /api/employees/{id}
- DELETE /api/employees/{id}
- GET /api/health

## Limitations and future improvements
Authentication/authorization, pagination, audit logs, bulk import/export, department normalization, and production migration management can be added in a later version.
