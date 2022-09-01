import java.util.Scanner;

class TwoDimensionArrayMaxMin
{
  public static void main(String[] args)
   {
	Scanner s=new Scanner(System.in);
	int a[][]=new int[3][3];
	int i,j,max=0,min=100000;
	System.out.println("Enter Matrice Elements");
	
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	  a[i][j]=s.nextInt();
	  min=a[0][0];
	  if(a[i][j]>max)
	  max=a[i][j];
          if(a[i][j]<min)
	  min=a[i][j];
	}
	}
	System.out.println("Maxtrice elements");
        for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
          System.out.print(a[i][j]+ " ");
        }
	System.out.println();
	
        }
         System.out.println("Maximum Value in matrice is : "+max);
	System.out.println("Minimum Value in matrice is : "+min);
    }
}
    
	