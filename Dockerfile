FROM openjdk:8
ADD target/github-action-docker-demo.jar github-action-docker-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "github-action-docker-demo.jar"]