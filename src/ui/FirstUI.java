package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FirstUI {

	private JFrame frmAdditionApplication;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstUI window = new FirstUI();
					window.frmAdditionApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdditionApplication = new JFrame();
		frmAdditionApplication.getContentPane().setBackground(new Color(0, 204, 255));
		frmAdditionApplication.setTitle("Addition Application");
		frmAdditionApplication.setBounds(100, 100, 286, 300);
		frmAdditionApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdditionApplication.getContentPane().setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(146, 47, 86, 20);
		frmAdditionApplication.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(146, 75, 86, 20);
		frmAdditionApplication.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		JLabel lblFirstNumber = new JLabel("First Number:");
		lblFirstNumber.setBounds(43, 50, 75, 14);
		frmAdditionApplication.getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Second Number:");
		lblSecondNumber.setBounds(43, 78, 93, 14);
		frmAdditionApplication.getContentPane().add(lblSecondNumber);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String x = txt1.getText();
				String y = txt2.getText();
				
				int z = Integer.parseInt(x) + Integer.parseInt(y);
				//txt3.setText(String.valueOf(z));
				txt3.setText(""+z);
				
			}
		});
		btnAdd.setBounds(146, 106, 89, 23);
		frmAdditionApplication.getContentPane().add(btnAdd);
		
		txt3 = new JTextField();
		txt3.setBounds(146, 140, 86, 20);
		frmAdditionApplication.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		JLabel lblResult = new JLabel("Result :");
		lblResult.setBounds(90, 143, 46, 14);
		frmAdditionApplication.getContentPane().add(lblResult);
	}
}
