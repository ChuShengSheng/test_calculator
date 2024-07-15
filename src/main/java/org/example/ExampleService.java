package org.example;

public class ExampleService {

    private Calculator calculator;

    public ExampleService(Calculator calculator){
        this.calculator = calculator;
    }

    public int performAddition(int a, int b){
        // Вызываем метод сложения из объекта Calculator
        return calculator.add(a, b);
    }

    public int performSubtraction(int a, int b){
        // Вызываем метод вычитания из объекта Calculator
        return calculator.sub(a, b);
    }
}
