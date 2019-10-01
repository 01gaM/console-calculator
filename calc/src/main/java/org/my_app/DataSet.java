package org.my_app;

import java.util.Scanner;

public class DataSet{
    private double num1, num2;
    private char operation;
    private Scanner scan;

    public DataSet(Scanner scanner){
            scan = scanner;
            readNum1();
            readNum2();
            readOperation();
    }

    public DataSet(double number1, double number2, char newOperation){
        scan = new Scanner(System.in);
        num1 = number1;
        num2 = number2;
        operation = newOperation;
    }

    public Scanner getScanner(){
        return scan;
    }

    private void readNum1(){
        System.out.println("Введите первое число: ");
        num1 = scan.nextDouble();
    }

    public double getNum1(){
        return num1;
    }

    private void readNum2(){
        System.out.println("Введите второе число: ");
        num2 = scan.nextDouble();
    }

    public double getNum2(){
        return num2;
    }

    private void readOperation() {
        System.out.println("Введите операцию: ");
        operation = scan.next().charAt(0);
    }

    public char getOperation(){
        return operation;
    }
    
    public boolean isOperationWrong(){
        return (operation == '/' && num2 == 0) || (operation != '+' && operation != '-'  && operation != '*'  && operation != '/');
    }
}