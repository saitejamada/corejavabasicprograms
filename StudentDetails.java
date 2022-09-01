import java.util.Scanner;

class StudentDetails
	{
		 int sid;
		 String sfirstname;
		 int year;
		 String slastname; 
		String course;
		
		 void getStudentDetails()
		{
		  	Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter the Student id");
			sid=sc.nextInt();
			System.out.println("Enter the First name");
			sfirstname=sc.next();
			System.out.println("Enter the Second name");
			slastname=sc.next();
			System.out.println("Enter the course");
			course=sc.next();
			System.out.println("Enter the Year");
			year=sc.nextInt();

			
		}

		 void showStudentDetails()
		{
			System.out.println("Student Id Is : "+sid);
			System.out.println("Student Name is : "+sfirstname+" "+slastname);
			System.out.println(" Studies : "+course);
			System.out.println(" Is In : "+year+" year");
			System.out.println("_________________________________");
		}

		
		public static void main(String[] args)
		{
		
			StudentDetails s1=new StudentDetails();
			s1.getStudentDetails();
			
			
			StudentDetails s2=new StudentDetails();
			s2.getStudentDetails();

			s1.showStudentDetails();
			s2.showStudentDetails();
			
			
	       
	       }

	}