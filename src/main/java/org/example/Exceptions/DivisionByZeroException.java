package org.example.Exceptions;

public class DivisionByZeroException extends IllegalArgumentException{
    public DivisionByZeroException(String s) {
        super(s);
    }
}
