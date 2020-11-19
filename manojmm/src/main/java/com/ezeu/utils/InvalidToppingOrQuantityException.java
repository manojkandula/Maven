package com.ezeu.utils;

public class InvalidToppingOrQuantityException extends RuntimeException{

    public InvalidToppingOrQuantityException(String errorMessage) {

        super(errorMessage);

    }
}
