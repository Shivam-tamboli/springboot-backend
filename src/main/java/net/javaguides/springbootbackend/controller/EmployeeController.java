package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.exception.ResourceNotFoundException;
import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController//spring mvc, handle http request
//api's will define in this class.
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired//inserts the object of EmployeeRepository into the class.
    private EmployeeRepository employeeRepository;//saving, fetching,interacting with database

    @GetMapping// Maps the HTTP GET request to this method.
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //build create employee REST API
    @PostMapping// used to create new data in the database.
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
        //The client  sends data to the server, and data is json format.
        //@RequestBody converts that JSON data into a Java object for processing.
        // The method works with the Java object (e.g., saving it to the database).
    }

    //build create employee id by REST API
    @GetMapping("{id}")//binds value from url (id) to method para (long id).
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        Employee employee = employeeRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Employee doesn't exist with this id:" + id ));
        return ResponseEntity.ok(employee);
       //ResponseEntity wrapper class, clients get always clear response.
        //holds http responds.
    }
    //update employee rest api, RE is generic class
    @PutMapping("{id}")//when we have to update the resource
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id,@RequestBody Employee employeeDetails){
        Employee updateEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee doesn't exist with this id:" + id));
//@RequestBody Converts JSON data sent by client into Java object (Employee employeeDetails).
        updateEmployee.setFirstName(employeeDetails.getFirstName());
        updateEmployee.setLastName(employeeDetails.getLastName());
        updateEmployee.setEmailId(employeeDetails.getEmailId());

        employeeRepository.save(updateEmployee);
        return ResponseEntity.ok(updateEmployee);//Send a clear response back to the client.
    }

    //build or create employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee doesn't exist with this id: + id"));

        employeeRepository.delete(employee);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
