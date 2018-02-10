# Camunda starter

A baseline Spring Boot app to start experimenting with Camunda.

Build using Java 8.

## Quickstart
1. Start the WorkflowApplication.
2. Camunda cockpit available at http://localhost:8080
3. H2 web console available at http://localhost:8080/h2console (user/pwd: sa/sa)
4. Camunda REST API available at http://localhost:8080/rest/

The H2 database is persistent and is created in target folder. To start again, simply delete the
db file. Camunda database schema will be created automatically.