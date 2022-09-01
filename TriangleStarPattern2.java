class TriangleStarPattern2
{
  public static void main(String[] args)
    {
       int star=1,space=4;
       
       for(int i=1;i<=5;i++)
    	{
 	for(int k=1;k<=space;k++)
	{
	  System.out.print(" ");
         }
          for(int j=1;j<=star;j++)
	   { 
             if(i==3||i==4)
             {
                if(j==2||j==3&&i==4)
                 {
                  System.out.print(" " + " ");
		    }
                 else
                   {
             System.out.print("*" + " ");
                }
                
               }
           else
              {
             System.out.print("*" + " ");
                }
	   }
           
            System.out.println();
           star++;
           space--; 
	  }
	}
}
