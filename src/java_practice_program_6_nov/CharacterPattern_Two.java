package java_practice_program_6_nov;
/*
              A
             B B
            C C C
           D D D D
          E E E E E
         F F F F F F
        G G G G G G G
       H H H H H H H H
      I I I I I I I I I
     J J J J J J J J J J

 */
public class CharacterPattern_Two {

    public static void main(String[] args) {

        int alphabet=65;

        for(int i=1;i<=10;i++)
        {
            for(int j=10;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char) (alphabet+i-1)+" ");
            }
            System.out.println();
        }
    }
}
