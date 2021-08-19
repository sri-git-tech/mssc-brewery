package ss.springframework.msscbrewery.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException ex)
    {
        List<String> errors = new ArrayList<>(ex.getConstraintViolations().size());
        ex.getConstraintViolations().forEach(e->errors.add(e.toString()));
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
