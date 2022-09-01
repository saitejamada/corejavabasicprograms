
import java.util.Scanner;
class Insurance
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println(" Please Enter Your  Details");
ch=sc.next().charAt(0);
if(ch=='U'||ch=='u')
{
System.out.println("Insurance Not Available");
}
else if(ch=='A'||ch=='a')
{
System.out.println("Insurance Is Double");
}

else if(ch=='M'||ch=='m')
{
System.out.println("Insurance Medically Dependent");
}
else
{
System.out.println("Inavlid data try again");
}
}
}
