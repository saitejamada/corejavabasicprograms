import java.util.Scanner;

class Factorial
{
   public static void main(String[] args)
     { 
         int n,f=1;        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Number");
       n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
       f=f*i;           
	 }
       System.out.println("The Factorial Of Given No is"+f);
	}
}