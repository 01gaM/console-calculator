package org.my_app;

import java.util.Scanner;
 
public class Main{ 
    public static void printResult(Calculator calculator, Scanner scan){
            System.out.println("Результат: ");
            System.out.println(calculator.calculate());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator(scan);
        printResult(calculator, scan);
    }   
}


