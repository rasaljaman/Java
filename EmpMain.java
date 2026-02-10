
import java.util.Scanner;
class Employee
{
	String name, desig;
	int BP,PF,MI,HRA,DA;
	
	
	void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		name=sc.nextLine();
		System.out.print("Enter designation : ");
		desig=sc.nextLine();
		System.out.print("Enter Basic Pay : ");
		BP=sc.nextInt();
		System.out.print("Enter rate of HRA and DA : ");
		HRA=sc.nextInt(); DA=sc.nextInt();

		System.out.print("Enter deductions PF and MI : ");
		PF=sc.nextInt(); MI=sc.nextInt();
	}
     float calculateSalary()
	{
		float sal = BP+BP*HRA/100+BP*DA/100-PF-MI;
		return sal;

	}
}

class SalesRep extends Employee
{
	int  saleAmount, bonus;
	float getSalary()
	{
		float sal=super.calculateSalary()+saleAmount*bonus/100;
		return sal;
	}


}	

class EmpMain
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		SalesRep rep = new SalesRep();
		rep.setData();
		System.out.print("Enter sales amount : ");
		rep.saleAmount = sc.nextInt();
		System.out.print("Enter bonus rate : ");
		rep.bonus = sc.nextInt();
		System.out.println("\n\nEmployee name : " + rep.name);
		System.out.println("Designation : " + rep.desig);
		System.out.println("Net Salary is : " + rep.getSalary());

	
	
	}
}

			


