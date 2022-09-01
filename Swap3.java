import java.util.Scanner;
class Swap3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter a value");
a=sc.nextInt();
System.out.println("Enter b value");
b=sc.nextInt();
System.out.println("Values Before Swapping are a is "+a+" b value is "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("Values After Swapping are a is" +a+" b value is " +b);
}
}


