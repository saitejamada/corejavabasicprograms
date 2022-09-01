import java.util.Scanner;
class ReverseOfN
{
  public static void main(String[] args)
   {
   int n,r=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Number");
     n=sc.nextInt();
     while(n>0)
     {
     r=(r*10)+n%10;
     n=n/10;
     }
     System.out.println("the Reverse Of Number is "+r);
     }
   }