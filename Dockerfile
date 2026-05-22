FROM eclipse-temurin:17

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 10000

ENTRYPOINT ["java","-jar","app.jar"]