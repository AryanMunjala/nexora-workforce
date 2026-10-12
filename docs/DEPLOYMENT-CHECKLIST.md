# Deployment checklist

- [ ] Push the frontend and backend to their intended repositories.
- [ ] Deploy the Spring Boot backend to a Java-compatible host.
- [ ] Provision a MySQL database and configure `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` as host environment variables.
- [ ] Set the backend CORS allowed origin to the deployed frontend URL.
- [ ] Set `VITE_API_BASE_URL` to the deployed backend API base URL and rebuild the frontend.
- [ ] Deploy the frontend as a Vite static site.
- [ ] Verify employee create/list/update/delete operations on the live site.
- [ ] Never commit credentials or `.env` files.

Live URLs should only be added after deployment succeeds.
