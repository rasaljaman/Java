package shapeSize;
public class Rectangle
{
	int length,breadth;
	public Rectangle(int l, int b)
	{
		length=l; breadth=b;
		
	}

	
	public int rectArea()
	{
		return length*breadth;
	}

	public int rectPerimeter()
	{
		return 2*(length+breadth);
	}
}
