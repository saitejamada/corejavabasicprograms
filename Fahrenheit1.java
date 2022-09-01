import java.util.Scanner;
class Fahrenheit1
{
public static void main(String[] args)
{
double c,f;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Celsius ");
c=sc.nextDouble();
f=(c*9/5)+32;
System.out.println("Entered Celsius is " +c+ " converted to fahrenheit is " +f);
}
}

