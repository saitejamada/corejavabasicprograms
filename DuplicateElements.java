import java.util.Scanner;
	
class DuplicateElements
{
	public static void main(String[] args)
	{
	 int size,n=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Size Of Array");
	 size=sc.nextInt();
	 int a[]=new int[size];
	 

	 	System.out.println("Enter Array Elements");
	 	for(int i=0;i<size;i++)
	 	{
		a[i]=sc.nextInt();
	 	}
	 		for(int i=0;i<size;i++)
			{
				n=0;
				for(int j=0;j<size-1;j++)
				{	
   				if(a[i]==a[j])
				{
				a[j]=a[j+1];
				n++;
				
				}
				}
			}
			System.out.println("Array Elements After Removing Duplicates Are ");
			for(int i=0;i<size-n;i++)
			{
			
	 		System.out.println(a[i]);
			}
	}
}
			