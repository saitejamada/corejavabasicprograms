 import java.util.Scanner;

class StudentGrade1

{

public static void main(String[] args)
  {
    int p,c,m,t=0;
    double per;
    Scanner sc=new Scanner(System.in);
       for(int i=1;i<=5;i++)
        {
        System.out.println("Enter Physics Marks");
        p=sc.nextInt();
        System.out.println("Enter Computer Marks");
	c=sc.nextInt();
	System.out.println("Enter Physics Marks");
	m=sc.nextInt();
	t=p+c+m;
	per=t/3;
        System.out.println("Total is "+t);
	System.out.println("percantage is "+per);
        if(per>=80)
        {
	System.out.println(" A Grade");
	}
	else if(per>=70)
	{
	System.out.println(" B Grade");
	}
	else if(per>=60)
	{
	System.out.println(" c Grade");
	}
	else if(per>=50)
	{
	System.out.println(" D Grade");
	}
	else 
	{
	System.out.println(" F Grade");
	}
      }
   }
}
     
   	
					
				  

  


