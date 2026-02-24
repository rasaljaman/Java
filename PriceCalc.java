import java.awt.event.*;
import javax.swing.*;

class PriceCalc
{
	static int qty,rate,amt,gst;
	public static void main(String[] args)
	{
		JFrame fr = new JFrame("Factorial and sum fo digits");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		fr.setSize(500,300);
		
		JLabel lbl1 = new JLabel("Enter qty :");
		lbl1.setBounds(10,10,100,30);
		JTextField tfQty = new JTextField();
		tfQty.setBounds(120,10,100,30);
		
		JLabel lbl2 = new JLabel("Enter rate :");
		lbl2.setBounds(10,60,100,30);
		JTextField tfRate = new JTextField();
		tfRate.setBounds(120,60,100,30);
	
		JLabel lbl3 = new JLabel("Amount :");
		lbl3.setBounds(10,110,120,30);
		JTextField tfAmt = new JTextField();
		tfAmt.setBounds(120,110,100,30);
		
		JLabel lbl4 = new JLabel("Total Amount :");
		lbl4.setBounds(10,160,120,30);
		JTextField tfTotal = new JTextField();
		tfTotal.setBounds(120,160,100,30);
		
		
		JRadioButton rbCosm = new JRadioButton("Cosmetics GST 10%");
		JRadioButton rbVeg = new JRadioButton("Vegetables GST 5%");
		ButtonGroup group = new ButtonGroup();
		group.add(rbCosm);
		group.add(rbVeg);
		rbCosm.setBounds(250,50,200,30);
		rbVeg.setBounds(250,80,200,30);
		
		JButton btn = new JButton("Find Rate");
		btn.setBounds(250,120,120,30);
		
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				qty= Integer.parseInt(tfQty.getText());
				rate = Integer.parseInt(tfRate.getText());
				amt = qty*rate;
				tfAmt.setText(Integer.toString(amt));
				tfTotal.setText(tfAmt.getText());
							
			}	
		 });
		 
		rbCosm.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tfTotal.setText(Float.toString(amt+amt*0.10F));
			}	
		 });
		
		rbVeg.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tfTotal.setText(Float.toString(amt+amt*0.05F));
			}	
		 });

		fr.add(lbl1);
		fr.add(lbl2);
		fr.add(lbl3);
		fr.add(lbl4);
		fr.add(tfQty);
		fr.add(tfRate);
		fr.add(tfAmt);
		fr.add(tfTotal);
		fr.add(rbCosm);
		fr.add(rbVeg);
		fr.add(btn);
		fr.setVisible(true);
	}
}
