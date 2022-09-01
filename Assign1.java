class Assign1
{
 public static void main(String[] args)
   {
         int p=0;
	for(int i=2;i<=100;i++)
         {  
           p=0;
           for(int j=2;j<=i/2;j++)
            {
              if(i%j==0)
               { 
                 p=1;
                 break;
                 
                }
              
              } 
            if(p==0)
           System.out.println(" prime no are "+i);
            
         } 
                          
            
     }
}
