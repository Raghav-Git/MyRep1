package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SumOfNNumbers {

	protected Shell shell;
	private Text textNumber;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SumOfNNumbers window = new SumOfNNumbers();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 206);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		textNumber = new Text(shell, SWT.BORDER);
		textNumber.setBounds(156, 50, 76, 21);
		
		Label lblEnterNumber = new Label(shell, SWT.NONE);
		lblEnterNumber.setBounds(60, 56, 90, 15);
		lblEnterNumber.setText("Enter Number :");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(131, 96, 63, 21);
		
		Label lblSumOfFirst = new Label(shell, SWT.NONE);
		lblSumOfFirst.setBounds(60, 100, 69, 15);
		lblSumOfFirst.setText("Sum of First ");
		
		Label lblNumbersIs = new Label(shell, SWT.NONE);
		lblNumbersIs.setBounds(200, 100, 69, 15);
		lblNumbersIs.setText("Numbers is ");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(275, 96, 96, 21);
		
		Button btnSum = new Button(shell, SWT.NONE);
		btnSum.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int number = Integer.parseInt(textNumber.getText());
				
				int Sum=0;
				for(int a=0; a<=number; a++){
					Sum = Sum+a;
				}
				
				System.out.println("Sum of First "+number+" Natural numbers is "+Sum);
				text_1.setText(textNumber.getText());
				text_2.setText(String.valueOf(Sum));
			}
		});
		btnSum.setBounds(264, 50, 58, 25);
		btnSum.setText("Sum");

	}

}
