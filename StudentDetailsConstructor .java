
import java.util.Scanner;
class SD
{
int sid,p,c,m,t,avg;
String name; SD(int id,String nm,int p1,int c1,int m1)
{
sid=id;
name=nm;
p=p1;
c=c1;
m=m1;
}
void setSid(int id)
{
sid=id;
}
int getSid()
{
return sid;
}
void setName(String nm)
{
name=nm;
}
String getName()
{
return name;
} void setP(int p1)
{
p=p1;
}
int getP()
{
return p;
} void setC(int c1)
{
c=c1;
}
int getC()
{
return c;
}
void setM(int m1)
{
m=m1;
}
int getM()
{
return m;
}
int calcTotal()
{
t=p+c+m;
return t;
}
int calcAvg()
{
avg=t/3;
return avg;
} public static void main(String[] args)
{
SD s=new SD(100,"Mona",90,90,90);
//int t=s.calcTotal();
//int per=s.calcAvg();
System.out.println("Printing Student Details");
System.out.println("Student Id="+s.getSid());
System.out.println("Student Name="+s.getName());
System.out.println("Total Marks="+s.calcTotal());
System.out.println("Percentage="+s.calcAvg()+"%");
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student Id");
int id=sc.nextInt(); System.out.println("Enter Student Name");
String nm=sc.next();
System.out.println("Enter Physics Marks");
int p=sc.nextInt(); System.out.println("Enter Chem Marks");
int c=sc.nextInt();
System.out.println("Enter Maths Marks");
int m=sc.nextInt();
SD s1=new SD(id,nm,p,c,m);
System.out.println("Printing New Student Details");
System.out.println("Student Id="+s1.getSid());
System.out.println("Student Name="+s1.getName());
System.out.println("Total Marks="+s1.calcTotal());
System.out.println("Percentage="+s1.calcAvg()+"%"); }
}

