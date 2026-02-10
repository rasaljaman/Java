import java.util.*;
class CircDisplay
{
	
	public static void main(String[] args)
	{
		int num[] ={3,5,2,7,4,12,8}; 
		int pos=0;
		
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Given Array is : ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+ "  ");
			
		}
	
		try
		{
			System.out.print("\nEnter starting position : ");
			pos= sc.nextInt();
			pos--;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Wrong intput !!! ");
			System.exit(0);
		}


		System.out.print("\nArray displayed in circluar fashion: ");
		for(int i=0; i<num.length;i++)
		{
		
			try 
			{
			System.out.print(num[pos]+ "  ");
			pos = (pos +1) % num.length;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("\nInvalid position !! ");
				break;
			}
			
		}

		System.out.println("\nThank you");
 
	}
}

			


