package java_practice_program_5_nov;

public class Number_Pattern_12 {

    public static void main(String[] args) {

    /*
        456789
         56789
          6789
           789
            89
             9
             9
            89
           789
          6789
         56789
        456789
       3456789
      23456789
     123456789

     */

        int n=9;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
