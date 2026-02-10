import java.util.Scanner;
interface Geometry
{
	float pi=3.14f;
	float findArea();
}

class Rectangle implements Geometry
{
	float l,b;
	public float findArea()
	{
		return l*b;
	}
}

class Circle implements Geometry
{
	float rad;
	public float findArea()
	{
		return pi*rad*rad;
	}
}

class Interface 
{
	public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		Circle c= new Circle();
		System.out.print("Enter length and breadth of rectangle : ");
		r.l=sc.nextFloat();
		r.b=sc.nextFloat();
		System.out.print("Enter radius of circle : ");
		c.rad=sc.nextFloat();
		System.out.println("Area of rectangle is : " + r.findArea());
		System.out.println("Area of Circle is : " + c.findArea());
	}
}


