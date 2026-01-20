class Rect2
{
	int length,breadth;
	int findArea()
	{
		int area;		
		area=length*breadth;
		return (area);
		
	}
}

class Rect2Main
{
	public static void main(String args[])
	{
		int rectArea;
		Rect2 r=new Rect2();
		r.length=20;
		r.breadth=5;
		rectArea=r.findArea();
		System.out.println("Area is : "+rectArea);
	}
}
