import java.util.Scanner;
class MaxOfTwo
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a,b,max;
System.out.println("Enter a value");
a=sc.nextInt();
System.out.println("Enter b value");
b=sc.nextInt();
max=(a>b)?a:b;
System.out.println("the a value is " +a+" b value is "+b+"the maximum number is "+max);
}
}
