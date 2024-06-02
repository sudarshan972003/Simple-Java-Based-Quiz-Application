import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Score extends JFrame implements ActionListener 
{

    	Score(String s, int score) 
	{
        	getContentPane().setBackground(Color.WHITE);
        	setLayout(null);
        
        JLabel heading = new JLabel("Thankyou " + s + " for playing Master Minds");
        heading.setBounds(110, 50, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(250, 150, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(280, 250, 120, 40);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
	setTitle("Quiz App by STM");
	setSize(700,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) 
  {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) 
    {
        new Score("User", 0);
    }
}