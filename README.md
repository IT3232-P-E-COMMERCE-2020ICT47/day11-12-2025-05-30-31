![Screenshot (7)](https://github.com/user-attachments/assets/01955a20-c12d-4dfd-b691-5eb1c0bc8c6a)# day11-12-2025-05-30-31 Class Work

A Spring Boot REST API for managing departments and their employee counts. This application provides endpoints to create, retrieve, and search departments, as well as get employee count information.

## Features

- **Department Management**: Create and retrieve department information
- **Search Functionality**: Search departments by name
- **Employee Count**: Get employee count for specific departments
- **Enhanced Views**: Get department information with employee count
- **Exception Handling**: Comprehensive error handling with custom responses
- **Data Validation**: Prevents duplicate department IDs

## Technology Stack

- **Framework**: Spring Boot
- **Database**: JPA/Hibernate
- **Language**: Java
- **Architecture**: REST API

## Project Structure

```
src/
├── main/java/lk/ac/vau/fas/ict/
│   ├── controller/
│   │   └── DepartmentController.java
│   ├── service/
│   │   └── DepartmentService.java
│   ├── model/
│   │   ├── Department.java
│   │   ├── ViewDepartment.java
│   │   └── ErrorResponse.java
│   ├── repo/
│   │   └── DepartmentRepo.java
│   └── exceptionHandler/
│       └── GenericExceptionHandler.java
```

## Data Models

### Department
- **id**: Primary key (department ID)
- **name**: Department name (required)
- **established**: Date when department was established
- **employees**: List of employees (One-to-Many relationship)

### ViewDepartment
Extends Department with additional information:
- **empcount**: Number of employees in the department

## API Endpoints

### Base URL
```
http://localhost:8080/dept
```

### Endpoints

| Method | Endpoint | Description | Response |
|--------|----------|-------------|----------|
| GET | `/{id}` | Get department by ID | `Department` |
| GET | `/names` | Get all department names | `List<String>` |
| GET | `/search/{name}` | Search departments by name | `List<Department>` |
| GET | `/empcount/{id}` | Get employee count for department | `Integer` |
| GET | `/vempcount/{id}` | Get department with employee count | `ViewDepartment` |

## API Usage Examples

### 1. Get Department by ID

![Screenshot (8)](https://github.com/user-attachments/assets/9e275740-6856-4369-8792-49cb527b9fe2)


### 2. Get All Department Names

![Screenshot (6)](https://github.com/user-attachments/assets/a17f8085-336a-4d30-9e98-8156ec195582)


### 3. Search Departments by Name

![Screenshot (7)](https://github.com/user-attachments/assets/87a2998d-f1a3-4bc3-9317-a0cc3f9e8107)

### 4. Get Employee Count

![Screenshot (4)](https://github.com/user-attachments/assets/2d7ff944-e4df-42b3-9da4-26b0b8e83aad)

### 5. Get Department with Employee Count

![Screenshot (2)](https://github.com/user-attachments/assets/67c59a58-a3fa-4dbc-9d1c-13d920dd0749)

## Error Handling

The API includes comprehensive error handling for common scenarios:

### 404 Not Found
When a department is not found:

![Screenshot (5)](https://github.com/user-attachments/assets/b48627e1-26ff-4bd2-8279-c75c1aa42f2e)


## Database Configuration

Make sure to configure your database connection in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee
spring.datasource.username=root
spring.datasource.password=y
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Running the Application

1. **Prerequisites**:
   - Java 17 or higher
   - Maven
   - Database (MySQL/PostgreSQL/H2)

2. **Clone and Setup**:
   ```bash
   git clone <repository-url>
   cd department-management-api
   ```

3. **Configure Database**:
   - Update `application.properties` with your database settings

4. **Run Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access API**:
   - Base URL: `http://localhost:8080/dept`

## Testing with Postman

Import the following collection to test all endpoints:

1. Create a new collection named "Department API"
2. Add requests for each endpoint listed above
3. Set the base URL to `http://localhost:8080/dept`
4. Test each endpoint with sample data




