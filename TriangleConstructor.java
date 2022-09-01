class TriangleConstructor
{
   int side,side1,side2;
   double a,p;
	
  TriangleConstructor(int side,int side1,int side2)
  {
	this.side=side;
	this.side1=side1;
	this.side2=side2;
  }

	 void areaOfTriangle()
 	{
   	a=side*side1*side2*1/2;
   	System.out.println("Area Of Triangle is "+a);
 	}
	 void perimeterOfTriangle()
 	{
   	p=side+side1+side2;
   	System.out.println("Perimeter Of Triangle is "+p);
 	}
	

	
 	public static void main(String[] args)
	{
	TriangleConstructor t=new TriangleConstructor(3,4,5);
	t.areaOfTriangle();
	t.perimeterOfTriangle();

	
         	}
}
	
	  