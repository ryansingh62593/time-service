package com.rsingh.timeservice.exception.handler;

import com.rsingh.timeservice.exception.InvalidTimezoneException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class TimeExceptionHandler {
    @ExceptionHandler(InvalidTimezoneException.class)
    public ResponseEntity<Map<String, String>> handleInvalidTimezoneException(InvalidTimezoneException exception) {
        Map<String, String> response = new HashMap<>();
        response.put("message", exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
