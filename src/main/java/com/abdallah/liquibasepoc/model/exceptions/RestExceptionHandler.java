package com.abdallah.liquibasepoc.model.exceptions;

import com.abdallah.liquibasepoc.model.dto.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.Arrays;

@ControllerAdvice
public class RestExceptionHandler {

/*
* handling the exception to be readable for the client
* */
@ExceptionHandler(NotFoundException.class)
public ResponseEntity<ErrorMessage> handleNotFoundException(NotFoundException ex){

    var errorMessage = new ErrorMessage();
    errorMessage.setMessage(ex.getMessage());
    errorMessage.setCode(ex.getCode());
    errorMessage.setDeveloperMessage(Arrays.toString(ex.getStackTrace()));
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);

}

}
