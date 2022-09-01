class StarPattern2
{
public static void main(String[] args)
{
	for(int i=1;i<=4;i++)
           {
 		for(int j=1;j<=10;j++)
                {  
		System.out.print("*");
		if(i==2&&i==3)
			{
				if(j==1&&j==10)
				 {
					System.out.print("*");
				 }
			}
		  
           	}
                 
		System.out.println();
	   }
   }
}
