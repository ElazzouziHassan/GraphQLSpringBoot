# 📊 GraphQL Event Management API

A Spring Boot-based GraphQL API for managing events and organisers, supporting full CRUD operations and a One-to-Many relationship.

## 🚀 Technologies
- Java 17+
- Spring Boot
- Spring GraphQL
- Spring Data JPA
- H2 Database
- Lombok

## ⚙️ Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/ElazzouziHassan/GraphQLSpringBoot.git
   cd GraphQLSpringBoot
  ```
2. **Run the application**
  ```bash 
    mvn spring-boot:run
  ```
3. **Access GraphiQL**
  ```bash
    http://localhost:8080/graphiql
  ```

## Example Mutation
```xml
  mutation {
  createEvent(eventInput: {
    name: "Conférence Sur Le Web sémantique 2025",
    description: "Une conférence sur le Web sémantique « Web 3.0 »",
    type: "Tech",
    time: "2025-05-20T14:30:00",
    location: "UCD, Faculté des sciences, El Jadida",
    organiserId: 1
  }) {
    id
    name
    createdAt
    }
  }
```

`create an event`