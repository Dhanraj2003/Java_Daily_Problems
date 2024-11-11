package java_practice_program_3_Nov;

public class Number_Pattern_3 {

    public static void main(String[] args) {
    /*
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
        6 5 4 3 2 1
        7 6 5 4 3 2 1
        8 7 6 5 4 3 2 1

     */


        int n=8;
        for(int i=1;i<=n;i++)
        {
           for(int j=i;j>=1;j--)
           {
               System.out.print(j+" ");
           }
            System.out.println();
        }
    }
}
