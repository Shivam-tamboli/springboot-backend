package net.javaguides.springbootbackend.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
//we don't need to explicitly handle the exception (like with try-catch)reducing boilerplate
    public ResourceNotFoundException(String message){
        super(message);
    }
}
