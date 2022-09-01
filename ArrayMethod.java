import java.util.Scanner;

class ArrayMethod
{
	public static void main(String[] args)
	{
	int n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Limit ");
	n=sc.nextInt();
        System.out.println();
	
	for(i=1;i<=n;i++)
	{
	for(j=1;j<=i;j++)
	{
	System.out.print(j);
	}
	for(j=i;j>=1;j--)
        { 
	System.out.print(j);
	}
	System.out.println();
	}
	 
		
   }
}