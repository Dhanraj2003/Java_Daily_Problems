package java_practice_program_3_Nov;

public class Number_Pattern_2 {

    public static void main(String[] args) {

        int n=9;
        for(int i=1;i<=n;i++)
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
