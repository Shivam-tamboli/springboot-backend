# Spring Boot Employee Management System

## Project Overview
The **Employee Management System** is a RESTful application built using Spring Boot. It manages employee data, 
providing features like creating, reading, updating, and deleting employee records (CRUD operations). 
Postman is used to test the API endpoints and interact with the backend.

---

## Features
- **Create Employee**: Add new employee records.
- **View All Employees**: Fetch and display a list of all employees.
- **Update Employee**: Modify details of an existing employee using their ID.
- **Delete Employee**: Remove an employee record using their ID.
- **Error Handling**: Graceful error messages for invalid operations.

---

## Tech Stack
- **Language**: Java 17
- **Framework**: Spring Boot 3.2.0
- **Database**: H2 (in-memory)
- **IDE**: IntelliJ IDEA
- **Tools**: Maven, Postman

---

## Project Setup

### Prerequisites
1. **Java Development Kit (JDK 17)**:
   - Download and install from [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Ensure Java is properly installed by running:
     ```bash
     java -version
     ```

2. **IntelliJ IDEA**:
   - Download and install from [IntelliJ IDEA](https://www.jetbrains.com/idea/download/).

3. **Postman** (optional, for API testing):
   - Download and install from [Postman](https://www.postman.com/).


### Step 1: Setting up IntelliJ IDEA
1. Open IntelliJ IDEA.
2. Select **New Project**.
3. From the left menu, choose **Spring Initializr**.
4. Fill in the following fields:
   - **Project**: Maven
   - **Language**: Java
   - **Spring Boot**: 3.2.0
   - **Group**: 'net.javaguides.springbootbackend'
   - **Artifact**: 'springboot-backend'
   - **Name**: 'Spring Boot Backend'

5. Click **Next** and add the following dependencies:
   - **Spring Web** (for creating REST APIs)
   - **Spring Data JPA** (for database access)
   - **H2 Database** (for in-memory database)
   - **Spring Boot DevTools** (for hot-reloading during development)

6. Click **Finish** to create the project.

---

### Step 2: Importing Project into IntelliJ
1. After project creation, IntelliJ will prompt to import the project. Select **Auto-import**.
2. Wait for Maven to resolve dependencies. If prompted, reload the project.

---

### Step 3: Project Structure
The project will have the following structure:

## Project Structure
├───src
│   ├───main
│   │   ├───java
│   │   │   └───net
│   │   │       └───javaguides
│   │   │           └───springbootbackend
│   │   │               │   SpringbootBackendApplication.java
│   │   │               │
│   │   │               ├───controller
│   │   │               │       EmployeeController.java
│   │   │               │
│   │   │               ├───exception
│   │   │               │       ResourceNotFoundException.java
│   │   │               │
│   │   │               ├───model
│   │   │               │       Employee.java
│   │   │               │
│   │   │               └───repository
│   │   │                       EmployeeRepository.java
│   │   │
│   │   └───resources
│   │       │   application.properties
│   │       │
│   │       ├───static
│   │       └───templates
│   └───test
│       └───java
│           └───net
│               └───javaguides
│                   └───springbootbackend
│                           SpringbootBackendApplicationTests.java


---

Steps to Pull and Set Up the Project
Follow these steps to pull the project and set it up locally:

1. Install Git
If Git is not installed, download and install it from Git SCM.

2. Clone the Repository
Open a terminal or command prompt.
Run the following command to clone the project repository:
bash
Copy code
git clone https://github.com/<your-username>/<repository-name>.git
Replace <your-username> with my GitHub username.
Replace <repository-name> with the repository name (e.g., springboot-backend).

3. Navigate to the Project Directory
After cloning, go to the project folder by running:
bash
Copy code
cd <repository-name>

4. Open the Project in IntelliJ IDEA
Launch IntelliJ IDEA.
Click File > Open.
Select the project folder and click OK.

5. Download Dependencies
IntelliJ IDEA will detect the pom.xml (for Maven projects).
A prompt will appear to Load Maven Changes. Click it to download required dependencies.
Alternatively, open a terminal and run:
bash
Copy code
mvn clean install

6. Run the Application
Locate the SpringbootBackendApplication class inside src/main/java.
Right-click on the file and select Run SpringbootBackendApplication.
Or, use the terminal to run the application:
bash
Copy code
mvn spring-boot:run







   


