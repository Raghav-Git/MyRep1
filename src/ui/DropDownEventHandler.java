package ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class DropDownEventHandler {

	protected Shell shell;
private Combo combo_2;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DropDownEventHandler window = new DropDownEventHandler();
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
		
		Combo combo_1 = new Combo(shell, SWT.NONE);
		combo_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		combo_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				String[] ar = new String[2];
				ar[0]="Car1";
				ar[1]="Car2";
				
				combo_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
				combo_2.setItems(ar);
			}
		});
		combo_1.setItems(new String[] {"1", "2", "3", "4"});
		combo_1.setBounds(124, 46, 91, 23);
		
		combo_2 = new Combo(shell, SWT.NONE);
		combo_2.setBounds(124, 77, 91, 23);
		combo_2.select(0);

	}

}
