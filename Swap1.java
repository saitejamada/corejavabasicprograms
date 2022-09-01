class Swap1
{
public static void main(String[] args)
{
int a=2,b=4;
System.out.println("values Before swapping a = "+a+" b is b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("values after swapping a = "+a+" b is b="+b);
}
}