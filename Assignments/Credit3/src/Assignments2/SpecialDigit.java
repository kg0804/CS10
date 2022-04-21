package Assignments2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SpecialDigit {

	private JFrame frame;
	private JTextField TDT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpecialDigit window = new SpecialDigit();
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
	public SpecialDigit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 383, 245);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 367, 201);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel TD = new JLabel("Enter two digits");
		TD.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TD.setBounds(10, 31, 121, 19);
		panel.add(TD);
		
		TDT = new JTextField();
		TDT.setBounds(141, 30, 86, 20);
		panel.add(TDT);
		TDT.setColumns(10);
		
		JLabel Dis = new JLabel("");
		Dis.setBounds(10, 163, 349, 27);
		panel.add(Dis);
		
		JButton BT = new JButton("Submit");
		BT.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
		
				String twoDigit = TDT.getText(); // record digit 
				int TwoD = Integer.parseInt(twoDigit); // get the number
				int firstD = TwoD / 10; // isolate first digit
				int secondD = TwoD % 10; //isolate second number
				
				int sum = firstD + secondD; // sum
				
				int prdc = firstD * secondD; // product
				
				int finalnumber = sum + prdc; //add to get final number
				
				if (finalnumber == TwoD)		// if it equals first number it is special	
				{
					Dis.setText(TwoD + " is a special two digit number");
				}
				else 
				{
					Dis.setText(TwoD + " is not a special two digit number");
				}
				
				
						
			
			
			
				
			}
			
		});
		BT.setBounds(251, 73, 89, 35);
		panel.add(BT);
		
		JButton RS = new JButton("Reset");
		RS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			 TDT.setText("");
			}
			
			
		});
		RS.setBounds(251, 119, 89, 23);
		panel.add(RS);
	}
}
