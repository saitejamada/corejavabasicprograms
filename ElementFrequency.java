import java.util.Scanner;
	
class ElementFrequency
{

public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=0,count=0;
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
			
			    		for(int j=0;j<size;j++)
					{
				   	if(a[i]==a[j])
				  	{
				   	n=a[i];
				   	count++;
				  	}
					}
					System.out.println("The Element In Array "+a[i]+" Occurs "+count+" Times");
					count=0;
					
			
			    }
		}
}	   