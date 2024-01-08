package org.example.Services;

import org.example.Exceptions.DivisionByZeroException;
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
    public String divide(int num1, int num2){
        if(num2 != 0){
            return String.valueOf(num1 / num2);
        } else {
            throw new DivisionByZeroException("Делить на 0 нельзя!");
        }
    }
}
