#To connect this dockerized instance to host mysql server, run below command:
docker run --rm --net=host docker-demo -h 127.0.0.1 -p 3306:3306

#Service Testing
#Swagger Link:
http://localhost:8080/service-api/swagger-ui/index.html#/user-controller
