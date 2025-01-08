Spring Boot Microservices Project
This project implements a microservices architecture using Spring Boot, consisting of four services: Service Discovery, API Gateway, Product Service, and User Service.

Project Components
Service Discovery
Handles service registration and discovery using Netflix Eureka Server. Other services register themselves with this server, enabling dynamic service discovery.

API Gateway
Acts as an entry point for all client requests, routing them to the appropriate microservices. Implements request routing, composition, and protocol translation.

Product Service
Manages product-related operations and data.

User Service
Handles user-related functionalities and authentication.

Prerequisites
Java 17 or higher
Maven 3.6 or higher
Git
Getting Started
Installation Order
The services must be started in the following specific order to ensure proper functionality:

Service Discovery
API Gateway
Product Service
User Service
Running the Services
For each service, navigate to its respective directory and execute the following commands:

Build the project
mvn clean install

Run the application
mvn spring-boot:run

Step-by-Step Guide

Start Service Discovery:
cd ServiceDiscovery
mvn clean install
mvn spring-boot:run

Start API Gateway:
cd ApiGateway
mvn clean install
mvn spring-boot:run

Start User Service:
cd UserService
mvn clean install
mvn spring-boot:run

Start Product Service:
cd ProductService
mvn clean install
mvn spring-boot:run

Service Health Check
Once all services are running, you can verify their status through the Eureka Dashboard:

Open a web browser
Navigate to http://localhost:8761
Verify that all services are registered and UP
