package java_pattern_problems;

public class HeartPattern {

    public static void main(String[] args) {

        int size=10;
        int rsize=15;
        for(int i=0;i<2;i++)
        {
            if(i==0)
            {
                for(int k=1;k<=2;k++)
                {
                    for(int j=1;j<=3;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=3;j++)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            if(i==1)
            {
                for(int k=1;k<=2;k++)
                {
                    for(int j=1;j<=2;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=5;j++)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        int temsize=15;
        for(int i=0;i<8;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=temsize-i*2;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
