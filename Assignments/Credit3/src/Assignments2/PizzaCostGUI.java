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

public class PizzaCostGUI {

	private JFrame frame;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaCostGUI window = new PizzaCostGUI();
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
	public PizzaCostGUI() {
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
		panel.setForeground(Color.CYAN);
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Title = new JLabel("How Much Does Your Pizza Cost");
		Title.setForeground(Color.BLUE);
		Title.setFont(new Font("Sitka Small", Font.BOLD, 15));
		Title.setBounds(86, 11, 259, 20);
		panel.add(Title);
		
		JLabel Label = new JLabel("Enter Size of Pizza");
		Label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label.setForeground(Color.BLUE);
		Label.setBounds(10, 75, 115, 14);
		panel.add(Label);
		
		text = new JTextField();
		text.setBounds(135, 73, 86, 20);
		panel.add(text);
		text.setColumns(10);
		
		JLabel Dis = new JLabel("");
		Dis.setForeground(Color.BLUE);
		Dis.setBounds(10, 196, 403, 54);
		panel.add(Dis);
		
		JButton Submit = new JButton("Submit");
		Submit.setForeground(Color.BLUE);
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String size = text.getText(); // record digit
				int size1 = Integer.parseInt(size); // get the number
				
				double labor= 0.75; //price of labor
	    		int rent= 1; //price of rent
	    		double materials= 0.05 * size1 * size1; // price of materials used depending on size of pizza
	    		double totalcost= rent + materials + labor; // add up total cost
	    		
	    		
	    		Dis.setText("The price of your pizza is $" + totalcost); //print cost amount
	    		
				
				
			}
			
		
		});
		Submit.setBounds(324, 133, 89, 23);
		panel.add(Submit);
		
		JButton Reset = new JButton("Reset");
		Reset.setForeground(Color.BLUE);
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				 text.setText("");
			}
		});
		Reset.setBounds(10, 133, 89, 23);
		panel.add(Reset);
		
		
	}
}
