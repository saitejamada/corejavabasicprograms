class StarPattern1
{
public static void main(String[] args)
{
	for(int i=1;i<=5;i++)
      {
          for(int j=1;j<=10;j++)
	{
	  if(i==1)
  	  System.out.print("*"+" ");
	  else if(j==1)
	  System.out.print("*"+" ");
	   else if(j==10)
	   System.out.print("*"+" ");
	  else if(i==5)
	  System.out.print("*"+" ");
          else
          System.out.print(" "+" ");
         }
      System.out.println();
    }
  }
}