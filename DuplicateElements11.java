import java.util.Scanner;
	
class DuplicateElements11
{

public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Enter The Size Of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		
			System.out.println("Enter Array Elements");
			 for(int i=0;i<size;i++)
			  {
				a[i]=sc.nextInt();
			   }
				
                           for(int i=0;i<size;i++)
			   {
				    if(n==a[i])
				    continue;
			
			    		for(int j=1;j<size-1;j++)
					{
				   	if(a[i]==a[j])
				  	{
				   	n=a[j];
				   	}
					}
					
					System.out.println("The Element In Array  After Removing Duplicate"+a[i]);
					}
		}
}	   