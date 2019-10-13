# Minimal reproducer for MPConfig integration in immutables.org

To see what this repository wants to demonstrate, see this [feature request](https://github.com/immutables/immutables/issues/1106).

## getting started
### What you need: 
- openjdk11
- Maven

### starting the server
Run following command in project root folder to start the server:
```
mvn clean package payara-micro:start
```
maven will automatically download payara, start the server, deploy the app and attach the console.

### stopping the server
Run following command in project root folder to stop the server:
```
mvn payara-micro:stop
```

## REST-API

There is a little REST-API to read and write the entity. You can access it under GET (and PUT) `localhost:8080/myentity/`. You can also use the openapi file which payara generates automatically `localhost:8080/openapi/`.
