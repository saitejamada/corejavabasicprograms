import java.util.Scanner;

class TwoDimensionArraySum1
{
  public static void main(String[] args)
   {
	sum();
	
    }

	static void sum()
	{
	int i,j,s=0,max=0,r,c;
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row size");
	r=sc.nextInt();
	System.out.println("Enter the column size");
	c=sc.nextInt();
	
	int a[][]=new int[r][c];
	
	System.out.println("Enter Matrice Elements");
	
	for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
	  a[i][j]=sc.nextInt();
	  	
	}
	
	}
	System.out.println("Maxtrice elements");
        for(i=0;i<r;i++)
	{
	for(j=0;j<c;j++)
	{
          System.out.print(a[i][j]+ " ");
	  s=s+a[i][j];
        }
	System.out.print("  "+"The Sum of rows"+s);
	if(s>max)
	max=s;
	System.out.println();
	s=0;
        }
	System.out.println("The Sum of rows maximum is "+max);
	
	}
}

        