package io.swagger.exception;

import java.util.HashMap;
import java.util.Map;

public class InvalidFieldDataException extends RuntimeException{

    private Map<Long,String> errorMap = new HashMap<>();

    public InvalidFieldDataException() {
        super();
    }
    public InvalidFieldDataException(Map<Long,String> errorMap) {
        this.errorMap = errorMap;
    }

    public Map<Long, String> getErrorMap() {
        return errorMap;
    }

}
