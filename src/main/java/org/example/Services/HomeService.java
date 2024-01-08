package org.example.Services;

import org.springframework.stereotype.Service;

@Service
public class HomeService implements HomeServiceInterface {
    public int plus(int num1, int num2){
        return num1 + num2;
    }
    public int minus(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public int divide(int num1, int num2){
        try {
            return num1 / num2;
        } catch (ArithmeticException e){
            throw new IllegalArgumentException();
        }
    }
}
