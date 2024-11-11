package java_practice_program_1_Nov;

public class DownTriangle {

    public static void main(String[] args) {

        int n=9;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            if(i!=0){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++)
            {
               if(i==0 || j==(n-i))
               {
                   System.out.print("*"+" ");
               }
               else{
                   System.out.print(" "+" ");
               }
            }
            System.out.println();
        }
    }
}
