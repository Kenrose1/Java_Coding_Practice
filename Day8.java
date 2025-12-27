//Day 8 Making Temperature Converter through Method
package Javac;

import java.util.Scanner;

public class Day8 {
    static void fahrenheitToCelsius(double num) {
        double Celsius = (num-32)*5/9; 
        System.out.printf("Conversion Output: %.2f °F - %.2f °C",num,Celsius);
    }

    static void celsiusToFahrenheit(double num) {
        double fahrenheit = (num*1.8)+32; 
        System.out.printf("Conversion Output: %.2f °C - %.2f °F",num,fahrenheit);
    }
    static void ErrorMessage(){
        System.err.println("Input is Invalid.");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        double number = 0;
        System.out.println("\tTemperature Converter");
        System.out.println("Choose the Conversion type: ");
        System.out.println("1.Celsius To Fahrenheit");
        System.out.println("2.Fahrenheit To Celsius");
        System.out.print("Enter Choice = ");
        choice = scan.nextInt();
        System.out.println("");
        System.out.print("Enter The Number to Convert: ");
        number = scan.nextDouble();
        
        switch (choice) {
            case 1:
                celsiusToFahrenheit(number);
                break;

            case 2:
                fahrenheitToCelsius(number);
                break;
            default:
                ErrorMessage();
                break;
        }
        scan.close();
    }
}
