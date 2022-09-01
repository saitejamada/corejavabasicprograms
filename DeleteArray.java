import java.util.Scanner;

class DeleteArray
{
	public static void main(String[] args)
	{

	del();
	}

		static void del()
		{
		  int size,ele,i,n=0;
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Size Of Array");
			size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("Enter The Elements In Array");
			
				for(i=0;i<size;i++)
				{
				 a[i]=sc.nextInt();
				}
				
				System.out.println("Enter The Element To Be Deleted");
				ele=sc.nextInt();
				for(i=0;i<size;i++)
				{
				  if(a[i]==ele)
				  {
				  n=i;
				  break;
                                  }
				}
				
				
				for(i=n;i<size-1;i++)
				{
				  a[i]=a[i+1];
				}
				
				for(i=0;i<size-1;i++)
				{
				 
				 System.out.print(a[i]);
				}
				
		}
	}
				


	