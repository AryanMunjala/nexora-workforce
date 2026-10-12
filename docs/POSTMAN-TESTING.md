# Postman API testing

Set the base URL to `http://localhost:8080/api`.

## Create an employee
`POST /employees` with header `Content-Type: application/json` and body:
```json
{
  "fullName": "Priya Sharma",
  "email": "priya@example.com",
  "department": "Engineering",
  "jobTitle": "Software Engineer",
  "status": "ACTIVE"
}
```

## Other requests
- `GET /employees`
- `GET /employees/1`
- `PUT /employees/1` with the employee JSON body
- `DELETE /employees/1`

Create an employee before testing get/update/delete. Use the ID returned by the API.
