import java.util.Scanner;

class TwoDimensionArrayPattern2
{
  public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[3][3];
	int i,j;
	System.out.println("Enter Matrice Elements");
	
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	  a[i][j]=sc.nextInt();
	  	
	}
	
	}
	System.out.println("Maxtrice elements");
        for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	if(i==1&&j==0||i==j||i==2&&j==0||i==2&&j==1)
          System.out.print(a[i][j]+ " ");
	else
	System.out.print(" ");
	}
        System.out.println();
	}
} }