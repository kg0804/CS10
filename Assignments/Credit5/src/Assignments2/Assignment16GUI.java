package Assignments2;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Assignment16GUI {

	private JFrame frame;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment16GUI window = new Assignment16GUI();
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
	public Assignment16GUI() {
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
		panel.setForeground(Color.RED);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number Guessing Game");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lblNewLabel.setBounds(100, 11, 240, 19);
		panel.add(lblNewLabel);
		
		JLabel lblGuessANumber = new JLabel("Guess a Number between 1 and 20");
		lblGuessANumber.setForeground(Color.MAGENTA);
		lblGuessANumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGuessANumber.setBounds(10, 74, 208, 14);
		panel.add(lblGuessANumber);
		
		text = new JTextField();
		text.setForeground(Color.RED);
		text.setBounds(228, 72, 86, 20);
		panel.add(text);
		text.setColumns(10);
		
		JLabel Dis = new JLabel("");
		Dis.setForeground(Color.PINK);
		Dis.setBounds(-1, 166, 397, 60);
		panel.add(Dis);
		
		JButton Submit = new JButton("Submit");
		Submit.setForeground(Color.CYAN);
		Submit.setBackground(Color.RED);
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

				String usernumber = text.getText(); // record digit
				int usernumber1 = Integer.parseInt(usernumber); // get the number
				
				
				int computernumber = (int) (1 +  (Math.random() * 20)); // find first random number
				
				
				if (usernumber1 == computernumber) //check if the answer is correct
				{
					Dis.setText("You Win! You guessed the correct number!"); // if correct print this
				}
				else Dis.setText("You lose, your number was " + usernumber1 + " and the computers number was " + computernumber); // if wrong print this  
				
			}
		});
		Submit.setBounds(307, 132, 89, 23);
		panel.add(Submit);
		
		JButton Reset = new JButton("Reset");
		Reset.setForeground(Color.CYAN);
		Reset.setBackground(Color.RED);
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				 text.setText("");
			}
		});
		Reset.setBounds(10, 132, 89, 23);
		panel.add(Reset);
		
	
	}

}
