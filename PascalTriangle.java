class PascalTriangle
{
	public static void main(String[] args)
	{
	  int i,j,n=1;
	  for(i=1;i<6;i++)
	  {
		for(int k=6s;k>i;k--)
		{
		  System.out.print(" ");
		}
		n=1;
		for(j=1;j<=i;j++)
		{
		   System.out.print(n+" ");
		   n = n*(i-j)/j;
		}
		System.out.println();
	  }
	}
}