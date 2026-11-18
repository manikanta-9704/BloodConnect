# BloodConnect
Java 21 + Spring Boot + Spring AI + React + PostgreSQL/pgvector starter project.

## Run
1. Install Docker Desktop.
2. Copy `.env.example` to `.env` and set `OPENAI_API_KEY` for chatbot use.
3. Run `docker compose up --build`.
4. Open http://localhost:5173

Backend health: http://localhost:8080/actuator/health

## Features
- Donor registration and directory
- Blood request creation
- Preliminary same-blood-group/city donor suggestions
- Spring AI chatbot endpoint
- PostgreSQL with pgvector extension
- React dashboard

## API
- GET/POST `/api/donors`
- GET/POST `/api/requests`
- GET `/api/requests/{id}/matches`
- POST `/api/ai/chat` with `{"message":"..."}`

## Notes
This is a portfolio/demo MVP, not a medical decision system. Donor suggestions are preliminary only. Compatibility, eligibility, and availability must be confirmed by qualified blood-bank staff. Never delay emergency care. Protect personal information before any real deployment.
