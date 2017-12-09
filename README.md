# RESTAPIDemo

## A very simple project to try out in 15 minutes! 

Based on https://spring.io/guides/gs/accessing-data-rest/ 

** This project allows you to create a simple RES API in minutes!**

Your routes: 

http://localhost:8080/persons - shows a list of all persons 

http://localhost:8080/persons/the_person_id
the_person_id can be 1, 2 or 3 in this example. You can always add more! 

http://localhost:8080/persons/search/findByLastName?name=the_last_name

This appication comes pre-loaded with Frodo Baggins, Oliver Twist and Snow White. 

** Update **
Added Spring Security to this project: 
1. Added spring-security-starter dependency to pom.xml 
2. Ran the application. 

When you try to access routes without authentication, you get an error message. 

To access the routes: 

curl -u user:password_provided_in_console http://localhost:8080/persons - shows a list of all persons 

Include database authentication or OAuth2 to make properly accessible. 



