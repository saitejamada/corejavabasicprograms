class EmployeeDetails
	{
		 int empid;
		 String ename;
		 int salary;
		 String address; 
		
		 void getEmployeeDetails(int id,String name,int sal,String add)
		{
		  	empid=id;
		  	ename=name;
			salary=sal;
			address=add;
			
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
			EmployeeDetails s1=new EmployeeDetails();
			s1.getEmployeeDetails(11,"Teja",25000,"Hyderabad");
			s1.showEmployeeDetails();
			
			EmployeeDetails s2=new EmployeeDetails();
			s2.getEmployeeDetails(12,"Sai",15000,"Pune");
			s2.showEmployeeDetails();
	       
	       }

	}