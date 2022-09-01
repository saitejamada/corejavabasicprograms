
import java.util.Scanner;
class Operation
{
public static void main(String[] args)
{
int a,b,c,res;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
a=sc.nextInt();
System.out.println("Enter b value");
b=sc.nextInt();
System.out.println("Choose Your preferences");
System.out.println("1) Addition 2) Subtraction 3) Multiplication 4) Division");
System.out.println("Enter Your choice");
c=sc.nextInt();
if(c==1)
{
res=a+b;
System.out.println("the addition of two numbers " +a+ " and  " +b+ " is : "+res);
}
else if(c==2)
{
res=a-b;
System.out.println("the addition of two numbers " +a+ " and  " +b+ " is : "+res);
}
else if(c==3)
{
res=a*b;
System.out.println("the addition of two numbers " +a+ " and  " +b+ " is : "+res);
}
else if(c==4)
{
res=a/b;
System.out.println("the addition of two numbers " +a+ " and  " +b+ " is : "+res);
}
else
{
System.out.println("invalid input");
}
}
}


