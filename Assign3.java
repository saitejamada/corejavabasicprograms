import java.util.Scanner; 
class Perfect
{
  public static void main(String[] args)
   {
     int s=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Number");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
      if(n%i==0)
	{
	  s=s+i;
        }
   
      } 
       if(s==n)
      {
        System.out.println("No Is Perfect Number");
	}
	else
	{
	System.out.println("No Is Not A Perfect Number");
	}
}
} 