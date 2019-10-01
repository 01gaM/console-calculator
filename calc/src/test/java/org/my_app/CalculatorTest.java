package org.my_app;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private DataSet data;
    private Calculator calc;
    private final double delta = 0.0000000001; //точность для сравнения double значений

    @Test
    public void testSum(){ //проверка сложения
        data = new DataSet(12, 5, '+');
        calc = new Calculator(data);
        assertEquals(calc.calculate(), 17, delta);
        assertEquals(data.isOperationWrong(), false);
    }

    @Test
    public void testDiff(){ //проверка вычитания
        data = new DataSet(12, 5, '-');
        calc = new Calculator(data);
        assertEquals(calc.calculate(), 7, delta);
        assertEquals(data.isOperationWrong(), false);
    }

    @Test
    public void testMultipl(){ //проверка умножения
        data = new DataSet(-10, 5, '*');
        calc = new Calculator(data);
        assertEquals(calc.calculate(), -50, delta);
        assertEquals(data.isOperationWrong(), false);
    }

    @Test
    public void testDiv(){ //проверка разности
        data = new DataSet(30, -4, '/');
        calc = new Calculator(data);
        assertEquals(calc.calculate(), -7.5 , delta);
        assertEquals(data.isOperationWrong(), false);
    }

 @Test
    public void testNullDiv(){    //проверка деления на 0
         data = new DataSet(-123, 0, '/');
         assertEquals(data.isOperationWrong(), true);
    }
}
