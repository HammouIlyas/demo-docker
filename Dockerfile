FROM openjdk:8-jdk-alpine
VOLUME /main-app
ADD target/docker-demo-application.jar app.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar","/app.jar"]
