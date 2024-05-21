FROM openjdk:17-slim

WORKDIR /movies

COPY target/*.jar movies.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "movies-0.0.1-SNAPSHOT.jar"]