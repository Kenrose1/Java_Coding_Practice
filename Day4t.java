//Day4 Making Number Pattern Using Nested Loops 
package Javac;
import java.util.Scanner;
public class Day4t{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rows;
        System.out.print("The Number of the Rows: ");
        rows =scan.nextInt();
        for(int x=1;x<=rows;x++){
            for(int y=1;y<=x;y++){
                System.out.print(y);
            }
            System.out.println("");
        }
        scan.close();
    }
}