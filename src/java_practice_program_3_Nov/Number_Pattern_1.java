package java_practice_program_3_Nov;

public class Number_Pattern_1 {

    public static void main(String[] args) {

        int n=9;

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                int num=0;
                for(int j=1;j<=n;j++)
                {
                    System.out.print(num);
                    if(num==0)
                    {
                        num=1;
                    }
                    else{
                        num=0;
                    }
                }
                System.out.println();

            }
            else{
                int num=1;
                for(int j=1;j<=n;j++)
                {
                    System.out.print(num);
                    if(num==1)
                    {
                        num=0;
                    }
                    else{
                        num=1;
                    }
                }
                System.out.println();
            }
        }
    }
}
