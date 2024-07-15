package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AppTest2 {
    @Test
    public void testAddition() {
        // Создание макета (mock) объекта Calculator
       Calculator calculator = mock(Calculator.class);

        // Задаем ожидаемое повидение для метода add
        when(calculator.add(2, 3)).thenReturn(5);

        // Создание экземпляра класса, который использует калькулятор
        ExampleService exampleService = new ExampleService(calculator);

        // Вызываем метод, который использует калькулятор
        int result = exampleService.performAddition(2, 3);

        // Проверяем, что результат соответствует ожидаемому
        assertEquals(5, result);

        // Проверяем, что метод add был вызван с правильными параметрами
        verify(calculator).add(2, 3);
    }

    public void testSubtraction() {
        // Создание макета (mock) объекта Calculator
        Calculator calculator = mock(Calculator.class);

        // Задаем ожидаемое повидение для метода subtract
        when(calculator.sub(5,3)).thenReturn(2);

        // Создание экземпляра класса, который использует калькулятор
        ExampleService exampleService = new ExampleService(calculator);

        // Вызываем метод, который использует калькулятор
        int result = exampleService.performSubtraction(5, 3);

        // Проверяем, что результат соответствует ожидаемому
        assertEquals(2, result);

        // Проверяем, что метод add был вызван с правильными параметрами
        verify(calculator).sub(5, 3);
    }




}
