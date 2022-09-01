

import java.util.Scanner;

class StudentDetailsConstructor 
{

	 static int sid,p,c,m,t,avg;
	 static String name;
		
		
	
	public static void main(String[] args)
	{
	 	
	
		
	 	StudentDetailsConstructor s=new StudentDetailsConstructor();
	 	StudentDetailsConstructor s1=new StudentDetailsConstructor();
	 	s1.setSid(12);
	 	s1.setName("Sai");
	 	s1.setP(50);
	 	s1.setC(60);
	 	s1.setM(70);
	 	s1.setT(180);
	 	s1.setP(60);
	 	
	 	int a=s1.getSid();
	 	String b=s1.getName();
	 	int c=s1.getT();
	 	int d=s1.getP();
	 	 
	 	System.out.println("S id "+a+" name is"+b+" total "+c+"percantage is"+d);
	 	
	 	
	 	
	}
	
	StudentDetailsConstructor()
	{
		Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter Student id");
	 	sid=sc.nextInt();
	 	System.out.println("Enter Student Name");
	 	name=sc.next();
	 	System.out.println("Enter Physics Marks");
	 	p=sc.nextInt();
	 	System.out.println("Enter Maths Marks");
	 	m=sc.nextInt();
	 	System.out.println("Enter Computer Marks");
	 	c=sc.nextInt();
	 	t=p+c+m;
	 	avg=t/3;
	 	System.out.println("Student name is"+name);
	 	System.out.println("Student id is"+sid);
	 	System.out.println("Student total is"+t);
	 	System.out.println("Student percantage is"+p);
	 	
	 	
	 	
	}



	public static int getSid() {
		return sid;
	}



	public static void setSid(int s) {
		sid = s;
	}



	public static int getP() 
	{
		return p;
	}



	public static void setP(int p1)
	{
		p = p1;
	}



	public static int getC() 
	{
		return c;
	}



	public static void setC(int c1) 
	{
		c = c1;
	}



	public static int getM() 
	{
		return m;
	}



	public static void setM(int m1)
	{
	m = m1;
	}



	public static int getT()
	{
		return t;
	}



	public static void setT(int t1) 
	{
		t = t1;
	}



	public static String getName() 
	{
		return name;
	}



	public static void setName(String name1) 
	{
		name = name1;
	}
}
