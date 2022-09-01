import java.util.Scanner;
class Student1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int p,c,m,t;
double per;
System.out.println("Enter Physics Marks");
p=sc.nextInt();
System.out.println("Enter computer Marks");
c=sc.nextInt();
System.out.println("Enter Maths Marks");
m=sc.nextInt();
t=p+c+m;
per=t/3;
System.out.println("Total marks Are "+t+"The Percantage is "+per);
}
}

