package java_practice_program_28_oct;

import java.util.Scanner;
public class BinaryToHexadecimal {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any binary number:");
        String binaryNumber=sc.nextLine();

        int decimalValue = Integer.parseInt(binaryNumber, 2);
        System.out.println("decimal value"+decimalValue);

        String hexString = Integer.toHexString(decimalValue).toUpperCase();

        System.out.println("After converting into hexadecimal:"+hexString);

    }
}
