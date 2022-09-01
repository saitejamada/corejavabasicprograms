import java.util.Scanner;
class MaxOfThree1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a value");
a=sc.nextInt();
System.out.println("Enter b value");
b=sc.nextInt();
System.out.println("Enter c value");
c=sc.nextInt();
if(a>b&&a>c)
{
System.out.println("a is greater");
}
else if(b>a&&b>c)
{
System.out.println("b is greater");
}
else 
{
System.out.println("c is greater");
}
}
}


