import java.util.Scanner;

class StudentDetailsGrade
	{
		 int sid;
		 String sname;
		char grade;
		 int p,c,m,t;
		  int avg;
		
		 void getStudentDetails()
		{
		  	Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter the Student id");
			sid=sc.nextInt();
			System.out.println("Enter the Student name");
			sname=sc.next();
			System.out.println("Enter the Physics Marks");
			p=sc.nextInt();
			System.out.println("Enter the Maths Marks");
			m=sc.nextInt();
			System.out.println("Enter the ComputerScience  Marks");
			c=sc.nextInt();
			
		}

		 void showStudentDetails()
		{
			System.out.println("Student Id Is : "+sid);
			System.out.println("Student Name is : "+sname);
			System.out.println(" Total : "+t);
			System.out.println(" Percantage is"+avg);
			System.out.println(" Grade is"+grade);
			System.out.println("_________________________________");
		}

		void calculateTotal()
		{
		 t=p+c+m;
		}
		
		void calculateAvg()
		{
			avg=t/3;
			if(avg>=80)
			grade='A';
			else if(avg>=70)
			grade='B';
			else if(avg>=60)
			grade='c';
			else if(avg>=50)
			grade='D';
			else if(avg>=40)
			grade='E';
			
			else 
			grade='F';
		
		
		
		}

		
		public static void main(String[] args)
		{
		
			StudentDetailsGrade s1=new StudentDetailsGrade();
			s1.getStudentDetails();
			s1.calculateTotal();
			s1.calculateAvg();

			
			
			StudentDetailsGrade s2=new StudentDetailsGrade();
			s2.getStudentDetails();
			s2.calculateTotal();
			s2.calculateAvg();
			
			StudentDetailsGrade s3=new StudentDetailsGrade();
			s3.getStudentDetails();
			s3.calculateTotal();
			s3.calculateAvg();
			
			StudentDetailsGrade s4=new StudentDetailsGrade();
			s4.getStudentDetails();
			s4.calculateTotal();
			s4.calculateAvg();
		
			StudentDetailsGrade s5=new StudentDetailsGrade();
			s5.getStudentDetails();
			s5.calculateTotal();
			s5.calculateAvg();





			s1.showStudentDetails();
			s2.showStudentDetails();
			s3.showStudentDetails();
			s4.showStudentDetails();
			s5.showStudentDetails();
			
			
			
			
	       
	       }

	}