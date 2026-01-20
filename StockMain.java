import java.util.Scanner;
class Stock
{
	int prodId,qty,reorderQty;
	float price;
	String product;
	float findRate()
	{
		return qty*price;
	}
}



class StockMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		Stock[] items = new Stock[10];
		int n;
		float stockValue=0;
		System.out.print("How many products ? : ");
		n=sc.nextInt();
		for(int i=0; i<n;i++)	
		{

			items[i] = new Stock();
			System.out.println("Enter details of product " + (i+1) );
			System.out.print("Enter product ID : ");
			items[i].prodId = sc.nextInt();
			System.out.print("Enter product name : ");
			sc.nextLine();items[i].product = sc.nextLine();
			System.out.print("Enter Quantity : ");
			items[i].qty = sc.nextInt();
			System.out.print("Enter Re-order Quantity : ");
			items[i].reorderQty = sc.nextInt();
			System.out.print("Enter product price : ");
			items[i].price = sc.nextFloat();

		}
	
		System.out.println("\n\nList of reorder items : ");
		for(int i=0;i<n;i++)
		{
			stockValue=stockValue+items[i].findRate();

			if (items[i].qty < items[i].reorderQty)
			{		
				System.out.printf("%s\t%d\t%d\n",items[i].product,items[i].qty,items[i].reorderQty);
			}
		}
		System.out.println("Total Stock value is : " + stockValue);
	}

}
