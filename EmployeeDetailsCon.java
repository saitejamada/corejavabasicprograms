import java.util.Scanner;

class EmployeeDetailsCon
	{
		
		 String ename,address,doj; 
		
		 EmployeeDetailsCon(String ename,String doj,String address)
		{
		 this.ename=ename;
		 this.doj=doj;
		 this.address=address;
		}

		 void showEmployeeDetails()
		{
			
			System.out.print(ename+"		");
			System.out.print(doj+"			");
			System.out.print(address+"		");
			System.out.println();
		}

		
		public static void main(String[] args)
		{
		
			EmployeeDetailsCon s1=new EmployeeDetailsCon("robert","1994","64-C WallStreet");
			
			EmployeeDetailsCon s2=new EmployeeDetailsCon("Sam","2000","68-C WallStreet");
			EmployeeDetailsCon s3=new EmployeeDetailsCon ("john","1999","28-A WallStreet");
				
			System.out.println("Name		"+"DateOfJoining		"+"Address		");

			s1.showEmployeeDetails();
			s2.showEmployeeDetails();
			s2.showEmployeeDetails();
			
			
	       
	       }

	}