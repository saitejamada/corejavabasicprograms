import java.util.Scanner;

class EmployeeDetails1
	{
		 int empid;
		 String ename;
		 int salary;
		 String address; 
		
		 void getEmployeeDetails()
		{
		  	Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter the Employee id");
			empid=sc.nextInt();
			System.out.println("Enter the Employee name");
			ename=sc.next();
			System.out.println("Enter the Employee Salary");
			salary=sc.nextInt();
			System.out.println("Enter the Employee Address");
			address=sc.next();
		}

		 void showEmployeeDetails()
		{
			System.out.println("Employee Id Is : "+empid);
			System.out.println("Employee Name is : "+ename);
			System.out.println("Employee salary is : "+salary);
			System.out.println("Employee Address Is : "+address);
			System.out.println("_________________________________");
		}

		
		public static void main(String[] args)
		{
		
			EmployeeDetails1 s1=new EmployeeDetails1();
			s1.getEmployeeDetails();
			
			
			EmployeeDetails1 s2=new EmployeeDetails1();
			s2.getEmployeeDetails();

			s1.showEmployeeDetails();
			s2.showEmployeeDetails();
			
			
	       
	       }

	}