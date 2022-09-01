import java.util.Scanner;

 class Occur1
  {
	public static void main(String[] args)
	{  
	  oc();
	}

	 	static void oc()
		{	
			int i,count=0,ocr=0,n;
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
			System.out.println();

			for(i=0;i<n;i++)
			{	
				if(a[i]==ocr)
				continue;
				
				for(int j=0;j<n;j++)
				{
			  	 if(a[i]==b[j])
				{
			   	 count++;
				 ocr=a[i];
				}
			 	}
				System.out.println("The Element In array " +a[i]+ " Occurs "+count+"Times");
				count=0;
				
			}	
				  
		}
}