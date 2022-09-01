import java.util.Scanner;

 class Occur
  {
	public static void main(String[] args)
	{  
	  oc();
	}

	 	static void oc()
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
			  	
				
				System.out.println("The Element In array " +a[j]+ " Occurs "+count+"Times");
				count=0;
				  
			}
			
			
				
	         }
}