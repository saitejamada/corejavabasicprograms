import java.util.Scanner;

class TwoDimensionArrayMax
{
  static void max()
   {
	int r,c,i,j,max=0;
	
	System.out.println("Enter Row Size of Array");   
	Scanner sc=new Scanner(System.in);
	r=sc.nextInt();
	
	System.out.println("Enter Column Size of Array");
	c=sc.nextInt();
	
	int a[][]=new int[r][c];
	System.out.println("Enter Matrice Elements");
	
	for(i=0;i<c;i++)
	{
	for(j=0;j<r;j++)
	{
	  a[i][j]=sc.nextInt();
	}
	}
	
	System.out.println("Maxtrice elements");
        for(i=0;i<c;i++)
	{
	for(j=0;j<r;j++)
	{
          System.out.print(a[i][j]+ " ");
	  if(a[i][j]>max)
	   max=a[i][j];
        }
        System.out.print(" "+"The MAx element in row is: "+max);
	System.out.println();
	max=0;
	}
         
    
  }
	

  public static void main(String[] args)
   {
    max();
   }
}
    
	