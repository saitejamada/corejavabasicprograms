import java.util.Scanner;
	
class SumElements
 {
	public static void main(String[] args)
	{
	  sum();
	}
		static void sum()
		{
			int size,i,j,s=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The size");
			size=sc.nextInt();
			int a[]=new int[size];
			
				System.out.println("Enter The Array Elements");
				for(i=0;i<size;i++)
				{
					a[i]=sc.nextInt();
				}	
						for(j=1;j<size-1;j++)
						{
						int n=0;
						s=a[n]+a[j];
						if(s==a[j+1])
						{
						System.out.print(" "+a[j+1]);
						break; 
						}
						n++;
						}
		}
}
