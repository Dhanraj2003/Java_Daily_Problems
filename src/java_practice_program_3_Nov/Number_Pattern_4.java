package java_practice_program_3_Nov;

public class Number_Pattern_4 {



    public static void main(String[] args) {

 /*
        8
        8 7
        8 7 6
        8 7 6 5
        8 7 6 5 4
        8 7 6 5 4 3
        8 7 6 5 4 3 2
        8 7 6 5 4 3 2 1
        s
  */

        int n=8;

        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
