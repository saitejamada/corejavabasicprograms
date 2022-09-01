import java.util.Scanner;

	class Max
	  {

	public static void main(String[] args)
        {
	   int n,max,min;
           Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Number");
           n=sc.nextInt();
	   max=n;
 	   min=n;
	   for(int i=1;i<=10;i++)
	    {
	  System.out.println("Enter Number");
           n=sc.nextInt();
	   
	 
          if(n>max)
	  {
          max=n;
	  }
	  if(n<min)
	  {
	   min=n;
          }
          
          }
          System.out.println("Maximum Number entered is "+max);
          System.out.println("Minimum Number entered is "+min);
	}
 }


					
		           
                           
			     
			 
