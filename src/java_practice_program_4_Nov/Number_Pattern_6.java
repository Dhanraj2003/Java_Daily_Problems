package java_practice_program_4_Nov;

public class Number_Pattern_6 {

    public static void main(String[] args) {

    /*
        1
        10
        101
        1010
        10101
        101010
        1010101
        10101010
        101010101

     */

        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
