import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame
{
Container c;
JLabel labHeading, labName;
JTextField txtName;
JButton btnRules;

Login()
{
c = getContentPane();
c.setLayout(null);

labHeading = new JLabel("Master Mind");
labHeading.setBounds(250, 30, 300, 45);
labHeading.setFont(new Font("Algerian", Font.BOLD, 40));
labHeading.setForeground(new Color(30, 144, 254));

labName = new JLabel("Enter Your Name");
labName.setBounds(310, 130, 300, 30);
labName.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
labName.setForeground(new Color(30, 144, 254));

txtName = new JTextField(25);
txtName.setBounds(230, 170, 325, 35);
txtName.setFont(new Font("Times New Roman", Font.BOLD, 20));

btnRules = new JButton("Rules");
btnRules.setBounds(330, 240, 120, 35);
btnRules.setBackground(new Color(30, 144, 254));
btnRules.setForeground(Color.WHITE);

c.add(labHeading);
c.add(labName);
c.add(txtName);
c.add(btnRules);

ActionListener a = (ae) -> {
	String s = txtName.getText();
	setVisible(false);
	new Rules(s);
};
btnRules.addActionListener(a);

setTitle("Quiz App by STM");
setSize(800,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class LoginTest
{
public static void main(String args[])
{
Login a = new Login();
}
}