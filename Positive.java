import java.util.Scanner;
class Positive
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter The Number");
n=sc.nextInt();
if(n>0)
{
System.out.println("The Given Number Is Positive");
}
else if(n<0)
{
System.out.println("The Given Number Is Negative");
}
else
{
System.out.println("The Number is Equal to zero");
}
}
}



