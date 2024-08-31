FROM openjdk:17-alpine

ARG artifact=target/spring-boot-application.jar

WORKDIR /opt/app

COPY ${artifact} app.jar

# This should not be changed
ENTRYPOINT ["java","-jar","app.jar"]
