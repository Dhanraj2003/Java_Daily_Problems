package java_practice_program_2_Nov;

public class Palindromic_Pattern {

    public static void main(String[] args) {

    /*
            1
           212
          32123
        4321234
         32123
          212
           1

     */

        int n=4;

        for(int i=1;i<=n;i++)
        {
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
