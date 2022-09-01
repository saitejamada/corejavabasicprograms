
	class EmployeeStaticDetails
	{
			int emp_id,emp_sal;
			
			String emp_name,emp_address;

		void getEmployeeDetais(int emp_id,String emp_name,int emp_sal,String emp_address)
		{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
		this.emp_address=emp_address;
		
		}
		void showgetEmployeeDetais()
		{
		 System.out.println("Employee Id IS : "+emp_id);
		System.out.println("Employee Name IS : "+emp_name);
		System.out.println("Employee salary IS : "+emp_sal);
		System.out.println("Employee Address IS : "+emp_address);
		}
		

		public static void main(String[] args)
		{
				
			EmployeeStaticDetails e=new EmployeeStaticDetails();
			e.getEmployeeDetais(121,"pavan",25000,"hyderabad");
			e.showgetEmployeeDetais();

			EmployeeStaticDetails e1=new EmployeeStaticDetails();
			e1.getEmployeeDetais(131,"kalyan",55000,"Vizag");
			e1.showgetEmployeeDetais();
			
		}
}