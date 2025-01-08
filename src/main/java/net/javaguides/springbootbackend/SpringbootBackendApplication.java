package net.javaguides.springbootbackend;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {
//It's a Spring Boot interface used to execute code right after the application starts.
//When the application runs, the run() method will be called automatically.

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

//It automatically inserts the object of EmployeeRepository into the class.
    @Autowired
    private EmployeeRepository employeeRepository;

    //to do list.
    @Override
    public void run(String... args) throws Exception {

    Employee employee = new Employee();
    employee.setFirstName("Shivam");
    employee.setLastName("Tamboli");
    employee.setEmailId("shivam@gmail.com");
    employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Satyam");
        employee1.setLastName("Tamboli");
        employee1.setEmailId("satyam@gmail.com");
        employeeRepository.save(employee1);
    }


}
