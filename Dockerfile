FROM openjdk:8-jre-alpine
ADD target/app.jar /home/app.jar
WORKDIR "/home"
CMD ["java", "-Dspring.application.name=dem", "-Xmx512m", "-jar", "./app.jar"]
