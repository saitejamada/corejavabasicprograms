import java.util.Scanner;
class SimpleInterest1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int p,t,r,si;
System.out.println("Enter The Principal Amount ");
p=sc.nextInt();
System.out.println("Enter The Time Period ");
t=sc.nextInt();
System.out.println("Enter The Rate Of Interest ");
r=sc.nextInt();
si=p*t*r/100;
System.out.println(" The Amount is " +p+ " The Time Period Is " +t+ " The Rate Of Interest "+r);
System.out.println(" the Interest is " +si);
}
}
 


