package Assignments2;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignment7GUI {

	private JFrame frame;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment7GUI window = new Assignment7GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assignment7GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel title1 = new JLabel("Change Calculator");
		title1.setForeground(Color.YELLOW);
		title1.setFont(new Font("Tahoma", Font.BOLD, 15));
		title1.setBounds(142, 11, 167, 19);
		panel.add(title1);
		
		JLabel title = new JLabel("Enter the amount of change in cents");
		title.setForeground(Color.YELLOW);
		title.setFont(new Font("Tahoma", Font.PLAIN, 13));
		title.setBounds(10, 73, 219, 18);
		panel.add(title);
		
		text = new JTextField();
		text.setBounds(239, 71, 86, 20);
		panel.add(text);
		text.setColumns(10);
		
		JLabel Dis = new JLabel("");
		Dis.setForeground(Color.YELLOW);
		Dis.setBounds(10, 162, 414, 14);
		panel.add(Dis);
		
		JLabel Dis1 = new JLabel("");
		Dis1.setForeground(Color.YELLOW);
		Dis1.setBounds(10, 187, 414, 14);
		panel.add(Dis1);
		
		JLabel Dis2 = new JLabel("");
		Dis2.setForeground(Color.YELLOW);
		Dis2.setBounds(10, 214, 414, 14);
		panel.add(Dis2);
		
		JButton Submit = new JButton("Submit");
		Submit.setBackground(Color.YELLOW);
		Submit.setForeground(Color.BLACK);
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String change = text.getText(); // record digit
				int change1 = Integer.parseInt(change); // get the number
				
				int quarters= change1 / 25; // amount of quarters
				int dimes= (change1 % 25) / 10; //amount of dimes
				int nickels= ((change1 % 25) % 10) / 5; //amount of nickels
				
				Dis.setText("The amount of quarters are " + quarters); //print amount
				Dis1.setText("The amount of dimes are " + dimes); //print amount
				Dis2.setText("The amount of nickels are " + nickels); //print amount
			}
		});
		Submit.setBounds(335, 124, 89, 23);
		panel.add(Submit);
		
		JButton Reset = new JButton("Reset");
		Reset.setBackground(Color.YELLOW);
		Reset.setForeground(Color.BLACK);
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 text.setText("");
			}
			
		});
		Reset.setBounds(10, 124, 89, 23);
		panel.add(Reset);
		
	
		
	}

}
