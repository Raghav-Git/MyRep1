package ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.widgets.Control;

public class DogKennelManagementSystem {

	protected Shell shlDogKennelManagement;
	private Text textBoxDogBreed;
	private Text textBoxNoOfDogs;
	private Text textBoxNameOfDog;
	private Text textBoxBreedOfDog;
	private Text textCountOfAvailableDogs;
	private Button buttonCheck;
	private Button buttonAdd1;
	private Button buttonAdd2;
	private Combo comboAvailableBreeds;
	private Combo comboDogNames;

	static HashMap<String, Integer> dogBreedMap = new HashMap<>();
	static HashMap<String, String> dogNameMap = new HashMap<>();
	static ArrayList<String> dogBreedList = new ArrayList<>();
	private Label label_1;
	private Label label_2;
	private Button btnBuy;
	private Button btnSell;
	private Button buttonSell;
	private Label label_Sold;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DogKennelManagementSystem window = new DogKennelManagementSystem();
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
		shlDogKennelManagement.open();
		shlDogKennelManagement.layout();
		while (!shlDogKennelManagement.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlDogKennelManagement = new Shell();
		shlDogKennelManagement.setSize(544, 327);
		shlDogKennelManagement.setText("Dog Kennel Management System");
		shlDogKennelManagement.setLayout(null);

		Label lblDogBreed = new Label(shlDogKennelManagement, SWT.RIGHT);
		lblDogBreed.setBounds(10, 57, 89, 15);
		lblDogBreed.setText("Dog Breed :");

		Label lblNoOfDogs = new Label(shlDogKennelManagement, SWT.RIGHT);
		lblNoOfDogs.setText("No Of Dogs :");
		lblNoOfDogs.setBounds(10, 80, 89, 15);

		textBoxDogBreed = new Text(shlDogKennelManagement, SWT.BORDER);
		textBoxDogBreed.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				label_1.setText("");
			}
		});

		textBoxDogBreed.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		textBoxDogBreed.setBounds(101, 51, 100, 21);

		textBoxNoOfDogs = new Text(shlDogKennelManagement, SWT.BORDER);
		textBoxNoOfDogs.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		textBoxNoOfDogs.setBounds(101, 78, 100, 21);

		buttonAdd1 = new Button(shlDogKennelManagement, SWT.NONE);
		buttonAdd1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if(!(textBoxDogBreed.getText().isEmpty())){

					String dogBreed=textBoxDogBreed.getText();
					int noOfDogs = Integer.parseInt(textBoxNoOfDogs.getText());



					if(dogBreedMap.containsKey(dogBreed)){
						int countOfExistingDogs=dogBreedMap.get(dogBreed);
						noOfDogs = noOfDogs+countOfExistingDogs;
						dogBreedMap.put(dogBreed, noOfDogs);
					}
					else{
						dogBreedMap.put(dogBreed, noOfDogs);
					}

					if(!dogBreedList.contains(dogBreed)){
						dogBreedList.add(dogBreed);
					}


					String[] dogBreedArray = new String[dogBreedList.size()];
					dogBreedArray = dogBreedList.toArray(dogBreedArray);
					comboAvailableBreeds.setItems(dogBreedArray);

					label_1.setText("Added");
					textBoxBreedOfDog.setText(dogBreed);
					System.out.println(dogBreedMap);
				}
			}
		});
		buttonAdd1.setBounds(126, 105, 75, 25);
		buttonAdd1.setText("Add");

		Label label = new Label(shlDogKennelManagement, SWT.SEPARATOR | SWT.VERTICAL);
		label.setBounds(243, 15, 2, 195);

		Label lblNameOfDog = new Label(shlDogKennelManagement, SWT.RIGHT);
		lblNameOfDog.setText("Name of Dog :");
		lblNameOfDog.setBounds(10, 196, 89, 15);

		textBoxNameOfDog = new Text(shlDogKennelManagement, SWT.BORDER);
		textBoxNameOfDog.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				label_2.setText("");
			}
		});

		textBoxNameOfDog.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		textBoxNameOfDog.setBounds(101, 190, 100, 21);

		textBoxBreedOfDog = new Text(shlDogKennelManagement, SWT.BORDER);
		textBoxBreedOfDog.setEditable(false);
		textBoxBreedOfDog.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		textBoxBreedOfDog.setBounds(101, 163, 100, 21);

		Label lblBreedOfDog = new Label(shlDogKennelManagement, SWT.RIGHT);
		lblBreedOfDog.setText("Breed of Dog :");
		lblBreedOfDog.setBounds(10, 165, 89, 15);

		buttonAdd2 = new Button(shlDogKennelManagement, SWT.NONE);
		buttonAdd2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!(textBoxNameOfDog.getText().isEmpty())){
					String nameOfDog = textBoxNameOfDog.getText();
					String breedOfDog = textBoxBreedOfDog.getText();

					dogNameMap.put(nameOfDog, breedOfDog);
					label_2.setText("Added");
					textBoxNameOfDog.setText("");
				}
			}
		});
		buttonAdd2.setText("Add");
		buttonAdd2.setBounds(126, 221, 75, 25);

		comboAvailableBreeds = new Combo(shlDogKennelManagement, SWT.READ_ONLY);
		comboAvailableBreeds.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				label_Sold.setText("");
			}
		});
		comboAvailableBreeds.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		comboAvailableBreeds.setBounds(368, 51, 130, 23);
		comboAvailableBreeds.select(0);
		comboAvailableBreeds.setText("--Available Breeds--");

		Label lblAvailableBreeds = new Label(shlDogKennelManagement, SWT.NONE);
		lblAvailableBreeds.setAlignment(SWT.RIGHT);
		lblAvailableBreeds.setBounds(262, 57, 100, 15);
		lblAvailableBreeds.setText("Available Breeds:");

		buttonCheck = new Button(shlDogKennelManagement, SWT.NONE);
		buttonCheck.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		buttonCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				comboDogNames.clearSelection();
				comboDogNames.setText("");


				if(!(comboAvailableBreeds.getText().isEmpty())){
					String dogBreed = comboAvailableBreeds.getText();
					int countOfDogs = dogBreedMap.get(dogBreed);
					textCountOfAvailableDogs.setText(Integer.toString(countOfDogs));

					ArrayList<String> dogNameList = new ArrayList<>();
					////to set Dog names of that breed inside dropdown
					if(dogNameMap.containsValue(dogBreed)){
						Set<String> keySet = dogNameMap.keySet();
						for(String key : keySet){
							if(dogNameMap.get(key).equalsIgnoreCase(dogBreed)){
								dogNameList.add(key);
							}
						}

						String[] dogNameArray = new String[dogNameList.size()];
						dogNameArray = dogNameList.toArray(dogNameArray);
						comboDogNames.setItems(dogNameArray);
					}
					else{
						//comboDogNames.setData("No Dog Names Found");
						comboDogNames.setText("No Dog Names Found");
					}
				}
			}
		});
		buttonCheck.setText("Check");
		buttonCheck.setBounds(398, 90, 100, 25);

		Label lblNoOfDogs_1 = new Label(shlDogKennelManagement, SWT.RIGHT);
		lblNoOfDogs_1.setText("No Of Dogs Available :");
		lblNoOfDogs_1.setBounds(303, 145, 138, 15);

		textCountOfAvailableDogs = new Text(shlDogKennelManagement, SWT.BORDER | SWT.CENTER);
		textCountOfAvailableDogs.setEditable(false);
		textCountOfAvailableDogs.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
		textCountOfAvailableDogs.setBounds(457, 133, 41, 30);

		comboDogNames = new Combo(shlDogKennelManagement, SWT.NONE);
		comboDogNames.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				label_Sold.setText("");
			}
		});
		comboDogNames.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		comboDogNames.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		comboDogNames.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		comboDogNames.setBounds(368, 173, 130, 23);
		comboDogNames.setText("--Dog Names--");

		label_1 = new Label(shlDogKennelManagement, SWT.RIGHT);
		label_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		label_1.setBounds(126, 134, 75, 15);

		label_2 = new Label(shlDogKennelManagement, SWT.RIGHT);
		label_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		label_2.setBounds(126, 250, 75, 15);

		btnBuy = new Button(shlDogKennelManagement, SWT.NONE);
		btnBuy.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnBuy.setGrayed(true);
		btnBuy.setSelection(true);
		btnBuy.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		btnBuy.setBounds(17, 8, 202, 15);
		btnBuy.setText("BUY");

		btnSell = new Button(shlDogKennelManagement, SWT.NONE);
		btnSell.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnSell.setText("SELL");
		btnSell.setSelection(true);
		btnSell.setGrayed(true);
		btnSell.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		btnSell.setBounds(283, 8, 202, 15);

		buttonSell = new Button(shlDogKennelManagement, SWT.NONE);
		buttonSell.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		buttonSell.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		buttonSell.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(comboAvailableBreeds.getText().isEmpty()){
					MessageBox messageBox = new MessageBox(shlDogKennelManagement);
					messageBox.setText("Warning");
					messageBox.setMessage("Please select Dog Breed");
					//int buttonID = messageBox.open();
					messageBox.open();
				}
				else if(comboDogNames.getText().equalsIgnoreCase("--Dog Names--")){
					MessageBox messageBox = new MessageBox(shlDogKennelManagement);
					messageBox.setText("Warning");
					messageBox.setMessage("Please select Dog Name");
					messageBox.open();
				}
				else if(comboDogNames.getText().isEmpty()){
					MessageBox messageBox = new MessageBox(shlDogKennelManagement);
					messageBox.setText("Warning");
					messageBox.setMessage("Please select Dog Name");
					messageBox.open();
				}
				else if(comboDogNames.getText().equalsIgnoreCase("No Dog Names Found")){
					MessageBox messageBox = new MessageBox(shlDogKennelManagement);
					messageBox.setText("Warning");
					messageBox.setMessage("No Dogs To Sell");
					messageBox.open();
				}
				else if(!(label_Sold.getText().equals(""))){
					MessageBox messageBox = new MessageBox(shlDogKennelManagement);
					messageBox.setText("Warning");
					messageBox.setMessage("Already Sold");
					messageBox.open();
				}
				else{
				String dogBreedToSell = comboAvailableBreeds.getText();
				String dogNameToSell = comboDogNames.getText();
				//dogBreedMap
				//dogNameMap

				int countOfDogsInBreed = dogBreedMap.get(dogBreedToSell);
				int newCount = countOfDogsInBreed-1;
				dogBreedMap.put(dogBreedToSell, newCount);
				
				dogNameMap.remove(dogNameToSell);
				
				label_Sold.setText("Sold Successfully");
				}
			}
		});
		buttonSell.setBounds(283, 214, 59, 39);
		buttonSell.setText("Sell");

		label_Sold = new Label(shlDogKennelManagement, SWT.NONE);
		label_Sold.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		label_Sold.setBounds(368, 242, 130, 15);
		shlDogKennelManagement.setTabList(new Control[]{textBoxDogBreed, textBoxNoOfDogs, buttonAdd1, textBoxBreedOfDog, textBoxNameOfDog, buttonAdd2, comboAvailableBreeds, buttonCheck, textCountOfAvailableDogs, comboDogNames, buttonSell, btnBuy, btnSell});

	}
}
