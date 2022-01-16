package com.capitolio.hiremeskills.exceptions.handlers;

import com.capitolio.hiremeskills.dtos.ErrorMessageDto;
import com.capitolio.hiremeskills.exceptions.ProblemAtConsumingOuterServiceException;
import com.capitolio.hiremeskills.exceptions.commons.InstanceDoesNotExistException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(value = ProblemAtConsumingOuterServiceException.class)
    public ResponseEntity<ErrorMessageDto> handle(ProblemAtConsumingOuterServiceException exception){
        return ResponseEntity.internalServerError().body(new ErrorMessageDto(exception.getMessage()));
    }

    @ExceptionHandler(value = InstanceDoesNotExistException.class)
    public ResponseEntity<ErrorMessageDto> handle(InstanceDoesNotExistException exception){
        return ResponseEntity.badRequest().body(new ErrorMessageDto(exception.getMessage()));
    }

}
