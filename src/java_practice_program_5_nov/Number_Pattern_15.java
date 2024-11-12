package java_practice_program_5_nov;

public class Number_Pattern_15 {

    public static void main(String[] args) {

    /*
        11111111
        11111122
        11111333
        11114444
        11155555
        11666666
        17777777
        88888888

     */

        int n=8;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("1");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
