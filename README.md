# Nexora Workforce — Full Stack Java-I Project

A full-stack Employee Management System built with React.js, Java 21, Spring Boot, Maven, MySQL, and Axios.

## Abstract
Nexora Workforce simplifies employee record management through a responsive web interface backed by REST APIs. React and Axios power the frontend; Java 21, Spring Boot, Spring Data JPA, and MySQL power the backend. It demonstrates CRUD operations, search, validation, exception handling, and full-stack integration.

## Features
- Create, view, update, delete, and search employee records
- Spring Boot REST API and MySQL persistence
- React + Vite frontend with Axios
- Form validation and structured API errors
- Health endpoint at `/api/health`
- Docker Compose for local full-stack startup
- GitHub Actions build checks for frontend and backend
- Postman and deployment documentation

## Requirements
- JDK 21
- Node.js 22+ and npm
- MySQL 8+ (or Docker Desktop for Compose)
- Maven

## Run locally with Docker
1. Copy `.env.example` to `.env` and replace the example passwords.
2. From the project root, run `docker compose --env-file .env up --build`.
3. Open `http://localhost:3000`.
4. The backend health endpoint is available at `http://localhost:8080/api/health`; the frontend also proxies it at `http://localhost:3000/api/health`.

## Run services separately
1. Create a MySQL database named `nexora_workforce`.
2. Set `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` in the backend environment.
3. From `backend/`, run `mvn spring-boot:run`.
4. From `frontend/`, copy `.env.example` to `.env`, run `npm install`, then `npm run dev`.
5. Open the Vite URL shown in the terminal.

The frontend uses `VITE_API_BASE_URL` and defaults to `http://localhost:8080/api`.

## API endpoints
Base path: `/api`
- `GET /health` — health check
- `GET /employees?search=term` — list/search employees
- `GET /employees/{id}` — fetch one employee
- `POST /employees` — create an employee
- `PUT /employees/{id}` — update an employee
- `DELETE /employees/{id}` — delete an employee

## Example request body
```json
{
  "fullName": "Priya Sharma",
  "email": "priya@example.com",
  "department": "Engineering",
  "jobTitle": "Software Engineer",
  "status": "ACTIVE"
}
```

## Documentation
- `docs/PROJECT-REPORT.md`
- `docs/POSTMAN-TESTING.md`
- `docs/DEPLOYMENT-CHECKLIST.md`
- `docs/RAILWAY-DEPLOYMENT.md`

## Security
Never commit real database passwords, API keys, or `.env` files. Configure production secrets through the hosting provider's environment-variable settings.
