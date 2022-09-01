
class EmployeeDetailsUsingStaticMethod
{

			int emp_id,emp_sal;
			static int count;
			String emp_name,emp_address;

		EmployeeDetailsUsingStaticMethod(int emp_id,String emp_name,int emp_sal,String emp_address)
		{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
		this.emp_address=emp_address;
		count++;
		}

		void printEmployeeDetais()
		{
		 System.out.println("Employee Id IS : "+emp_id);
		System.out.println("Employee Name IS : "+emp_name);
		System.out.println("Employee salary IS : "+emp_sal);
		System.out.println("Employee Address IS : "+emp_address);
		}
		
		static int getCount()
		{
			return count;
		}
		

		public static void main(String[] args)
		{
				
			 EmployeeDetailsUsingStaticMethod e=new  EmployeeDetailsUsingStaticMethod(121,"pavan",25000,"hyderabad");
			  e.printEmployeeDetais();

			 EmployeeDetailsUsingStaticMethod e1=new  EmployeeDetailsUsingStaticMethod(131,"kalyan",55000,"Vizag");
		         e1.printEmployeeDetais();
			System.out.println("Number Of Employees Are  "+getCount());
		}
}