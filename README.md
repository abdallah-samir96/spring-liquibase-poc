# Liquibase Spring Boot POC
Simple POC on Database Migration Tool(Liquibase) with spring boot application.




### Simple Description

- Creating POC to use liquibase for database versioning
- Try The Spring Boot Actuator For Monitoring the status of my app and check the health and Mertics of the app
- Trying Cascading on Entities in case of Persist only

 

### Tools And Technologies



- Java 20 from IBM Semeru Runtime open Edition
- Spring Boot Version 3.1.1
- Apache Maven 3.9.3
- Spring Data Jpa
- Spring Boot Starter Actuator
- Potgres Database
- Liquibase 4.17.1
- InteliiJ Ultimate Edition
- Postman for checking ans Test Apis 
- PG ADMIN as GUI tool for Postgres



## Installation

You need all the above dependencies with jdk 11 or higher.
you can run the start.sh file or run the following Command on the Command Tool.
Install the dependencies and start the server.

```sh
mvn clean compile spring-boot:run
```
you can check the info of the application from the next end-point

```sh
localhost:8070/liquibase.app/api/v1/info
```

## License

MIT
