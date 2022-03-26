- This is a demo/dummy/sample project to setup CI CD pipeline using github-actions and docker.
- The process includes:
- - prepare a dummy service
- - build it with maven
- - setup github-actions and build it
- - for CD: prepare the docker file and configure actions
- - complete the delivery pipeline in docker hub

## To run the docker container and bind it to local port, use this command:
> docker run -p 8080:8080 dipu11/github-action-docker-demo

## Service Testing
### Swagger Link:
http://localhost:8080/service-api/swagger-ui/index.html#/user-controller

- Both APIs in usercontroller are just as dummy, Returns the request data only
