
class SwapMethod

{
	
	static void swap(int a,int b)
	{
	  
	  int c=a;
	  a=b;
	  b=c;
	  System.out.println("Values After Swap a value is : " +a+" b value is : "+b);
	 
 	}
	

	public static void main(String[] args)
	{
	  int a,b;
	   a=10;b=20;
	   System.out.println("Values before swap a value is : " +a+" b value is : "+b);
	   swap(a,b);
	   
	}
}