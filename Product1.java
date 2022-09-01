import java.util.Scanner;
class Product1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a,b,c,res;
System.out.println("Enter a value  ");
a=sc.nextInt();
System.out.println("Enter b value  ");
b=sc.nextInt();
System.out.println("Enter c value  ");
c=sc.nextInt();
res=a*b*c;
System.out.println("the Result is "+res);
}
}