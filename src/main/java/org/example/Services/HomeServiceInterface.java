package org.example.Services;
public interface HomeServiceInterface {
    default String welcome(){
        return "Добро пожаловать в калькулятор";
    }
    int plus(int num1, int num2);
    int minus(int num1, int num2);
    int multiply(int num1, int num2);
    String divide(int num1, int num2);
}
