//Day 3 Making Multiplication Table using Loops
package Javac;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,result;
        System.out.println("Multiplication Table");
        System.out.print("Enter any Number: ");
        num=scan.nextInt();
        System.out.printf("Multiplication Table of %d",num);
        for (int x=1; x<=10; x++ ){
            result = num*x;
            System.out.println("");
            System.out.printf("%d x %d = %d",num,x,result);
        }
        scan.close();
    }

}
