package java_practice_program_4_Nov;

public class Number_Pattern_9 {

    public static void main(String[] args) {

    /*
        1 2 3 4 5 6 7 8 9
        1 2 3 4 5 6 7 8
        1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

     */

        int n=9;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
