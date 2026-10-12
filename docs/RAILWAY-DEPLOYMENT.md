# Railway deployment

## Database and backend
1. Create a Railway project and add a MySQL service.
2. Add a service from this repository with root directory `/backend`; its Dockerfile is `backend/Dockerfile`.
3. Configure `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` using the Railway MySQL service's reference variables. Example URL shape: `jdbc:mysql://HOST:PORT/DATABASE?useSSL=true&serverTimezone=UTC`.
4. Set `FRONTEND_ORIGIN` to the deployed frontend's HTTPS origin. Railway provides `PORT` automatically.
5. Deploy and verify the public backend URL plus `/api/health`.

## Frontend
1. Add a second service from this repository with root directory `/frontend`.
2. Set `VITE_API_BASE_URL` to the backend public URL plus `/api` (for example `https://your-backend-domain/api`) before building.
3. Generate a public domain for the frontend.
4. Test employee creation, listing, updating, search, and deletion on the live site.

For local full-stack execution, use `docker compose --env-file .env up --build` after copying `.env.example` to `.env`. Never commit real secrets.
