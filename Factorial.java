import javax.swing.*;
import java.awt.event.*;
class Factorial
{
	public static void main(String[]args)
	{
		JFrame fr=new JFrame("Factorial Calculator");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		fr.setSize(400,250);
		
		JLabel lblNum = new JLabel("Enter Number :");
		lblNum.setBounds(5, 20, 150, 30); 
		
		JTextField tfNum=new JTextField();
		tfNum.setBounds(150,20, 50,30);
		
		JLabel lblFact = new JLabel("Factorial :");
		lblFact.setBounds(5, 60, 150, 30); 
		
		JTextField tfFact=new JTextField();
		tfFact.setBounds(150,60,100,30);
		
		
		JButton btn=new JButton("Calculate");
		btn.setBounds(50,100,100,30);
				
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(tfNum.getText());
				int fact = 1;
				for(int i=1; i<=a;i++)
				{
					fact = fact * i;
				}
				tfFact.setText(Integer.toString(fact));
			}
		});
				
		fr.add(tfNum);
		fr.add(tfFact);
		fr.add(btn);
		fr.add(lblNum);
		fr.add(lblFact);
		fr.setVisible(true);
	}
}
