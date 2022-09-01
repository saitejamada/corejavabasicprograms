class RectangleConstructor
{
   int length,breath;
   double a,p;
	
  RectangleConstructor(int length,int breath)
  {
	this.length=length;
	this.breath=breath;
  }

	 double areaOfRectangle()
 	{
   	a=length*breath;
   	return a;
 	}

	double perimeterOfRectangle()
 	{
   	p=2*breath+length;
   	return p;
	}

	
 	public static void main(String[] args)
	{
	RectangleConstructor t=new RectangleConstructor(4,5);
	System.out.println("Length IS : "+t.length+" Breath Is : "+t.breath);
	System.out.println("Area Of Rectangle is "+t.areaOfRectangle());
	System.out.println("Perimeter Of Rectangle is "+t.perimeterOfRectangle());
	
        RectangleConstructor t1=new RectangleConstructor(5,8);
	System.out.println("Length IS : "+t1.length+" Breath Is : "+t1.breath);
	System.out.println("Area Of Rectangle is "+t1.areaOfRectangle());
	System.out.println("Perimeter Of Rectangle is "+t1.perimeterOfRectangle());
	
	}
}
	
	  