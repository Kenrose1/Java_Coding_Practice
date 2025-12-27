//Day 6 Making a Find the Min and Max
package Javac;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Input_Numbers, Min_Num = 0, Max_Num = 0;
        System.out.print("How Many Numbers Do you Want to Enter: ");
        Input_Numbers = scan.nextInt();
        int[] number = new int[Input_Numbers];
        System.out.printf("Enter %d Numbers :", Input_Numbers);
        System.out.println("");
        for (int x = 0; x < Input_Numbers; x++) {
            number[x] = scan.nextInt();
            if (number[x] > Max_Num)
                Max_Num = number[x];
            else
                Min_Num = number[x];
        }
        System.out.printf("The Lowest Number is   : %d", Min_Num);
        System.out.println("");
        System.out.printf("The Highest Number is  : %d", Max_Num);
        scan.close();
    }
}