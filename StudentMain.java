import java.util.Scanner;
class Student
{
	int regno,mark;
	String name;
	
	Student ()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter details of Student : " );
		System.out.print("Register No: ");
		regno=sc.nextInt();
		System.out.print("Name : ");
		sc.nextLine();name=sc.nextLine();
		System.out.print("Mark : ");
		mark=sc.nextInt();
		
	}
	
	char findGrade()
	{
		if (mark >=90) return 'S';
		else if (mark >=80) return 'A';
		else if (mark >=70) return 'B';
		else if (mark >=60) return 'C';
		else if (mark >=50) return 'D';
		else if (mark >=40) return 'E';
		else return 'F';
		
	}
}

class StudentMain
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner (System.in);
			Student stud1=new Student();
			Student stud2=new Student();
			Student stud3=new Student();
			System.out.printf("%d\t%s\t%d\t%c \n", stud1.regno, stud1.name, stud1.mark,stud1.findGrade());
			System.out.printf("%d\t%s\t%d\t%c \n", stud2.regno, stud2.name, stud2.mark,stud2.findGrade());
			System.out.printf("%d\t%s\t%d\t%c \n", stud3.regno, stud3.name, stud3.mark,stud3.findGrade());
			
		}
			
}
