package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class FindStudentWithHighestMarks {

	protected Shell shell;
	private Text textStudentName1;
	private Text textMarks1;
	private Label label;
	private Text textStudentName2;
	private Label label_1;
	private Text textMarks2;
	private Label label_2;
	private Text textStudentName3;
	private Label label_3;
	private Text textMarks3;
	private Label label_4;
	private Text textStudentName4;
	private Label label_5;
	private Text textMarks4;
	private Label label_6;
	private Text textStudentName5;
	private Label label_7;
	private Text textMarks5;
	private Button btnCheckHighestMarks;
	private Label label_8;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FindStudentWithHighestMarks window = new FindStudentWithHighestMarks();
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
		
		Label lblStudentName = new Label(shell, SWT.NONE);
		lblStudentName.setBounds(10, 29, 84, 15);
		lblStudentName.setText("Student Name");
		
		textStudentName1 = new Text(shell, SWT.BORDER);
		textStudentName1.setBounds(97, 26, 151, 21);
		
		Label lblMarks = new Label(shell, SWT.NONE);
		lblMarks.setBounds(257, 29, 38, 15);
		lblMarks.setText("Marks");
		
		textMarks1 = new Text(shell, SWT.BORDER);
		textMarks1.setBounds(302, 26, 76, 21);
		
		label = new Label(shell, SWT.NONE);
		label.setText("Student Name");
		label.setBounds(10, 53, 84, 15);
		
		textStudentName2 = new Text(shell, SWT.BORDER);
		textStudentName2.setBounds(97, 50, 151, 21);
		
		label_1 = new Label(shell, SWT.NONE);
		label_1.setText("Marks");
		label_1.setBounds(257, 53, 38, 15);
		
		textMarks2 = new Text(shell, SWT.BORDER);
		textMarks2.setBounds(302, 50, 76, 21);
		
		label_2 = new Label(shell, SWT.NONE);
		label_2.setText("Student Name");
		label_2.setBounds(10, 77, 84, 15);
		
		textStudentName3 = new Text(shell, SWT.BORDER);
		textStudentName3.setBounds(97, 74, 151, 21);
		
		label_3 = new Label(shell, SWT.NONE);
		label_3.setText("Marks");
		label_3.setBounds(257, 77, 38, 15);
		
		textMarks3 = new Text(shell, SWT.BORDER);
		textMarks3.setBounds(302, 74, 76, 21);
		
		label_4 = new Label(shell, SWT.NONE);
		label_4.setText("Student Name");
		label_4.setBounds(10, 101, 84, 15);
		
		textStudentName4 = new Text(shell, SWT.BORDER);
		textStudentName4.setBounds(97, 98, 151, 21);
		
		label_5 = new Label(shell, SWT.NONE);
		label_5.setText("Marks");
		label_5.setBounds(257, 101, 38, 15);
		
		textMarks4 = new Text(shell, SWT.BORDER);
		textMarks4.setBounds(302, 98, 76, 21);
		
		label_6 = new Label(shell, SWT.NONE);
		label_6.setText("Student Name");
		label_6.setBounds(10, 125, 84, 15);
		
		textStudentName5 = new Text(shell, SWT.BORDER);
		textStudentName5.setBounds(97, 122, 151, 21);
		
		label_7 = new Label(shell, SWT.NONE);
		label_7.setText("Marks");
		label_7.setBounds(257, 125, 38, 15);
		
		textMarks5 = new Text(shell, SWT.BORDER);
		textMarks5.setBounds(302, 122, 76, 21);
		
		btnCheckHighestMarks = new Button(shell, SWT.NONE);
		btnCheckHighestMarks.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				int Student1Marks = Integer.parseInt(textMarks1.getText());
				int Student2Marks = Integer.parseInt(textMarks2.getText());
				int Student3Marks = Integer.parseInt(textMarks3.getText());
				int Student4Marks = Integer.parseInt(textMarks4.getText());
				int Student5Marks = Integer.parseInt(textMarks5.getText());
				
				
				
			}
		});
		btnCheckHighestMarks.setBounds(97, 158, 134, 25);
		btnCheckHighestMarks.setText("Check Highest Marks");
		
		label_8 = new Label(shell, SWT.NONE);
		label_8.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		label_8.setBounds(97, 205, 281, 25);

	}

}
