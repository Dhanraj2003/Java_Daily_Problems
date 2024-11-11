package java_practice_program_28_oct;
import java.util.Scanner;
public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any binary number:");
        int num=sc.nextInt();
        int power=1;
        int ans=0;

        while(num!=0)
        {
            int rem=num%10;
            ans = ans+rem * power;
            power=power*2;
            num=num/10;
        }

        
        System.out.println("After converting binary to decimal:"+ans);


    }

}
