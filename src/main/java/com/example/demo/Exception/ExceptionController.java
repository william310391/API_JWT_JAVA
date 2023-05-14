package com.example.demo.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.DTO.ApiResponse;

import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class ExceptionController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = BusinessException.class)
    public ResponseEntity<?> BusinessExceptionHandler(BusinessException ex) {
        ApiResponse<String> response = new ApiResponse<String>(null);
        response.setCodigoHTTP(ex.getStatus().value());
        response.setResultadoDescripcion(ex.getMessage());
        response.setResultadoIndicador(0);
        return new ResponseEntity<>(response, ex.getStatus());
    }

}

