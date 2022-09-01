import java.util.Scanner;

 class ArrayCommon
  {
	public static void main(String[] args)
	{  
	  dup();
	}

	 	static void dup()
		{	
			int i,n;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter The size of Two array");
			n=sc.nextInt();

			int a[]=new int[n];
			int b[]=new int[n];
			int c[]=new int[n];

			System.out.println("Enter Elements Into First Array");

			for(i=0;i<n;i++)
			{
			  
			  a[i]=sc.nextInt();
			  
			 }
			System.out.println("Enter Elements Into Second  Array");
			for(i=0;i<n;i++)
			{
			  
			  b[i]=sc.nextInt();
			  
			}
	
			for(i=0;i<n;i++)
			{
			  for(int j=0;j<n;j++)
			{ 
			  if(a[i]==b[j])
			{
			  c[i]=a[i]; break;
			 }
			}
			}
			
			for(i=0;i<n;i++)
			{
			
			if(c[i]>0)
			System.out.print(c[i]+" , ");
			}
			}
}