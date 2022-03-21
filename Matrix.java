import java.util.*;
class Matrix 
{
   public static void main(String args[])
   {
        int a[][] = new int[2][3];
        Scanner in = new Scanner(System.in);
         System.out.println("Array Elements :");
         for(int i=0;i<2;i++)
         {
             for(int j=0;j<3;j++)
             {
                   a[i][j] = in.nextInt();
              }
         }
         System.out.println("Matrix : ");
         for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("\t"+a[i][j]+" ");
            }
            System.out.println(" ");
        }  
    }
}
