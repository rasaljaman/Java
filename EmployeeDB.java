//Get all rows from Employee table for a given department and salary
import java.util.Scanner;
import java.sql.*;
class EmployeeDB
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  String dpt;
	  int sal;
	  System.out.print("Enter department : ");
	  dpt=sc.nextLine();
	  System.out.print("Enter cut off salary : ");
	  sal=sc.nextInt();
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","sqlpass");
		PreparedStatement prps = con.prepareStatement("select * from employee where dept=? and salary>=?");
		prps.setString(1,dpt);
		prps.setInt(2,sal);
		
		ResultSet rs=prps.executeQuery();
		
		while (rs.next()) 
		{
			System.out.printf("%d %s %d\n",rs.getInt("emp_id"),rs.getString("name"),rs.getInt("salary"));
		}
		con.close();
	}
	catch(Exception e){System.out.println("Error"); }
	}

}
