
import java.util.Scanner;

class Bank
	{
	  int bal,amount;
	  String name;
          char ch;		
	
	  

	void checkBalance(int b)
	{
	bal=b;
	 System.out.println("Balance in Account IS : "+bal);
	 
	 
	}
	
		int deposit(int amt,int b)
		{
		bal=b;
		amount=amt;
		bal+=amount;
		System.out.println("Amount Deposited Account Balance IS "+bal);
		return bal;
		}
		
			int withdraw(int amt,int b)
			{
			bal=b;
			amount=amt;
			bal=bal-amt;
			System.out.println("Withdrawal Sucessfull  Account Balance IS "+bal);
			return bal;
			}
	
				public static void main(String[] args)
				{
				Scanner sc=new Scanner(System.in);
				int a,b,op,acctno;
				char c;
				System.out.println("Enter Account no");
				acctno=sc.nextInt();
				System.out.println("Enter balance");
				b=sc.nextInt();
				
				do
				{
				System.out.println("Choose Options 1) Withdraw 2) deposit 3)CheckBalance");
				System.out.println("Enter The Option");
				op=sc.nextInt();
				
				Bank b1=new Bank();
				
				if(op==1)
				{
				System.out.println("Enter Amount");
				a=sc.nextInt();

				b=b1.withdraw(a,b);
			
				}
				else if(op==2)
				{
				System.out.println("Enter Amount");
				a=sc.nextInt();

				 b=b1.deposit(a,b);
				 
				}
				else if(op==3)
				{
				 b1.checkBalance(b);
				
				}
				System.out.println("Do you Want to continue Y/N");
				c=sc.next().charAt(0);
				}while(c=='y'||c=='Y');
				

}
}
				