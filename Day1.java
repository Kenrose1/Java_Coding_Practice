//Day 1 Make a simple Calculator
package Javac;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2, output = 0;
        char operator;
        System.out.print("Enter Number 1: ");
        num1 = scan.nextDouble();
        System.out.print("Enter Operator: ");
        operator = scan.next().charAt(0);
        System.out.print("Enter Number 2: ");
        num2 = scan.nextDouble();

        if (operator == '+') {
            output = num1 + num2;
        } else if (operator == '-') {
            output = num1 - num2;
        } else if (operator == '*') {
            output = num1 * num2;
        } else if (operator == '/') {
            output = num1 / num2;
        } else if (operator == '%') {
            output = num1 % num2;
        } else
            System.out.print("Error");
        System.out.printf("Output        : %.2f", output);
        scan.close();
    }
}