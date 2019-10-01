package org.my_app;

import java.util.Scanner;

public class SingleDataSet{
    protected double num1;
    protected char operation;
    protected Scanner scan;

    public SingleDataSet(Scanner scanner){
            scan = scanner;
            readNum1();
            readOperation();
    }

    public SingleDataSet(double number1, char newOperation){
        scan = new Scanner(System.in);
        num1 = number1;
        operation = newOperation;
    }

    public Scanner getScanner(){
        return scan;
    }

    protected void readNum1(){
        System.out.println("Введите число: ");
        num1 = scan.nextDouble();
    }

    public double getNum1(){
        return num1;
    }

    private void readOperation() {
        System.out.println("Введите операцию: ");
        operation = scan.next().charAt(0);
    }

    public char getOperation(){
        return operation;
    }


    /*
    public boolean isOperationWrong(){
        
    }*/
}