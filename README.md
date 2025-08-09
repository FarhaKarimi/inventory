# Inventory & Billing Management System

A production-ready backend system built with Spring Boot for managing inventory and generating sales invoices. This project demonstrates clean architecture, real-world business logic, and best practices in Java enterprise development.

---

Overview

This system provides a complete solution for managing products, categories, customers, and invoices. It includes stock management, PDF invoice generation, role-based access control, and RESTful APIs — suitable for small to medium-scale business applications.

Key features:
- Full CRUD operations for products, categories, and customers
- Invoice creation with automatic stock deduction
- Search functionality for products and customers
- PDF invoice generation
- Input validation and global exception handling
- Role-based access control (ADMIN, SALE_USER)
- Interactive API documentation via Swagger UI

---

Technology Stack

- **Framework**: Spring Boot 3.2
- **Language**: Java 17
- **Database**: PostgreSQL
- **JPA Provider**: Hibernate
- **Security**: Spring Security
- **Validation**: Jakarta Validation
- **PDF Generation**: iText
- **Build Tool**: Maven
- **Utilities**: Lombok
- **API Documentation**: SpringDoc OpenAPI (Swagger UI)

---

Getting Started

Prerequisites
- Java 17 or higher
- Maven 3.8+
- PostgreSQL 12+

1. Set Up the Database
Create a new database in PostgreSQL:
```sql
CREATE DATABASE inventory_billing_db;
2. Configure Application
Update src/main/resources/application.properties with your database credentials:
spring.datasource.url=jdbc:postgresql://localhost:5432/inventory_billing_db
spring.datasource.username=your_username
spring.datasource.password=your_password
3. Build and Run
./mvnw spring-boot:run
The application will start on http://localhost:8080.
🌐 API Endpoints
Categories
POST /api/categories – Create a category
GET /api/categories – Get all categories
GET /api/categories/{id} – Get a category by ID
Products
POST /api/products – Create a product
GET /api/products – Get all products
GET /api/products/search?name=... – Search products by name
Customers
POST /api/customers – Create a customer
GET /api/customers – Get all customers
GET /api/customers/search?name=... – Search customers by name
Invoices
POST /api/invoices – Create an invoice
GET /api/invoices/{id} – Get an invoice by ID
GET /api/invoices/{id}/pdf – Download invoice as PDF
Documentation
Access Swagger UI at:
http://localhost:8080/swagger-ui.html

Security
The system supports role-based access:

ADMIN: Full access (categories, products, invoices)
SALE_USER: Access to customers and invoices
Note: Authentication module (JWT) is under development. For testing, security can be temporarily disabled in SecurityConfig. 

PDF Invoice Generation
After creating an invoice, download it as PDF:
GET /api/invoices/{id}/pdf

Generates a formatted PDF with:

Invoice number
Customer details
Product list
Quantities, prices, and total
Date of creation
Testing the API
Example: Create an invoice
POST /api/invoices
Content-Type: application/json

{
  "customerId": 1,
  "items": [
    {
      "productId": 1,
      "quantity": 2
    }
  ]
}
Ensure that:

Customer and product IDs exist
Stock is sufficient
Response includes generated invoice number and total
Project Structure

src/
├── main/
│   ├── java/
│   │   └── com.inventory/
│   │       ├── controller/     – REST controllers
│   │       ├── service/        – Business logic
│   │       ├── repository/     – JPA repositories
│   │       ├── model/          – JPA entities
│   │       ├── dto/            – Data transfer objects
│   │       ├── exception/      – Custom exceptions
│   │       └── config/         – Configuration classes
│   └── resources/
│       ├── application.properties
│       └── data.sql (optional sample data)

Best Practices Applied
Clean Architecture (separation of concerns)
Use of DTOs for API contracts
Global exception handling
Input validation with Jakarta Constraints
Logging and error responses
Immutable builders with Lombok
Null-safety in collections (e.g., @Builder.Default)
Future Improvements
JWT-based authentication and login endpoint
User management and registration
Database migration with Flyway
Unit and integration tests
Docker support
Sales reporting endpoints
📬 Contact
Farhad Karimi
[www.linkedin.com/in/farhad-karimi-27093a102] | [f.karimi8216@gmail.com]

