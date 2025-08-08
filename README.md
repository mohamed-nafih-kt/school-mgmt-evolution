# school-mgmt-evolution
Multi-platform school administration system — evolution from Java Swing desktop to JSP web (MySQL).
a learning-driven project that evolves a single domain across tech stacks.

**Tech stack:** Java (Swing) → JSP/Servlets, MySQL, JDBC.  
**Status:** Working desktop and web prototypes. Suitable for demo and further refactor into REST/Spring or React.

## Highlights
- Demonstrates architecture and migration from desktop UI to web UI.
- Shared DB schema with seed data in `shared-schema/schema.sql`.
- Clean modular layout: `desktop-swing/`, `web-jsp/`.
- CI for Java builds via GitHub Actions.

## Repo layout
(brief tree)

## Quick start — Desktop
1. Import `desktop-swing` project into your IDE (Maven/Gradle).
2. Configure MySQL and update `MakeConnection` credentials.
3. Run `Main` from `desktop-swing`.

## Quick start — Web (JSP)
1. Build `web-jsp` (Maven/Gradle) and deploy to Tomcat (or use embedded server).
2. Configure database in `web-jsp/WEB-INF/config.properties` (or environment variables).
3. Seed DB: `mysql -u root -p school_db < shared-schema/schema.sql`.

## Contributing
See `CONTRIBUTING.md`. Use feature branches: `feature/xxx`.

## License
MIT — see `LICENSE`.
