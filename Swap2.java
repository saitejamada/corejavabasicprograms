import java.util.Scanner;
class Swap2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a value");
a=sc.nextInt();
System.out.println("Enter b value");
b=sc.nextInt();
System.out.println("Values Before Swapping are "+a+" b value is "+b);
c=a;
a=b;
b=c;
System.out.println("Values after Swapping are "+a+" b value is "+b);
}
}