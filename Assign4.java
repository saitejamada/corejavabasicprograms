
import java.util.Scanner;
class Assign4
{
     public static void main(String[] args)
     {
 	 Scanner sc=new Scanner(System.in);
 	 int year;
 	System.out.println(" Enter The Year");
 	year=sc.nextInt();
         if(year%4==0&&year%100==0&&year%400==0)
         {
          System.out.println(" leap year");
         }
         else
         {
            System.out.println(" Not a leap year");
         }
    }
}
  