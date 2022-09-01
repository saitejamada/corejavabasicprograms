import java.util.Scanner;
class StudentGrade
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int p,c,m,t;
int per;
System.out.println("Enter Physics Marks");
p=sc.nextInt();
System.out.println("Enter computer Marks");
c=sc.nextInt();
System.out.println("Enter Maths Marks");
m=sc.nextInt();
t=p+c+m;
per=t/3;
System.out.println("Total marks Are "+t+"The Percantage is "+per);
if(per>=80)
{
System.out.println(" A Grade");
}
else if(per>=70)
{
System.out.println(" B Grade");
}
else if(per>=60)
{
System.out.println(" c Grade");
}
else if(per>=50)
{
System.out.println(" D Grade");
}
else 
{
System.out.println(" F Grade");
}
}
}

