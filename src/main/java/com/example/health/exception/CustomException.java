package com.example.health.exception;

/**
 * 自定义异常
 */
public class CustomException extends RuntimeException{

    private String message;

    public CustomException(String message){ this.message=message; }

    public String getMessage(){
        return this.message;
    }
}
