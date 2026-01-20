import java.util.Scanner;
class Shapes
{
	
	float rectArea(float l)
	{
		return (l*l);
	}

	float rectArea(float l, float b)
	{
		return (l*b);
	}

	float rectArea(float l, float b, float h)
	{
		return (2*(l*b+l*h+b*h));
	}
}
	
	

class ShapeMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		Shapes s=new Shapes();
		int choice;
		float l,b,h,area=0;
		do
		{
			System.out.println("\n\n\n1. Area of Square");
			System.out.println("2. Area of Rectangle");
			System.out.println("3. Area of Cuboid");
			System.out.println("4. Exit");
			System.out.println("\n\nEnter your option : ");
			choice = sc.nextInt();
			switch(choice)
			{
				
				case 1: System.out.print("Enter length : ");
							l = sc.nextInt();
							area=s.rectArea(l);
							break;
				case 2: System.out.print("Enter length and breadth : ");
							l = sc.nextInt();b=sc.nextInt();
							area=s.rectArea(l,b);
							break;
				case 3: System.out.print("Enter length, breadth and height : ");
							l = sc.nextInt();b=sc.nextInt();h=sc.nextInt();
							area=s.rectArea(l,b,h);
							break;
				case 4: System.exit(0);
							

			}

			System.out.println("\n\n Area is  : " + area);
		}while(choice!=4);		
		
	}

}
