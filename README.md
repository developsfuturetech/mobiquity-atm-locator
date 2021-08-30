# Backend Technical Test Overview

● Create a spring boot application to expose the REST APIs with the following definition.
● The application should invoke an external service to gather a list of atms: https://www.ing.nl/api/locator/atms/
● The application should expose following APIs and return a well formed JSON response
  ○ An API to get a list of all the atms
  ○ An API to filter the atms by city
● Apply clean code standards and/or principals as much as possible during the implementation.

# Application Setup

The application is implemented using Spring-boot 2.5, Java 1.8 versions and runs on port 8090. Swagger functionality is added in the application to test the Rest api.

Below are the Steps to run the application:
1. Unzip  the zip folder
2. Run mvn compile
3. Run mvn spring-boot:run

On running the above command the application should be up and running successfully.
      
To access the application using the curl commands:
  Atm Locations List : curl -X  GET http://localhost:8090/atmLocations/ -u admin:admin -H 'Content-Type: application/json' 
  Atm Locations by City : curl -X  GET http://localhost:8090/atmLocations/{city} -u admin:admin -H 'Content-Type: application/json' (replace {city} with some city name from the list ex: Amsterdam)

Swagger Url : http://localhost:8090/swagger-ui/index.html

Username : admin
Password : admin
