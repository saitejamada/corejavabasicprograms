// duplicate elements in array

import java.util.Scanner;

 class DuplicateArray
  {
	public static void main(String[] args)
	{  
	  dup();
	}

	 	static void dup()
		{	
			int k,i,count=0,ocr=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter Elements  Into Array");

			for(i=0;i<n;i++)
			{
			  
			  a[i]=sc.nextInt();
			  	
			}
			System.out.println();

			for(int j=0;j<n;j++)
			{ 
				if(ocr==a[j])
				continue;
			
	                       for(k=0;k<n;k++)
				{
				  if(a[j]==a[k])
				{
				  count++;
				  ocr=a[j];
				}
				}
			  	
				if(count>1)
				System.out.println("The Duplicate Element In array is  " +ocr+ " Occurs "+count+"Times");
				count=0;
				  
			}
			
			
			
				
	         }
}