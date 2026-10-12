# Postman API testing

Base URL: `http://localhost:8080/api`.

Create an employee with `POST /employees`, header `Content-Type: application/json`, body:

    { "fullName": "Priya Sharma", "email": "priya@example.com", "department": "Engineering", "jobTitle": "Software Engineer", "status": "ACTIVE" }

Other requests:
- `GET /employees`
- `GET /employees?search=priya`
- `GET /employees/1`
- `PUT /employees/1` with an employee JSON body
- `DELETE /employees/1`
- `GET /health`

Create an employee before testing get/update/delete. Use the ID returned by the API.
