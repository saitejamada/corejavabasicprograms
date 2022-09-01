 import java.util.Scanner;

class StudentGradeNnumbe

{

	public static void main(String[] args)
  	{
    	 	int p,c,m,t=0,no,ht;
    		double per;
		String name;
   		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter HallTicket Number");
		ht=sc.nextInt();
		System.out.println("Enter The Number Of Subjects");
		no=sc.nextInt();
		int a[]=new int[no];
	
       		for(int i=0;i<no;i++)
        	{
		System.out.println("Enter Subject "+i+ " Marks");
		a[i]=sc.nextInt();
		if(a[i]<0)
		{
		do
		{
		System.out.println("In valid Input Marks cannot be negative Re Enter Marks");
		a[i]=sc.nextInt();									if(number == 9)
		}while(a[i]<0);
		}
		t+=a[i];
		}
		per=t/no;if
		System.out.println("Student name is"+name);
		System.out.println("Hall Ticket Number Is: "+ht);
		System.out.println("Total Marks "+t);
		System.out.println("Percantage Is "+per);
		
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
     
   	
					
				  

  


