FROM openjdk:17-slim

WORKDIR /movie-api

COPY /target/movies-0.0.1-SNAPSHOT.jar  *.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "movies-0.0.1.jar"]
#FROM openjdk:17-slim
#
#WORKDIR /movies
#
#COPY target/  *.jar
#
#EXPOSE 8080
#
#ENTRYPOINT ["java", "-jar", "movies-0.0.1.jar"]