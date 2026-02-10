import shapeSize.*;
public class FindArea
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(8,2);
		Circle c = new Circle(3);
		System.out.println("Area of rectangle is " + r.rectArea());
		System.out.println("Perimeter of rectangle is " + r.rectPerimeter());
		System.out.printf("\nArea of circle is %.2f ", c.circArea());
		System.out.printf("\nPerimeter of circle is %.2f", c.circPerimeter());
	}

}
