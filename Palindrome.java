import java.util.Scanner;
class Palindrome
{
  public static void main(String[] args)
   {
   int n,r=0,n1;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Number");
     n=sc.nextInt();
     n1=n;
     while(n>0)
     {
     r=(r*10)+n%10;
     n=n/10;
     }
     if(r==n1)
     {
	System.out.println("Number Is palindrome");
     }
      else 
       {
	 System.out.println("Number Is not a palindrome");
       }
     }
   }