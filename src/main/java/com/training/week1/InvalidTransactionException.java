package com.training.week1;

// Custom exception for invalid transactions
public class InvalidTransactionException extends Exception{
    public InvalidTransactionException(String message) {
        super(message);
    }
}
