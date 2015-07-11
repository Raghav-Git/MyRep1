package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class CheckDrivingEligibility {

	protected Shell shell;
	private Text txtName;
	private Text txtAge;
	private Label lblResult;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CheckDrivingEligibility window = new CheckDrivingEligibility();
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
		
		txtName = new Text(shell, SWT.BORDER);
		txtName.setBounds(170, 36, 152, 21);
		
		txtAge = new Text(shell, SWT.BORDER);
		txtAge.setBounds(170, 63, 76, 21);
		
		Label lblName = new Label(shell, SWT.NONE);
		lblName.setBounds(95, 36, 55, 15);
		lblName.setText("Name:");
		
		Label lblAge = new Label(shell, SWT.NONE);
		lblAge.setText("Age:");
		lblAge.setBounds(95, 69, 55, 15);
		
		Button btnCheckEligibility = new Button(shell, SWT.NONE);
		btnCheckEligibility.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String name = txtName.getText();
				int age = Integer.parseInt(txtAge.getText());
				if(age>17){
				lblResult.setText(name+" You are eligible for Driving");
				}
				else{
					lblResult.setText(name+" You are NOT eligible for Driving");
				}
				
			}
		});
		btnCheckEligibility.setBounds(170, 104, 96, 25);
		btnCheckEligibility.setText("Check Eligibility");
		
		lblResult = new Label(shell, SWT.NONE);
		lblResult.setBounds(95, 172, 265, 25);

	}
}
