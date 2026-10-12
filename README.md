# Nexora Workforce — Full Stack Java-I Project

A full-stack Employee Management System built with React.js, Java 21, Spring Boot, Maven, MySQL, and Axios.

## Abstract
Nexora Workforce simplifies employee record management through a web interface backed by REST APIs. The frontend uses React and Axios; the backend uses Java 21, Spring Boot, Spring Data JPA, and MySQL. It demonstrates CRUD operations, validation, exception handling, layered architecture, and frontend/backend integration.

## Features
- Create, view, update, delete, and search employee records
- Spring Boot REST API and MySQL persistence
- React + Vite frontend with Axios
- Form validation and structured API errors
- Postman testing and deployment guides

## Project structure
- `frontend/` — React + Vite UI
- `backend/` — Spring Boot REST API
- `docs/` — API testing and deployment guides

## Requirements
JDK 21, Node.js LTS + npm, MySQL 8+, Maven, and Postman.

## Run locally
1. Create a MySQL database named `nexora_workforce`.
2. Configure `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` for the backend (see `backend/.env.example`).
3. In `backend/`, run `mvn spring-boot:run`.
4. In `frontend/`, run `npm install` then `npm run dev`.
5. Open the local URL printed by Vite.

The frontend uses `VITE_API_BASE_URL` and defaults to `http://localhost:8080/api`.

## API endpoints
Base path: `/api/employees`
- `GET /api/employees` — list employees
- `GET /api/employees/{id}` — fetch one employee
- `POST /api/employees` — create an employee
- `PUT /api/employees/{id}` — update an employee
- `DELETE /api/employees/{id}` — delete an employee

## Security
Never commit real database passwords, API keys, or production secrets. Configure them through environment variables on your deployment platform.
