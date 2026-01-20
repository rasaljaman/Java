class Rect1
{
	int length=8,breadth=5;
	int findArea()
	{
		int area;		
		area=length*breadth;
		return (area);
		
	}
}

class Rect1Main
{
	public static void main(String args[])
	{
		int rectArea;
		Rect1 r=new Rect1();
		rectArea=r.findArea();
		System.out.println("Area is : "+rectArea);
	}
}
