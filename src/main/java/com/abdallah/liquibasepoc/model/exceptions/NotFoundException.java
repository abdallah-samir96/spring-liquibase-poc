package com.abdallah.liquibasepoc.model.exceptions;

public class NotFoundException extends RuntimeException{

    private String message;
    private int code;
    public NotFoundException(String message, int code){
        this.code = code;
        this.message = message;
    }
    public NotFoundException(){
        this.code = -1;
        this.message = "Generic Message";
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
