import java.util.Scanner;

class LeapYear
{
	int year;
	LeapYear(int year)
	{
	  this.year=year;
	}

	void checkLeapYear()
	{
	  if(year%4==0&&year%400==0&&year%100==0)
	   System.out.println("A Leap Year");
	   else
	   System.out.println("Given Year Is Not A Leap Year");
	}
	
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Year");
	 int year1=sc.nextInt();
	 LeapYear l=new LeapYear(year1);
	l.checkLeapYear();
	 
	}
} 
	 