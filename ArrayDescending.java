import java.util.Scanner;

class ArrayDescending
{
	public static void main(String[] args)
	{
	  des();
	}

		static void des()
		{
			int size,i,n=0;
			Scanner sc=new Scanner(System.in);
      		  	System.out.println("Enter The array size");
       		 	size=sc.nextInt();
		 	int a[]=new int[size]; 
			System.out.println("Enter The Elements In Array"); 
	
				for(i=0;i<size;i++)
 	 			{
	  				a[i]=sc.nextInt();
        			}

	
        			for(i=0;i<size;i++)
				{
	  				for(int j=i+1;j<size;j++)
					{
	  					if(a[i]<a[j])
           					{
						n=a[i];
						a[i]=a[j];
						a[j]=n;
               
	   					}
     					} 
				}
 	
				System.out.println("Array Elements In Decending Order Are");
				for(int k=0;k<size;k++)
				{
					System.out.println(a[k]);
				}
		}
}
         

	  