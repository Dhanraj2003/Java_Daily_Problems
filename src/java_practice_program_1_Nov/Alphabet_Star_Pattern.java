package java_practice_program_1_Nov;
import java.util.Scanner;
public class Alphabet_Star_Pattern {

    public static void main(String[] args) {

        //print B pattern

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height:");
        int size=sc.nextInt();
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(i==1 || j==1 || i==size || j==size || i==size/2+1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        int height = 5;
//
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j <= height / 2; j++) {
//                if (i == 0 || i == height - 1 || i == height / 2 || j == 0 || j == height / 2) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    }
}
