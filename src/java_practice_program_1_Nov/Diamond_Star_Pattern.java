package java_practice_program_1_Nov;

public class Diamond_Star_Pattern {

    public static void main(String[] args) {

        int size=4;
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size-i;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
