package java_practice_program_6_nov;
/*
        123456789
        234567891
        345678912
        456789123
        567891234
        678912345
        789123456
        891234567

 */
public class NumberPattern_TweentyTwo {

    public static void main(String[] args) {

        for(int i=1;i<=8;i++)
        {
            int num=i;
            for(int j=i;j<=9;j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
