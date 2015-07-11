package ui_CarBuySellSystem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.CTabFolder;

public class CarBuySell {

	protected Shell shell;
	private Combo comboCarBrandBuy ;
	private Combo comboCarModelBuy;
	private Combo comboCarBrandSell;
	
	private Text textCarNameBuy;
	private Label label_1;
	private Label label_5;
	private Combo comboCarNameSell;
	private static ArrayList<String> carNames = new ArrayList<>();
	HashMap<String, String> marutiMap = new HashMap<>();
	HashMap<String, String> tataMap = new HashMap<>();


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//carNames.add("Car1");

			CarBuySell window = new CarBuySell();
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
		shell.setModified(true);
		shell.setSize(512, 300);
		shell.setText("SWT Application");
		shell.setLayout(null);

		Label label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label.setBounds(253, 26, 2, 225);

		comboCarBrandBuy = new Combo(shell, SWT.READ_ONLY);
		comboCarBrandBuy.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				label_1.setText("Selected");
			}
		});
		comboCarBrandBuy.setItems(new String[] {"Maruti", "Fiat", "Tata", "Ford", "Honda", "Hyundai"});
		comboCarBrandBuy.setBounds(87, 33, 123, 23);
		comboCarBrandBuy.setText("--select--");

		Label lblCarBrand = new Label(shell, SWT.NONE);
		lblCarBrand.setAlignment(SWT.RIGHT);
		lblCarBrand.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblCarBrand.setBounds(12, 38, 71, 15);
		lblCarBrand.setText("Car Brand :");

		textCarNameBuy = new Text(shell, SWT.BORDER);
		textCarNameBuy.setBounds(87, 67, 123, 21);

		Label lblCarName = new Label(shell, SWT.NONE);
		lblCarName.setAlignment(SWT.RIGHT);
		lblCarName.setText("Car Name :");
		lblCarName.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblCarName.setBounds(12, 70, 71, 15);

		comboCarModelBuy = new Combo(shell, SWT.READ_ONLY);
		comboCarModelBuy.setItems(new String[] {"2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"});
		comboCarModelBuy.setBounds(87, 99, 91, 23);
		comboCarModelBuy.setText("--select--");

		Label lblModelYear = new Label(shell, SWT.NONE);
		lblModelYear.setAlignment(SWT.RIGHT);
		lblModelYear.setText("Model :");
		lblModelYear.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		lblModelYear.setBounds(12, 105, 71, 15);

		Button buttonBuy = new Button(shell, SWT.NONE);
		buttonBuy.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				String carName = textCarNameBuy.getText();
				String carModel = comboCarModelBuy.getText();

				if(comboCarBrandBuy.getText().equalsIgnoreCase("maruti")){
					marutiMap.put(carName, carModel);
				}

				label_1.setText("Added to Inventory");
				System.out.println(marutiMap);
			}
		});
		buttonBuy.setBounds(87, 138, 63, 25);
		buttonBuy.setText("BUY");

		label_1 = new Label(shell, SWT.BORDER | SWT.HORIZONTAL | SWT.CENTER);
		label_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		label_1.setBounds(73, 198, 137, 19);

		Label lblStatus = new Label(shell, SWT.NONE);
		lblStatus.setBounds(22, 198, 45, 15);
		lblStatus.setText("Status :");

		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setText("Car Brand :");
		label_2.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		label_2.setAlignment(SWT.RIGHT);
		label_2.setBounds(280, 38, 71, 15);

		comboCarBrandSell = new Combo(shell, SWT.READ_ONLY);
		comboCarBrandSell.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				String carBrand = comboCarBrandSell.getText();
				comboCarNameSell.clearSelection();
				
				if(carBrand.equalsIgnoreCase("maruti")){
					Set<String> keyList = marutiMap.keySet();
					int i=0;
					for(String key : keyList){
						carNames.add(key);
						//comboCarNameSell.setItem(i, key);
						//i++;
					}
				}
				String[] strArray = (String[]) carNames.toArray(new String[0]);
				System.out.println();
				comboCarNameSell.setItems(strArray);

			}
		});
		comboCarBrandSell.setItems(new String[] {"Maruti", "Fiat", "Tata", "Ford", "Honda", "Hyundai"});
		comboCarBrandSell.setBounds(355, 33, 123, 23);
		comboCarBrandSell.setText("--select--");

		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setText("Car Name :");
		label_3.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		label_3.setAlignment(SWT.RIGHT);
		label_3.setBounds(280, 70, 71, 15);

		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setText("Model :");
		label_4.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		label_4.setAlignment(SWT.RIGHT);
		label_4.setBounds(280, 105, 71, 15);

		Combo comboCarModelSell = new Combo(shell, SWT.READ_ONLY);
		comboCarModelSell.setItems(new String[] {"2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"});
		comboCarModelSell.setBounds(355, 99, 91, 23);
		comboCarModelSell.setText("--select--");

		Button buttonSell = new Button(shell, SWT.NONE);
		buttonSell.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				label_5.setText("Sold Successfully");
			}
		});
		buttonSell.setText("SELL");
		buttonSell.setBounds(355, 138, 63, 25);

		label_5 = new Label(shell, SWT.BORDER | SWT.HORIZONTAL | SWT.CENTER);
		label_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		label_5.setBounds(341, 198, 137, 19);

		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setText("Status :");
		label_6.setBounds(290, 198, 45, 15);

		comboCarNameSell = new Combo(shell, SWT.READ_ONLY);
		comboCarNameSell.setItems(new String[] {});
		comboCarNameSell.setBounds(355, 65, 123, 23);
		comboCarNameSell.setText("--select--");

	}
}
