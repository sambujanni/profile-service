package com.siva.janni.profileservice.controller;

import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {NotFoundException.class})
    public ResponseEntity handleNotFoundException(NotFoundException e) {
        ResponseObject object = new ResponseObject(false, e.getMessage());
        return new ResponseEntity(object, HttpStatus.NOT_FOUND);
    }
}
