import java.util.Scanner;
	
class FibonaacMethod
{
	
	static void fib(int n)
	{
	int a=0,b=1,c=0;
	for(int i=1;i<=n;i++)
	{
	
	System.out.print(c);
        c=a+b;
	a=b;
        b=c;
	}
	}
	public static void main(String[] args)
	{
	int n;
	System.out.println("Enter The Number");
	Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 fib(n);
	 
       }
   }