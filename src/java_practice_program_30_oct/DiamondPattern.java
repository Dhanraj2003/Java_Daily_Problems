package java_practice_program_30_oct;

public class DiamondPattern {
    public static void main(String[] args) {

        int size=15;

        for (int i=1;i<=size;i++)
        {
            for(int j=1;j<=size-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=size;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=size-i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<size-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
