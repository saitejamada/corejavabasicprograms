import java.util.Scanner;
class ArrayMax
{

	 static void  max()
	{
	int max=0,max2=0,max3=0,size;
	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Size Of Array");
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
       }
 	for(int j=0;j<size;j++)
	{
		if(a[j]>max2 && a[j]!=max)
		max2=a[j];
		
	 }
	for(int j=0;j<size;j++)
	{
		if(a[j]>max3 && a[j]!=max&& a[j]!=max2)
		max3=a[j];
		
	 }
         for(int i=0;i<size;i++)
	{
	 System.out.print(a[i]+ " ");
	}
       System.out.println("The First Maximum Element In Array is :"+max);
	System.out.println("The Second Maximum Element In Array is :"+max2);
	System.out.println("The Third Maximum Element In Array is :"+max3);

	
	}
  	public static void main(String[] args)
    	{
          max();
	}
}
	
       
