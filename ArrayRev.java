import java.util.Scanner;

class ArrayRev
{
	public static void main(String[] args)
	{
		int size,i;
		Scanner sc=new Scanner(System.in);
        	System.out.println("Enter The Size Of Array");
		size=sc.nextInt();
		int a[]=new int[size];
                 for(i=0;i<size;i++)
	  	 {
	         System.out.println("Enter The Array Elements");
	         a[i]=sc.nextInt();
		 }
		 for(int j=size-1;j>=0;j--)
		 {
		  System.out.println(a[j]);
		 }
        }
}

