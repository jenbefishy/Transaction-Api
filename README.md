# Transaction API

## Overview

This is a small application that models transactions between users. It implements operations for viewing, adding, editing, and deleting users. Users can perform transactions with each other. Data is stored using [PostgreSQL](https://www.postgresql.org/).

## Libraries Used

- [**Spring Framework**](https://spring.io/): Provides the core features of the application.
- [**Hibernate**](https://hibernate.org/): Manages the persistence layer and ORM (Object-Relational Mapping).

## Installation

1. **Set up the database**: Create a PostgreSQL database and configure its details in the `properties.yaml` file.

2. **Build the project**:
    ```bash
    ./mvnw clean compile
    ```

3. **Run the application**:
    ```bash
    ./mvnw spring-boot:run
    ```

## Configuration

Ensure you update the `properties.yaml` file with your database configuration. Here is an example snippet:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/your_database_name
    username: your_database_user
    password: your_database_password
