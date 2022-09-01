import java.util.Scanner;
class PrimeMethod

{
	static int prime(int n,int count)
	{
	  for(int i=2;i<=n-1;i++)
	{
	  if(n%i==0)
           {
		count++;
	    }
	 }
	  return count;
	}
	
	public static void main(String[] args)
	{
          int n,count=0,res;
	  System.out.println(" Enter A Number "); 
          Scanner s=new Scanner(System.in);
	  n=s.nextInt();
          res=prime(n,count);
	  if(res>=1)
          System.out.println("Number IS Not A Prime");
	  else
	  System.out.println("Number Is prime");
	}
}