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

public class Calculator2 {

	private JFrame frmCalculator;
	private JFormattedTextField txtResult;

	static int i1;
	static int i2;
	static String operation = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 window = new Calculator2();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmCalculator.setBounds(100, 100, 336, 362);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		
		
		NumberFormat longFormat = NumberFormat.getIntegerInstance();

		NumberFormatter numberFormatter = new NumberFormatter(longFormat);
		numberFormatter.setValueClass(Long.class); //optional, ensures you will always get a long value
		numberFormatter.setAllowsInvalid(true); //this is the key!!
		numberFormatter.setMinimum(0l); //Optional

		txtResult = new JFormattedTextField(numberFormatter);
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBackground(new Color(255, 255, 255));
		txtResult.setText("0");
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		///JFormattedTextField txtDisplay = new JFormattedTextField(formatter);
		//JTextField txtDisplay = new JTextField();
		txtResult.setBounds(37, 42, 248, 28);
		frmCalculator.getContentPane().add(txtResult);
		txtResult.setColumns(10);

		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"1");
				txtResult.requestDefaultFocus();
			}
		});
		btnOne.setBounds(37, 105, 52, 36);
		frmCalculator.getContentPane().add(btnOne);

		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"4");
			}
		});
		btnFour.setBounds(37, 152, 52, 36);
		frmCalculator.getContentPane().add(btnFour);

		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"7");
			}
		});
		btnSeven.setBounds(37, 199, 52, 36);
		frmCalculator.getContentPane().add(btnSeven);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+".");
			}
		});
		btnDot.setBounds(37, 246, 52, 36);
		frmCalculator.getContentPane().add(btnDot);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				i1 = Integer.parseInt(txtResult.getText());
				txtResult.setText("0");
			//	i1 = Integer.parseInt(txtNum1.getText());
			//	i2 = Integer.parseInt(txtNum2.getText());
			//	int result = i1+i2;
				//txtResult.setText("");
				operation="add";
			//	txtResult.setText(String.valueOf(result));
				txtResult.requestFocus();
			}
		});
		btnAdd.setBounds(233, 105, 52, 36);
		frmCalculator.getContentPane().add(btnAdd);

		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i1 = Integer.parseInt(txtResult.getText());
				txtResult.setText("0");
				operation="sub";
				txtResult.requestFocus();
			}
		});
		btnSubtract.setBounds(233, 152, 52, 36);
		frmCalculator.getContentPane().add(btnSubtract);

		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i1 = Integer.parseInt(txtResult.getText());
				txtResult.setText("0");
				operation="multiply";
				txtResult.requestFocus();
			}
		});
		btnMultiply.setBounds(233, 199, 52, 36);
		frmCalculator.getContentPane().add(btnMultiply);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i1 = Integer.parseInt(txtResult.getText());
				txtResult.setText("0");
				operation="divide";
				txtResult.requestFocus();
			}
		});
		btnDivide.setBounds(233, 246, 52, 36);
		frmCalculator.getContentPane().add(btnDivide);

		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"2");
			}
		});
		btnTwo.setBounds(99, 105, 52, 36);
		frmCalculator.getContentPane().add(btnTwo);

		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"5");
			}
		});
		btnFive.setBounds(99, 152, 52, 36);
		frmCalculator.getContentPane().add(btnFive);

		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"8");
			}
		});
		btnEight.setBounds(99, 199, 52, 36);
		frmCalculator.getContentPane().add(btnEight);

		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"0");
			}
		});
		btnZero.setBounds(99, 246, 52, 36);
		frmCalculator.getContentPane().add(btnZero);

		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"3");
			}
		});
		btnThree.setBounds(161, 105, 52, 36);
		frmCalculator.getContentPane().add(btnThree);

		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"6");
			}
		});
		btnSix.setBounds(161, 152, 52, 36);
		frmCalculator.getContentPane().add(btnSix);

		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(txtResult.getText()+"9");
			}
		});
		btnNine.setBounds(161, 199, 52, 36);
		frmCalculator.getContentPane().add(btnNine);

		JButton btnEqualTo = new JButton("=");
		btnEqualTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i2 = Integer.parseInt(txtResult.getText());
				if(operation.equalsIgnoreCase("add")){
					int result = i1+i2;
					txtResult.setText(String.valueOf(result));
					txtResult.requestFocus();
				}
				if(operation.equalsIgnoreCase("sub")){
					int result = i1-i2;
					txtResult.setText(String.valueOf(result));
				}
				if(operation.equalsIgnoreCase("multiply")){
					int result = i1*i2;
					txtResult.setText(String.valueOf(result));
				}
				if(operation.equalsIgnoreCase("divide")){
					int result = i1/i2;
					txtResult.setText(String.valueOf(result));
				}
			}
		});
		btnEqualTo.setBounds(161, 246, 52, 36);
		frmCalculator.getContentPane().add(btnEqualTo);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("0");
			}
		});
		btnC.setBounds(233, 77, 52, 23);
		frmCalculator.getContentPane().add(btnC);
	}

}
