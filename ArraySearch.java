import java.util.Scanner;

class ArraySearch
{
	public static void main(String[] args)
	{
	int size,n,i,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Size Of An Array");
	size=sc.nextInt();
	int a[]=new int[size];
	for(i=0;i<size;i++)
	{
	  System.out.println("Enter The Array Elements");
	  a[i]=sc.nextInt();
        }
           System.out.println("Enter The Array Element To Be Searched");
	    n=sc.nextInt();
         	for(int j=0;j<size;j++)
	  		{	
          		if(a[j]==n)
          		{
				count++;

		          }
           		}
		if(count==1)
		{
			System.out.println("Sucessfull");
		}
		else
          	 {
		System.out.println("un-Succesfull Try Again ");
          	 }
	
	}
}
         


