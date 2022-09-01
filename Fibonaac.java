import java.util.Scanner;
	
class Fibonaac
{
	public static void main(String[] args)
	{
			
	 int a=0,b=1,c=0,n;
	System.out.println("Enter The Number");
	Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 for(int i=1;i<=n;i++)
	{
	System.out.print(" " +c);
        c=a+b;
	a=b;
        b=c;
	}
       }
      }