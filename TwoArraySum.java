import java.util.Scanner;

class TwoArraySum
{
  public static void main(String[] args)
   {
	sum();
	
    }

	static void sum()
	{
		int size,i,j,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  size of 2 Matrice");
		size=sc.nextInt();
		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		int c[][]=new int[size][size];
		
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
         			 	c[i][j]=a[i][j]+b[i][j];
					
					}
					System.out.println();
					}
			  		System.out.println("Sum Of Two Matrices is :");
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

        