import java.util.Scanner;
class Rect3
{
	int length,breadth;
	int findArea()
	{
		int area;		
		area=length*breadth;
		return (area);
		
	}
}

class Rect3Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int rectArea;
		Rect2 r=new Rect2();
		System.out.println("Enter Length and breadth of rectangle: ");
		r.length=sc.nextInt();
		r.breadth=sc.nextInt();
		rectArea=r.findArea();
		System.out.println("Area is : "+rectArea);
	}
}
