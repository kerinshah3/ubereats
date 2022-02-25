package io.swagger.exception;

import java.util.HashMap;
import java.util.Map;

public class InvalidDataException extends RuntimeException{

    private Map<String,String> errorMap = new HashMap<>();

    public InvalidDataException() {
        super();
    }
    public InvalidDataException(Map<String,String> errorMap) {
        this.errorMap = errorMap;
    }

    public Map<String, String> getErrorMap() {
        return errorMap;
    }

}
