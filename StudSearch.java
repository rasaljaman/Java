import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class StudSearch
{
	static int rgn;
	public static void main(String[] args)
	{
		JFrame fr = new JFrame("Student Search");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		fr.setSize(500,300);
		
		JLabel lbl1 = new JLabel("Regiseter No:");
		lbl1.setBounds(10,10,150,30);
		JTextField tfRgno = new JTextField();
		tfRgno.setBounds(120,10,100,30);
		
		JLabel lbl2 = new JLabel("Name :");
		lbl2.setBounds(10,60,100,30);
		JTextField tfName = new JTextField();
		tfName.setBounds(120,60,100,30);
	
		JLabel lbl3 = new JLabel("Mark :");
		lbl3.setBounds(10,110,120,30);
		JTextField tfMark = new JTextField();
		tfMark.setBounds(120,110,100,30);
		
		JLabel lbl4 = new JLabel();
		lbl4.setBounds(10,160,120,30);
			
		JButton btn = new JButton("Search");
		btn.setBounds(250,120,120,30);
		
		try{
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","sqlpass");
		  PreparedStatement prps = con.prepareStatement("select * from student where regno=?");
			
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				rgn= Integer.parseInt(tfRgno.getText());
			try{
				  prps.setInt(1,rgn);
				  ResultSet rs=prps.executeQuery();
				  if (rs.next())
				  {
				    tfName.setText(rs.getString("name"));
				    tfMark.setText(rs.getString("mark")); // mark will be converted to string
				    lbl4.setText("Status: Found");
          }
          else
          {
            tfName.setText("");
            tfMark.setText("");
            lbl4.setText("Status: Not Found");
          }
        }	catch(Exception e1){System.out.println("Data base access Error"); }	
				
			}
		});
		
	}
  catch(Exception e2){System.out.println("Data base connection Error"); }	
	
		fr.add(lbl1);
		fr.add(lbl2);
		fr.add(lbl3);
		fr.add(lbl4);
		fr.add(tfRgno);
		fr.add(tfName);
		fr.add(tfMark);
		fr.add(btn);
		fr.setVisible(true);
		
	}
}
