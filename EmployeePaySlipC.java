import java.util.Scanner;

class EmployeePaySlipC
{
 
 	int eid,medicalallowance=200,it=300;
	double basic,grosssal,netsal,ta,da,hra,pf;
	String name,joiningdate,birthdate;


	EmployeePaySlipC()
	{
	  this(10000,"12oct2019","23jan1995");
	}
	EmployeePaySlipC(int eid,String name)
	{
	this.eid=eid;
	this.name=name;
	}

	EmployeePaySlipC(int basic,String joiningdate,String birthdate)
	{
		this(121,"Sai");
		this.basic=basic;
		this.joiningdate=joiningdate;
		this.birthdate=birthdate;
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
			  EmployeePaySlipC e=new EmployeePaySlipC();
				
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


                     }
}