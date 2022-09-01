import java.util.Scanner;

class ArraySize
{
	public static void main(String[] args)
	{
         int i,size;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Size Of Array");
	size=sc.nextInt();
	int a[]=new int[size];  
	for(i=0;i<size;i++)
 	 {
	  System.out.println("Enter The Array Elements");
	  a[i]=sc.nextInt();
        }
	for(int k=0;k<size;k++)
	{
	  System.out.println(a[k]);
	}
   }
}


