package com.aamir.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerException {

    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail onRuntimeCustomException(RuntimeException runtimeException) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, runtimeException.getMessage());
    }
}
