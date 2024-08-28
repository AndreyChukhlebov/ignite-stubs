FROM openjdk:17-jdk-alpine AS build
WORKDIR /app
COPY target/pom.xml .
COPY target/src ./src
COPY target/mvnw .
COPY target/.mvn .mvn
RUN ./mvnw clean package

FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/src/main/resources/server.jks .
COPY target/src/main/resources/trust.jks .
COPY --from=build /app/target/ignite-stubs-1.0-SNAPSHOT-jar-with-dependencies.jar ./app.jar
COPY entry-point.sh /app
ENTRYPOINT  ["sh","./entry-point.sh"]

