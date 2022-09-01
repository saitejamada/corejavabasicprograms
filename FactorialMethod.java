import java.util.Scanner;

class FactorialMethod
{
   
	static void fact(int n)
	{
	int f=1;
	for(int i=1;i<=n;i++)
      {
       f=f*i;           
	 }
       System.out.println("The Factorial Of Given No is"+f);
	}
	




	public static void main(String[] args)
     { 
         int n;        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Number");
        n=sc.nextInt();
	fact(n);
      }
}