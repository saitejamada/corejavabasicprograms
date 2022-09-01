import java.util.Scanner;
class SecondMaxArray
{
  public static void main(String[] args)
    {
	int max=0,max2=0;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
	 System.out.println("Enter The Array Elements");
	 a[i]=sc.nextInt();
         if(a[i]>max)
	{
	max=a[i];
	}
       }
 	for(int j=0;j<10;j++)
	{
		if(a[j]>max2 && a[j]!=max)
		max2=a[j];
		
	 }
	
       System.out.println("The Second Maximum Element In Array is :"+max2);
}
}
	
       
