
import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
int n,n1,s=0,r=0,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number");
n=sc.nextInt();
n1=n;
while(n>0)
{
r=n%10;
n=n/10;
s=s+(r*r*r);
}
if(n1==s)
{
System.out.println("no is armstrong");
}
else
{
System.out.println(" no is not a armstrong");
}
}
}
