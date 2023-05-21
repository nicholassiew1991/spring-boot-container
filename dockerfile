FROM eclipse-temurin:20.0.1_9-jdk-alpine AS build

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src ./src

RUN ./mvnw test package

FROM eclipse-temurin:20.0.1_9-jre-alpine

COPY --from=build /app/target/spring-boot-container-1.0-SNAPSHOT.jar /app/
EXPOSE 8080
CMD ["java", "-jar", "/app/spring-boot-container-1.0-SNAPSHOT.jar"]