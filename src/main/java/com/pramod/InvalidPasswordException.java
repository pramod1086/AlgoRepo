package com.pramod;

class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message){
        super (message);
    }
}