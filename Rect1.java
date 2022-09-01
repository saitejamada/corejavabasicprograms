import java.util.Scanner;
class Rect1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int l,b,p,a;
System.out.println("Enter The Length ");
l=sc.nextInt();
System.out.println("Enter The Breath");
b=sc.nextInt();
p=2*l+b;
a=l*b;
System.out.println("Entered Length is "+l+"Entered  breath is "+b);
System.out.println("the perimeter of rectangle is "+p+" the area of rectangle is "+a);
}
}
