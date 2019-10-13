# Minimal reproducer for MPConfig integration in immutables.org

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
Run following command in project root folder to start the server:
```
mvn payara-micro:stop
```
