package java_practice_program_28_oct;
import java.util.Scanner;
public class OctalToBinary {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter any octal numbwr");

        String s=sc.nextLine();

        //octal to decimal
        int i = Integer.parseInt(s);


        String binaryString = Integer.toBinaryString(i);
        System.out.println("Binary:"+binaryString);
    }
}
