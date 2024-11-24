package java_practice_program_6_nov;

 /*       A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        A B C D E F G
        A B C D E F G H
        A B C D E F G H I

  */

public class CharacterPattern_One {

    public static void main(String[] args) {

        int alphabet=65; //aschii value of Capital A is 65

        //outer loop for rows
        for(int i=1;i<=9;i++)
        {
            //inner loop for columns
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(alphabet+j)+" ");
            }
            System.out.println();
        }
    }
}
