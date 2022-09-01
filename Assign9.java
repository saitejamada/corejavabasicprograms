class Assign9
{
   public static void main(String[] args)
  {
     for(char ch='A';ch<='E';ch++)
      {
         for(char ch1='A';ch1<=ch;ch1++)
           {
             System.out.print(ch+" ");
	     if(ch1=='B')
             break;
           }
           System.out.println();
      }
       for(char i='F';i>='A';i--)
        {
          for(char j='A';j<=i;j++)
  	   {
                  System.out.print(i+" ");
                  if(j=='B')
                  break;
	  }
       System.out.println();

   }
}}