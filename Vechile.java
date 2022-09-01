class Vechile
{

	int seats,wheels;
	String color,company;
	
	Vechile(int seats,int wheels,String color,String company)
	{
	 this.seats=seats;
	 this.wheels=wheels;
	 this.color=color;
	 this.company=company;
	}

	void Print()
	{
	 System.out.print("Seats Are"+seats);
	  System.out.print("No Of Wheels Are "+wheels);
	  System.out.print("Color is "+color);
	  System.out.print("Manufacturing Company is"+company);
	
	}
        
	public static void main(String[] args)
	{
	  Vechile v=new Vechile(2,2,"Black","Bajaj");
	 v.Print();
	 Vechile v1=new Vechile(4,5,"White","Mahindra");
	 v1.Print();
	  
	}
}

	   