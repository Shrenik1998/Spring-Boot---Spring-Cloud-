# Spring Boot Microservices Project

This project implements a microservices architecture using Spring Boot, consisting of four services: Service Discovery, API Gateway, Product Service, and User Service.

## Project Components

- **Service Discovery**  
  Handles service registration and discovery using Netflix Eureka Server. Other services register themselves with this server, enabling dynamic service discovery.

- **API Gateway**  
  Acts as an entry point for all client requests, routing them to the appropriate microservices. Implements request routing, composition, and protocol translation.

- **Product Service**  
  Manages product-related operations and data.

- **User Service**  
  Handles user-related functionalities and authentication.

## Prerequisites

- Java 17 or higher  
- Maven 3.6 or higher  
- Git

## Getting Started

### Installation Order

The services must be started in the following specific order to ensure proper functionality:

1. Service Discovery
2. API Gateway
3. Product Service
4. User Service

### Running the Services

For each service, navigate to its respective directory and execute the following commands:

1. **Build the project**:  
   Run `mvn clean install`

2. **Run the application**:  
   Run `mvn spring-boot:run`

### Step-by-Step Guide

1. **Start Service Discovery:**
    ```bash
    cd ServiceDiscovery
    mvn clean install
    mvn spring-boot:run
    ```

2. **Start API Gateway:**
    ```bash
    cd ApiGateway
    mvn clean install
    mvn spring-boot:run
    ```

3. **Start Product Service:**
    ```bash
    cd ProductService
    mvn clean install
    mvn spring-boot:run
    ```

4. **Start User Service:**
    ```bash
    cd UserService
    mvn clean install
    mvn spring-boot:run
    ```

## Service Health Check

Once all services are running, you can verify their status through the Eureka Dashboard:

1. Open a web browser.
2. Navigate to [http://localhost:8761](http://localhost:8761).
3. Verify that all services are registered and **UP**.

---
