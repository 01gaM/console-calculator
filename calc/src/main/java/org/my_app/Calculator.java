package org.my_app;

import java.util.Scanner;


public class Calculator {
    private DataSet data;
    private Scanner scanner;
    
   public Calculator(Scanner scan){
       scanner = scan;
       data = new DataSet(scanner);
   }

   public Calculator(DataSet newData){
    scanner = newData.getScanner();
    data = newData;
}

public double newCalculation(){
    System.out.println("Неверная операция. Повторите ввод. ");
            data = new DataSet(scanner);
            return calculate();
}

    public double calculate(){
        if (data.isOperationWrong()){
           return newCalculation();
        } else {
            double num1 = data.getNum1();
            double num2 = data.getNum2();
            switch(data.getOperation()){
                case('+'):
                return num1+num2;
                case('-'):
                return num1-num2;
                case('*'):
                return num1*num2;
                case('/'):
                return num1/num2;
                default:
                return newCalculation();
            }
        }
    }
}