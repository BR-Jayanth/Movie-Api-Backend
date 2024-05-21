FROM openjdk:17-slim

WORKDIR /movies

COPY target/  *.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "movies-0.0.1-SNAPSHOT.jar"]