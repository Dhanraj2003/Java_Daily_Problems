package java_practice_program_1_Nov;
import java.util.Scanner;
public class SandglassStar_Pattern {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of height:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}