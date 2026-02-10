package shapeSize;
public class Circle
{
	int radius;
	public Circle(int r)
	{
		radius=r;
		
	}

	
	public double circArea()
	{
		return Math.PI*radius*radius;
	}

	public double circPerimeter()
	{
		return 2*Math.PI*radius;
	}
}
