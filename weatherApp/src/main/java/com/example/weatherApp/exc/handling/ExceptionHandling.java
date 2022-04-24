package com.example.weatherApp.exc.handling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class ExceptionHandling {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpClientErrorException.class)
    public String handleAiqException(HttpClientErrorException exception){
        return exception.getLocalizedMessage();


    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(RuntimeException.class)
    public String handleRunTimeException(RuntimeException exception){
        return exception.getLocalizedMessage();


    }
}
