FROM openjdk:17-jdk-alpine
ARG JAR_FILE = target/*.jar
COPY  ${JAR_FILE} /demo.jar
CMD ["java", "-jar", "/demo.jar"]