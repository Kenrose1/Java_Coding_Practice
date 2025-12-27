//Day Making Average Calculator
package Javac;


import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input,total=0;
        double Average;
        System.out.println("How many Numbers do you want to enter: ");
        input = scan.nextInt();
        int[] numbers = new int[input];
        System.out.printf("Enter %d Numbers: ",input);
        System.out.println("");
        for(int x = 0; x<input;x++){
            numbers[x]=scan.nextInt();
            total+=numbers[x];
        }
        Average = total/input;
        System.out.printf("The Average is %.2f",Average);
        scan.close();
    }
}