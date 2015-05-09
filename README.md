# Oauth2DemoApplication

Steps to reproduce project on local machine:

--> Clone the repository to any directory using following git command:

<code>git clone https://github.com/ravi21101991/Oauth2DemoApplication.git</code>

--> Open eclipse editor and import the project as maven project pointing towards cloned repository folder.

--> Once imported right click on the project and do maven update [checking force update of Snapshots/Release].

--> Import the postman collection from project directory /external-resources/postman-collection/book_api.json in to postman REST client.

--> Open mysql workbench and create schema named 'oauth2'.

--> Import the sql table from /external-resources/book.sql in to mysql workbench in to oauth2 schema and execute the query.

--> Once above steps are done run the project on tomcat server 7 and you will be able to see welcome page with a message on following url:

<code>http://localhost:8080/OAuth2Demo/</code>

--> The project should run without any error possibly. Now go to postman REST client and get an access token by hitting GET oauth access token and then start testing the apis.

Note: This is just a basic oauth 2 spring security implementation with in memory user and client details. 
