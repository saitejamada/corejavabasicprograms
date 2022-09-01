

	class EmployeeIdGeneration
	{
		static int emp_id=1001;
		String emp_name,emp_address;

	EmployeeIdGeneration(String emp_name,String emp_address)
	{
	  this.emp_name=emp_name;
	  this.emp_address=emp_address;
	}	
	 static int getId()
	{
	  emp_id++;
	  return emp_id;
	}
		void printEmployeeDetais()
		{
		 System.out.println("Employee Id IS : "+emp_id);
		System.out.println("Employee Name IS : "+emp_name);
		System.out.println("Employee Address IS : "+emp_address);
		}
	public static void main(String[] args)
	{
	
	
	EmployeeIdGeneration e= new EmployeeIdGeneration("sai","nizamabad");
	getId();
	e.printEmployeeDetais();
	
	EmployeeIdGeneration e1= new EmployeeIdGeneration("Teja","Hyderabad");
	getId();
	e1.printEmployeeDetais();

	EmployeeIdGeneration e2= new EmployeeIdGeneration("abc","pune");
	getId();
	e2.printEmployeeDetais();

	EmployeeIdGeneration e3= new EmployeeIdGeneration("xyz","goa");
	getId();
	e3.printEmployeeDetais();
	}
}

