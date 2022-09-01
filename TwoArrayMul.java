import java.util.Scanner;

class TwoArrayMul
{
  public static void main(String[] args)
   {
	mul();
	
    }

	static void mul()
	{
		int size,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  size of 2 Matrice");
		size=sc.nextInt();
		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		long c[][]=new long[size][size];
		
		System.out.println("Enter First Matrice Elements");
	
		for(i=0;i<size;i++)
		{
		for(j=0;j<size;j++)
		{											
	 	 a[i][j]=sc.nextInt();
	  	}
		}
			System.out.println("Enter Second Matrice Elements");
	
			for(i=0;i<size;i++)
			{
			for(j=0;j<size;j++)
			{
	 	 	b[i][j]=sc.nextInt();
			}
			}
	
				System.out.println("First Maxtrice elements");
        			for(i=0;i<size;i++)
				{
				for(j=0;j<size;j++)
				{
         			 System.out.print(a[i][j]+ " ");
				}
				System.out.println();
				}
					System.out.println("Second Maxtrice elements");
        				for(i=0;i<size;i++)
					{
					for(j=0;j<size;j++)
					{
         			 	System.out.print(b[i][j]+ " ");
					}
					System.out.println();
					}

			  		for(i=0;i<size;i++)
					{
					for(j=0;j<size;j++)
					{
         			 	  for(int k=0;k<size;k++)
					  {
 					    c[i][j]+=a[i][k]*b[k][j];
                                          }				
					}
					System.out.println();
					}

			  		System.out.println("Product Of Two Matrices is :");
		
					for(i=0;i<size;i++)
					{
					for(j=0;j<size;j++)
					{
         			 	System.out.print(c[i][j]+ " ");
					
					}
					System.out.println();
					}
					
	}
}

        