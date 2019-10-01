package org.my_app;

import java.util.Scanner;


public class Calculator {
    private DataSet data;
    private SingleDataSet singleData;
    private Scanner scanner;
    private boolean isSingleDataSet;
    
   public Calculator(Scanner scan, boolean isSingle){
       scanner = scan;
       isSingleDataSet = isSingle;
       if (isSingleDataSet){
            singleData = new SingleDataSet(scanner);
            data = null;            
       } else {
            data = new DataSet(scanner);
            singleData = null;            
       }
   }

   public Calculator(DataSet newData){
    scanner = newData.getScanner();
    data = newData;
}


public double newCalculation(){
    System.out.println("Неверная операция. Повторите ввод. ");
    if (isSingleDataSet){
        singleData = new SingleDataSet(scanner);
    } else {
        data = new DataSet(scanner);
    }
    return calculate();
}

    public double calculate(){
        if (data.isOperationWrong()){
           return newCalculation();
        } else {
            if (isSingleDataSet){
                double num1 = singleData.getNum1();
                switch(singleData.getOperation()){
                   
                }
                return 0; //TODO: add single number operations
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
                    case('%'):
                    return num1*num2/100;
                    default:
                    return newCalculation();
                }
            }
        }
    }
}