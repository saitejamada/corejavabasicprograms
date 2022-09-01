class EvenOddPattern1
{
  public static void main(String[] args)
    {
	int n;
      	for(int i=1;i<=5;i++)
	{
	   if(i%2==0)
	   {
	   n=0;
	   System.out.print(n);
	   }
           else
	   {	
	   n=1;
           System.out.print(n);
	   }
		

		 for(int j=1;j<5;j++)
		{
	   	if(n==1)
           	 n=0;
          	 else
           	n=1;
		System.out.print(n);
	  	}
		System.out.println();
	  }
		
       		
       		
    
  }
}


