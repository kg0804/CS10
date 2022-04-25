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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Credit3GUI {

	private JFrame frame;
	private JTextField FNT;
	private JTextField LMT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit3GUI window = new Credit3GUI();
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
	public Credit3GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 523, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 507, 382);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel FN = new JLabel("First Name");
		FN.setFont(new Font("SimSun", Font.PLAIN, 13));
		FN.setBounds(10, 41, 82, 31);
		panel.add(FN);
		
		FNT = new JTextField();
		FNT.setBounds(83, 46, 219, 20);
		panel.add(FNT);
		FNT.setColumns(10);
		
		JLabel LN = new JLabel("Last Name");
		LN.setFont(new Font("SimSun", Font.PLAIN, 13));
		LN.setBounds(10, 87, 82, 14);
		panel.add(LN);
		
		LMT = new JTextField();
		LMT.setBounds(83, 83, 219, 20);
		panel.add(LMT);
		LMT.setColumns(10);
		
		JLabel GD = new JLabel("Grade");
		GD.setFont(new Font("SimSun", Font.PLAIN, 13));
		GD.setBounds(10, 115, 45, 14);
		panel.add(GD);
		
		
		
		JButton SB = new JButton("Submit");
		SB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				String FN = FNT.getText();
				String LN = LMT.getText();

				
			}
		});
		SB.setFont(new Font("SimSun", Font.BOLD, 13));
		SB.setBounds(396, 187, 89, 23);
		panel.add(SB);
		
		JButton RS = new JButton("Reset");
		RS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			FNT.setText(" ");
			LMT.setText(" ");	
			
			}
			
		}
		);
		RS.setFont(new Font("SimSun", Font.BOLD, 13));
		RS.setBounds(10, 187, 89, 23);
		panel.add(RS);
		
		JPanel Dis = new JPanel();
		Dis.setBounds(10, 252, 475, 119);
		panel.add(Dis);
		
		JComboBox G2 = new JComboBox();
		G2.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		G2.setBounds(83, 112, 111, 22);
		panel.add(G2);
		
		
	
	}
}
