FROM eclipse-temurin:17-jre-alpine

EXPOSE 8080

COPY target/SpringBootdemo-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]