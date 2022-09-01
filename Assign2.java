class Assign2
{
  public static void main(String[] args)
   {
     int s=0,r=0,i1=0;
     for(int i=1;i<=1000;i++)
      {
        i1=i;
        while(i1>0)
        {
	r=i1%10;
	i1=i1/10;
	s=s+(r*r*r);
	}
	if(i==s)
	{
	System.out.println(" "+i);
	}
        s=0;
   
       }
    } 
  }
       
            