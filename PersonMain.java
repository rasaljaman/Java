class Person
{
	String name,dist;
	char gender;
	Person(String n, String d, char g)
	{
		name=n;dist=d;gender=g;
	}

	void printData()
	{	System.out.println("\n-------------------------------------------------------------");
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("District : " + dist);
		
	}

}

class Student extends Person
{
	
	int courseFee;
	Student(String n, String d, char g, int cf)
	{
		super(n,d,g);
		courseFee=cf;
	}

	int getNetFee()
	{
		int discount=0;
		if (dist.equals("MLP") )
		{
			discount = courseFee*10/100;
			if (gender=='F')
				discount = courseFee*15/100;
				
		}
	  return (courseFee-discount);

	}


}	

class Teacher extends Person
{
	int BP,DA,PF;
	Teacher(String n, String d, char g, int bp, int da, int pf)
	{
		super(n,d,g);
		BP=bp;DA=da;PF=pf;
	}
	int getSalary()
	{
		int salary = BP+BP*DA/100-PF;
		if (dist.equals("WYD") || dist.equals("IDK"))
			salary=salary+salary*10/100;

		return salary;
	}

}

class PersonMain
{

	public static void main(String[] args)
	{
		Student s1=new Student("John","MLP",'M',3000);
		Student s2=new Student("James","CLT",'M',3000);
		Student s3=new Student("Jeena","MLP",'F',3000);
		s1.printData();
		System.out.println("Course Fee afer discount : " + s1.getNetFee());
		s2.printData();
		System.out.println("Course Fee afer discount : " + s2.getNetFee());
		s3.printData();
		System.out.println("Course Fee afer discount : " + s3.getNetFee());

		Teacher t1=new Teacher("Rajan","CLT",'M',2000,30,500);
		Teacher t2=new Teacher("Sajan","WYD",'M',3000,30,500);
		Teacher t3=new Teacher("Meena","IDK",'F',2000,30,500);
		t1.printData();
		System.out.println("Net Salary is : " + t1.getSalary());
		
		t2.printData();
		System.out.println("Net Salary is : " + t2.getSalary());
		t3.printData();
		System.out.println("Net Salary is : " + t3.getSalary());
	
	}
}

			


