package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class CheckNumber {

	protected Shell shell;
	private Text textNumber;
	private Label labelResult;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CheckNumber window = new CheckNumber();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		textNumber = new Text(shell, SWT.BORDER);
		textNumber.setBounds(182, 53, 76, 21);
		
		Label lblEnterNumber = new Label(shell, SWT.NONE);
		lblEnterNumber.setBounds(86, 56, 90, 15);
		lblEnterNumber.setText("Enter Number :");
		
		Button btnCheckNumber = new Button(shell, SWT.NONE);
		btnCheckNumber.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				boolean evenFlag=false;
				boolean primeFlag=true;
				int number = Integer.parseInt(textNumber.getText());
				if(number%2==0){
					evenFlag=true;
				}
				
				for(int i=2;i<number;i++){
					if(number%i==0){
						System.out.println("This is not a Prime No");
						primeFlag=false;
						break;
					}
				}
				
				if(evenFlag==true & primeFlag==true){
					System.out.println("Even and Prime Number");
					labelResult.setText("Even and Prime Number");
					
				}
				if(evenFlag==true & primeFlag==false){
					System.out.println("Even and NOT Prime");
					labelResult.setText("Even and NOT Prime");
				}
				if(evenFlag==false & primeFlag==true){
					System.out.println("Odd and Prime");
					labelResult.setText("Odd and Prime");
				}
				if(evenFlag==false & primeFlag==false){
					System.out.println("Odd and NOT Prime");
					labelResult.setText("Odd and NOT Prime");
				}
			}
		});
		btnCheckNumber.setBounds(182, 99, 97, 25);
		btnCheckNumber.setText("Check Number");
		
		labelResult = new Label(shell, SWT.NONE);
		labelResult.setBounds(182, 151, 227, 21);

	}

}
