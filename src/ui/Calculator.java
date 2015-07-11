package ui;

import java.awt.EventQueue;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.text.NumberFormatter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JFormattedTextField txtResult;

	static int i1;
	static int i2;
	static String operation = "";
	private JFormattedTextField txtNum1;
	private JFormattedTextField txtNum2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 336, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		
		NumberFormat longFormat = NumberFormat.getIntegerInstance();

		NumberFormatter numberFormatter = new NumberFormatter(longFormat);
		numberFormatter.setValueClass(Long.class); //optional, ensures you will always get a long value
		numberFormatter.setAllowsInvalid(false); //this is the key!!
		numberFormatter.setMinimum(0l); //Optional

		txtResult = new JFormattedTextField(numberFormatter);
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBackground(new Color(255, 255, 255));
		txtResult.setText("0");
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		///JFormattedTextField txtDisplay = new JFormattedTextField(formatter);
		//JTextField txtDisplay = new JTextField();
		txtResult.setBounds(37, 57, 248, 28);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);

		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnOne.setBounds(37, 105, 52, 36);
		frame.getContentPane().add(btnOne);

		JButton btnFour = new JButton("4");
		btnFour.setBounds(37, 152, 52, 36);
		frame.getContentPane().add(btnFour);

		JButton btnSeven = new JButton("7");
		btnSeven.setBounds(37, 199, 52, 36);
		frame.getContentPane().add(btnSeven);

		JButton btnDot = new JButton(".");
		btnDot.setBounds(37, 246, 52, 36);
		frame.getContentPane().add(btnDot);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				i1 = Integer.parseInt(txtNum1.getText());
				i2 = Integer.parseInt(txtNum2.getText());
				int result = i1+i2;
				//txtResult.setText("");
				//operation="add";
				txtResult.setText(String.valueOf(result));
			}
		});
		btnAdd.setBounds(233, 105, 52, 36);
		frame.getContentPane().add(btnAdd);

		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i1 = Integer.parseInt(txtNum1.getText());
				i2 = Integer.parseInt(txtNum2.getText());
				int result = i1-i2;
				//txtResult.setText("");
				//operation="add";
				txtResult.setText(String.valueOf(result));
			}
		});
		btnSubtract.setBounds(233, 152, 52, 36);
		frame.getContentPane().add(btnSubtract);

		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i1 = Integer.parseInt(txtNum1.getText());
				i2 = Integer.parseInt(txtNum2.getText());
				int result = i1*i2;
				//txtResult.setText("");
				//operation="add";
				txtResult.setText(String.valueOf(result));
			}
		});
		btnMultiply.setBounds(233, 199, 52, 36);
		frame.getContentPane().add(btnMultiply);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i1 = Integer.parseInt(txtNum1.getText());
				i2 = Integer.parseInt(txtNum2.getText());
				int result = i1/i2;
				//txtResult.setText("");
				//operation="add";
				txtResult.setText(String.valueOf(result));
			}
		});
		btnDivide.setBounds(233, 246, 52, 36);
		frame.getContentPane().add(btnDivide);

		JButton btnTwo = new JButton("2");
		btnTwo.setBounds(99, 105, 52, 36);
		frame.getContentPane().add(btnTwo);

		JButton btnFive = new JButton("5");
		btnFive.setBounds(99, 152, 52, 36);
		frame.getContentPane().add(btnFive);

		JButton btnEight = new JButton("8");
		btnEight.setBounds(99, 199, 52, 36);
		frame.getContentPane().add(btnEight);

		JButton btnZero = new JButton("0");
		btnZero.setBounds(99, 246, 52, 36);
		frame.getContentPane().add(btnZero);

		JButton btnThree = new JButton("3");
		btnThree.setBounds(161, 105, 52, 36);
		frame.getContentPane().add(btnThree);

		JButton btnSix = new JButton("6");
		btnSix.setBounds(161, 152, 52, 36);
		frame.getContentPane().add(btnSix);

		JButton btnNine = new JButton("9");
		btnNine.setBounds(161, 199, 52, 36);
		frame.getContentPane().add(btnNine);

		JButton btnEqualTo = new JButton("=");
		btnEqualTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i2 = Integer.parseInt(txtResult.getText());
				if(operation.equalsIgnoreCase("add")){
					int result = i1+i2;
					txtResult.setText(String.valueOf(result));
				}
			}
		});
		btnEqualTo.setBounds(161, 246, 52, 36);
		frame.getContentPane().add(btnEqualTo);
		
		txtNum1 = new JFormattedTextField(numberFormatter);
		txtNum1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum1.setBounds(37, 32, 126, 24);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JFormattedTextField(numberFormatter);
		txtNum2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum2.setColumns(10);
		txtNum2.setBounds(159, 32, 126, 24);
		frame.getContentPane().add(txtNum2);
	}

}
