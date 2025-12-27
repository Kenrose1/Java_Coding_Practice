//Day 2 Make a Grade Evaluator
package Javac;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Score;
        char grade = 0;
        System.out.print("Enter your Score: ");
        Score = scan.nextInt();
        if (Score <= 59) {
            grade = 'F';
        } else if (Score >= 60 && Score <= 69) {
            grade = 'D';
        } else if (Score >= 70 && Score <= 79) {
            grade = 'C';
        } else if (Score >= 80 && Score <= 89) {
            grade = 'B';
        } else if (Score >= 90 && Score <= 100) {
            grade = 'A';
        } else
            System.out.print("Invalid Input");
        System.out.printf("Your score is %d and your grade is %c", Score, grade);

        scan.close();
    }
}
