package java_practice_program_28_oct;
import java.util.Scanner;
public class BinaryToOctal {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter any string");
        String binaryValue=sc.nextLine();

        //binary to decimal convert
        int decimalValue = Integer.parseInt(binaryValue);

        String octalString = Integer.toOctalString(decimalValue);
        System.out.println("Octal value :"+octalString);


    }
}
