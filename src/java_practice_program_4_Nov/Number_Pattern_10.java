package java_practice_program_4_Nov;

public class Number_Pattern_10 {

    public static void main(String[] args) {

    /*
        1 2 3 4 5 6 7 8 9 10
         2 3 4 5 6 7 8 9 10
         3 4 5 6 7 8 9 10
          4 5 6 7 8 9 10
           5 6 7 8 9 10
            6 7 8 9 10
             7 8 9 10
              8 9 10
               9 10
                10
               9 10
             8 9 10
            7 8 9 10
           6 7 8 9 10
          5 6 7 8 9 10
         4 5 6 7 8 9 10
        3 4 5 6 7 8 9 10
       2 3 4 5 6 7 8 9 10
      1 2 3 4 5 6 7 8 9 10

     */




        int n=10;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
