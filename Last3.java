import javax.swing.*;
import java.awt.event.*;

class Last3 {
    public static void main(String[] args) {

        JFrame fr = new JFrame("Addition & clear");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(null);
        fr.setSize(400, 250);

        JTextField tf1 = new JTextField();
        tf1.setBounds(50, 20, 120, 30);

        JTextField tf2 = new JTextField();
        tf2.setBounds(200, 20, 120, 30);

        JTextField tf3 = new JTextField();
        tf3.setBounds(120, 70, 150, 30);

        JButton btn = new JButton("Add");
        btn.setBounds(140, 110, 100, 30);
        

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String t1 = tf1.getText();
                String t2 = tf2.getText();
                tf3.setText(t1 +" "+ t2);
            }
        });
        

        fr.add(tf1);
        fr.add(tf2);
        fr.add(tf3);
        fr.add(btn);

        fr.setVisible(true);
    }
}