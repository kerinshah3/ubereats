package io.swagger.exception;

import io.swagger.api.ApiError;
import io.swagger.constant.ApplicationConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.NoSuchElementException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({MethodArgumentTypeMismatchException.class})
    public ResponseEntity<Object> handleMethodArgumentTypeMismatch(
            MethodArgumentTypeMismatchException ex) {
        String error = ex.getName() + ApplicationConstant.DEFAULT_MESSAGE + ex.getLocalizedMessage();
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException ex) {
        String error = ex.getMessage() + ApplicationConstant.DEFAULT_MESSAGE + ex.getClass().getName();
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }

    @ExceptionHandler({EmptyResultDataAccessException.class})
    public ResponseEntity<Object> emptyResultDataAccessException(EmptyResultDataAccessException ex) {
        String error = ex.getMessage() + ApplicationConstant.DEFAULT_MESSAGE + ex.getClass().getName();
        ApiError apiError = new ApiError(HttpStatus.NO_CONTENT, ex.getLocalizedMessage(), error);
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }

    @ExceptionHandler({IllegalArgumentException.class})
    public ResponseEntity<Object> illegalArgumentException(IllegalArgumentException ex) {
        String error = ex.getLocalizedMessage() + " [ Not Found ] " + ex.getClass().getName();
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, ex.getLocalizedMessage(), error);
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }


    @ExceptionHandler({HttpMessageNotReadableException.class})
    public ResponseEntity<Object> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        String error = ex.getMessage() + ApplicationConstant.DEFAULT_MESSAGE + ex.getClass().getName();
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }

    @ExceptionHandler(InvalidDataException.class)
    public ResponseEntity<Object> invalidDataException(final InvalidDataException ex) {
        String error = ex.getErrorMap().get(ApplicationConstant.HEADER);
        ApiError apiError = new ApiError(HttpStatus.NOT_ACCEPTABLE, ex.getMessage(), error);
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }

    @ExceptionHandler(InvalidFieldDataException.class)
    public ResponseEntity<Object> invalidFieldDataException(final InvalidFieldDataException ex) {
        String error = ex.getErrorMap().get(0L) + "," + ex.getErrorMap().get(1L);
        ApiError apiError = new ApiError(HttpStatus.NOT_ACCEPTABLE, ex.getMessage(), error);
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }

    @ExceptionHandler({NullPointerException.class})
    public ResponseEntity<Object> nullPointerException(NullPointerException ex) {
        String error = ex.getLocalizedMessage() + " Object shouldn't be null " + ex.getClass().getName();
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, ex.getLocalizedMessage(), error);
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> notHandledException(Exception ex) {
        String error = ex.getLocalizedMessage() + " Unexpected Exception occurs " + ex.getClass().getName();
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }

}
