FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/movies-0.0.1-SNAPSHOT.jar *.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
#FROM openjdk:17-slim
#
#WORKDIR /movie-api
#
#COPY /target/movies-0.0.1-SNAPSHOT.jar  *.jar
#
#EXPOSE 8080
#
#ENTRYPOINT ["java", "-jar", "movies-0.0.1.jar"]