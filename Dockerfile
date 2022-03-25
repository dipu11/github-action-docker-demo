FROM openjdk:8
EXPOSE 8080
ADD target/github-action-docker-demo.jar github-action-docker-demo.jar
ENTRYPOINT ["java", "-jar", "/github-action-docker-demo.jar"]
