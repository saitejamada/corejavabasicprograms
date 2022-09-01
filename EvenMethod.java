import java.util.Scanner;
class EvenMethod

{
	
	
	static boolean even(int n)
	{
	  if(n%2==0)
          return true;
	  else
	  return false;
	 
 	}
	

	public static void main(String[] args)
	{
	  int n;
	  System.out.println(" Enter A Number "); 
          Scanner s=new Scanner(System.in);
	  n=s.nextInt();
          boolean res=even(n);
          if(res==true)
          System.out.println("No is Even");
 	  else
	  System.out.println("No Is Odd");
	}
}