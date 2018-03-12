# EntertainmentAPI (Reused the cofiguration from OrderAPI so name is ordermgmt) 
RESTful API to create, retrieve, update and delete titles metadata for Feature, TV and Bonus content. For the retrieve operation, include capabilities to filter by Title Type (Bonus, Episode, Season, TV Series, and Feature).
I have generated this project using http://start.spring.io/ I have developed this on Eclipse using Spring Tool Suite 3.9.2. I have tested the API using Postman. I have used gitbash for pushing my changes. I have used in house memory by creating an ArrayList. So that you can run the application without any database connection. You can replace the ArrayList with the database connection and use appropriate methods using connector library for implementing this api using database. Just download this application and import it on your IDE as an existing maven application. You will require Spring Tool Suite 3.9.2 installed on your eclipse for running this application. By default it uses 8080 port for deploying this application.
Run com.springboot.ordermgmt.OrdermgmtApplication class and API will be deployed on server using eclipse.
Then you can use postman or any other tool for testing the API.
I have also created the test class for testing the service. (com.springboot.ordermgmt.test.TestOrderService)



