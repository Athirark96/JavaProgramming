import java.util.*;
class Calculator
{
   public static void main(String args[])  
   {
      int n1,n2,ch,res;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter num1 : ");
      n1 = in.nextInt();
      System.out.println("Enter num2 : ");
      n2 = in.nextInt();
      System.out.println("1.Additon \t 2.Subtraction \t 3.Multiplication \t4.Division");
     System.out.println("Enter ur choice : ");
     ch = in.nextInt();
     System.out.println("Result is :");
     switch(ch)
     {
         case 1 : res = n1+ n2;
                      System.out.println(res);
                      break;
         case 2 : res = n1- n2;
                      System.out.println(res);
                      break;
     case 3 : res = n1* n2;
                      System.out.println(res);
                      break;   

        case 4 : if(n2!=0)
                     {
                      res = n1/n2;
                      System.out.println(res);
                      }
                      else if(n1!=0)
                       {
                         res = n2/n1;
                          System.out.println(res);
                        }
                      break;
        default:System.out.println("Wrong choice");
    }
}
}
