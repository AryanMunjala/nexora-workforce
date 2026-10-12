# Deployment checklist

- [ ] Deploy the Spring Boot backend to a Java-compatible host.
- [ ] Provision a MySQL database and set DB_URL, DB_USERNAME, DB_PASSWORD as host environment variables.
- [ ] Set APP_CORS_ORIGIN to the deployed frontend origin.
- [ ] Set VITE_API_BASE_URL to the backend API base URL and rebuild the frontend.
- [ ] Deploy the Vite frontend as a static site.
- [ ] Verify employee create/list/update/delete on the deployed application.
- [ ] Never commit credentials or .env files.

Only add live URLs after a deployment has succeeded.
