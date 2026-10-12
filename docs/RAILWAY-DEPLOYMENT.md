# Railway deployment

## Create the database
1. In Railway, create a project and add a MySQL database service.
2. Use the MySQL connection values shown in Railway's Variables panel. Never paste secrets into GitHub or chat.
3. Add a backend service from this repository and set its root directory to /backend.
4. Set backend variables using Railway's reference variables for the MySQL service:
   - DB_URL = jdbc:mysql://${{MySQL.MYSQLHOST}}:${{MySQL.MYSQLPORT}}/${{MySQL.MYSQLDATABASE}}?useSSL=true&serverTimezone=UTC
   - DB_USERNAME = ${{MySQL.MYSQLUSER}}
   - DB_PASSWORD = ${{MySQL.MYSQLPASSWORD}}
   - APP_CORS_ORIGIN = the deployed frontend's HTTPS origin
   - PORT is injected by Railway
5. Deploy the backend and verify /api/health.
6. Add a second service from the same repository with root directory /frontend.
7. Set VITE_API_BASE_URL to the backend's public URL followed by /api, for example https://your-backend-domain/api.
8. Generate a public domain for the frontend and test create, list, update, and delete employee flows.

Note: Vite preview is used for simple hosting. For production-scale traffic, serve the generated dist directory with a static hosting service. Never expose database passwords in client-side variables; only VITE_API_BASE_URL belongs in the frontend.
