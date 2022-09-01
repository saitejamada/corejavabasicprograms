import java.util.Scanner;

 class ArrayDuplicate
  {
	public static void main(String[] args)
	{  
	  dup();
	}

	 	static void dup()
		{	
			int i,n;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter The size of array");
			n=sc.nextInt();

			int a[]=new int[n];
			int b[]=new int[n];

			System.out.println("Enter Elements Into Array");

			for(i=0;i<n;i++)
			{
			  
			  a[i]=sc.nextInt();
			  b[i]=a[i];
			 }

			System.out.println("Elements in Original Array");
	
			for(i=0;i<n;i++)
			{
			  System.out.print(a[i]);
			}
			System.out.println();
			System.out.println("Elements in Duplicate Array");
	
			for(i=0;i<n;i++)
			{
			  System.out.print(b[i]);
			}
		}
}