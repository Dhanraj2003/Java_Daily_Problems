package java_practice_program_23_oct;

public class Swap_Byusing_ThirdVariable {

    public static void main(String[] args) {

        int num1=10;

        int num2=20;

        int temp;

        System.out.println("Numbers Before Swapping");
        System.out.println(num1);
        System.out.println(num2);


        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Numbers after swapping");

        System.out.println(num1);
        System.out.println(num2);
    }
}
