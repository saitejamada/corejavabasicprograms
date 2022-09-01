import java.util.Scanner;

class ArrayMaxMin
{
	public static void main(String[] args)
	{
	  int size,max=0,min=10000;
	  Scanner sc=new Scanner(System.in);
 	  System.out.println("Enter The Size Of Array");
	  size=sc.nextInt();
   
	  int a[]=new int[size];
	  for(int i=0;i<size;i++)
	  {
	   System.out.println("Enter The Array Elements");
	   a[i]=sc.nextInt();
       	   if(a[i]>max)
            {
		max=a[i];
            }
	    if(a[i]<min)
            {
  		min=a[i];
             }
	   }
           System.out.println("Maximum Value In Array is :"+max);
	   System.out.println("Minimum Value In Array is :"+min);
	  }
}	