# i2i Academy - Spring Boot REST Web Service

This project is a lightweight Spring Boot RESTful web service developed as part of the i2i Academy training program. It demonstrates local microservice development and cloud migration (GCP) practices.

---

##  Tech Stack & Architecture

The application is structured as a basic microservice that exposes a public REST endpoint over HTTP.

* **Backend Framework:** Spring Boot 3.3.1
* **Java Version:** Java 21 (OpenJDK)
* **Build Tool:** Maven
* **Cloud Platform:** Google Cloud Platform (GCP) Compute Engine
* **Deployment Port:** 80 (Production) / 8080 (Local)

---

##  How to Run

### 1. Running Locally (Development)
To run and test the application on your local machine:

1. Clone the repository and open your terminal in the project root directory.
2. Run the application using the Spring Boot Maven command:
   ```bash
   mvn spring-boot:run
