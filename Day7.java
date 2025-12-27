package Javac;
import java.util.Scanner;
public class Day7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Top_Student = "";
        int Num_Student,High_Scores=0;
        System.out.print("How Many Students to Record: ");
        Num_Student= scan.nextInt();
        scan.nextLine();
        String[] names = new String[Num_Student];
        int[] Scores= new int[Num_Student];
        for(int x = 0; x<Num_Student;x++){
            System.out.printf("Enter name of the Student %d : ",x+1);
            names[x]=scan.nextLine();
            System.out.printf("Enter the score of %s  : ",names[x]);
            Scores[x]=scan.nextInt();
            scan.nextLine();
        }
        System.out.print("\n\t\tSTUDENT SCORES:\n");
        for(int y=0; y<Num_Student;y++){
            System.out.printf("\n%s - %d",names[y],Scores[y]);
            if (Scores[y]>High_Scores){
                High_Scores=Scores[y];
                Top_Student = names[y];
            }
        }
        System.out.printf("\n\nThe Highest Score is %d",High_Scores);
        System.out.println("\nTop Student: "+ Top_Student); 
        scan.close();
    }
}
