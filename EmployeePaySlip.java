import java.util.Scanner;

class EmployeePaySlip
{
 
 	int eid,medicalallowance=200,it=300;
	double basic,grosssal,netsal,ta,da,hra,pf;
	String name,joiningdate,birthdate;

	EmployeePaySlip(int id,String na,int bas,String jdate,String bdate)
	{
		eid=id;
		name=na;
		basic=bas;
		joiningdate=jdate;
		birthdate=bdate;
	}

		double calTa()
		{
		  ta=basic*0.05;	
		  return ta;	
		}
		  double  calDa()
		{
		  da=basic*0.08;
		  return da;		
		}
		 double calHra()
		{
		  hra=basic*0.10;
		  return hra;		
		}
		 double calPf()
		{
		  pf=basic*0.03;
		  return pf;		
		}
		double calGrosssal()
		{
		  grosssal=basic+ta+da+hra+medicalallowance;
		  return grosssal;		
		}
		double calNetsal()
		{
		  netsal=grosssal-(pf+it);
		  return netsal;		
		}

			public static void main(String[] args)
			{
			  EmployeePaySlip e=new EmployeePaySlip(121,"Sai",25000,"12oct2019","23jan1995");
			  System.out.println("Employee Name is :"+e.name);
			  System.out.println("Employee Id is :"+e.eid);
			  System.out.println("Employee Joining Date is :"+e.joiningdate);
			  System.out.println("Employee Birth Date is :"+e.birthdate);
			  System.out.println("Employee basic Salary is :"+e.basic);
			  System.out.println("Employee Travel Allowance  is :"+e.calTa());
			  System.out.println("Employee Dearness Allowance  is :"+e.calDa());
			  System.out.println("Employee House Rent Allowance  is :"+e.calHra());
			  System.out.println("Employee Provident Fund  is :"+e.calPf());
			  System.out.println("Employee Gross Salary  is :"+e.calGrosssal());
			  System.out.println("Employee Net Salary  is :"+e.calNetsal());

			  System.out.println("___________________________________");
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter Employee id");
			  int a=sc.nextInt();
			  System.out.println("Enter Employee Name");
			  String b=sc.next();
			  System.out.println("Enter Employee Joining date");
			  String c=sc.next();
			  System.out.println("Enter Employee Birth date");
			  String d=sc.next();
			  System.out.println("Enter Employee Basic");
			  int f=sc.nextInt();
			
			  
			  
			  EmployeePaySlip e1=new EmployeePaySlip(a,b,f,c,d);
			  System.out.println("Employee Name is :"+e1.name);
			  System.out.println("Employee Id is :"+e1.eid);
			  System.out.println("Employee Joining Date is :"+e1.joiningdate);
			  System.out.println("Employee Birth Date is :"+e1.birthdate);
			  System.out.println("Employee basic Salary is :"+e1.basic);
			  System.out.println("Employee Travel Allowance  is :"+e1.calTa());
			  System.out.println("Employee Dearness Allowance  is :"+e1.calDa());
			  System.out.println("Employee House Rent Allowance  is :"+e1.calHra());
			  System.out.println("Employee Provident Fund  is :"+e1.calPf());
			  System.out.println("Employee Gross Salary  is :"+e1.calGrosssal());
			  System.out.println("Employee Net Salary  is :"+e1.calNetsal());







			}
}