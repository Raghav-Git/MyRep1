package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;

public class DogKennelManagementUI {

	protected Shell shlDogKennelManagement;
	private Button btnHeaderBuy;
	private Button btnHeaderSell;
	private Text textBoxDogName;
	private Text textBoxDogAge;
	private Text textBoxGetAge;
	private Text textBoxIsVaccinated;
	private Combo comboSelectBreed;
	private Button radioYes;
	private Button radioNo;
	private Button buttonBuy;
	private Combo comboSelectDogName;
	private Button buttonSell;
	private Combo comboSelectBreedToSell;
	private Label lblAvailable;

	static HashMap<String, Integer> dogBreedMap = new HashMap<>();
	static List<String> dogBreedList = new ArrayList<String>();
	static HashMap<String, List<Object>> dogMap = new HashMap<>();
	private Text textBoxDogsAvailableCount;
	private Label labelBought;
	private Label labelSold;


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DogKennelManagementUI window = new DogKennelManagementUI();
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
		shlDogKennelManagement.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		shlDogKennelManagement.setSize(576, 300);
		shlDogKennelManagement.setText("Dog Kennel Management System");
		shlDogKennelManagement.setLayout(null);

		Label label = new Label(shlDogKennelManagement, SWT.SEPARATOR | SWT.VERTICAL);
		label.setBounds(280, 26, 2, 225);

		btnHeaderBuy = new Button(shlDogKennelManagement, SWT.NONE);
		btnHeaderBuy.setEnabled(false);
		btnHeaderBuy.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnHeaderBuy.setBounds(105, 10, 75, 15);
		btnHeaderBuy.setText("BUY");

		btnHeaderSell = new Button(shlDogKennelManagement, SWT.NONE);
		btnHeaderSell.setEnabled(false);
		btnHeaderSell.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnHeaderSell.setText("SELL");
		btnHeaderSell.setBounds(374, 10, 75, 15);

		comboSelectBreed = new Combo(shlDogKennelManagement, SWT.READ_ONLY);
		comboSelectBreed.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				labelBought.setText("");
			}
		});
		comboSelectBreed.setItems(new String[] {"Pug", "Bull Dog", "Labrador", "German Shephered", "Pomerian", "Mastiff", "Golden Retriever"});
		comboSelectBreed.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		comboSelectBreed.setBounds(118, 54, 138, 25);

		Label lblSelectBreed = new Label(shlDogKennelManagement, SWT.NONE);
		lblSelectBreed.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblSelectBreed.setAlignment(SWT.RIGHT);
		lblSelectBreed.setBounds(10, 57, 102, 21);
		lblSelectBreed.setText("Select Breed :");

		textBoxDogName = new Text(shlDogKennelManagement, SWT.BORDER);
		textBoxDogName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				labelBought.setText("");
			}
		});
		textBoxDogName.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		textBoxDogName.setBounds(118, 93, 119, 27);

		textBoxDogAge = new Text(shlDogKennelManagement, SWT.BORDER);
		textBoxDogAge.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		textBoxDogAge.setBounds(118, 126, 47, 25);
		
		
		Label lblDogName = new Label(shlDogKennelManagement, SWT.NONE);
		lblDogName.setText("Dog Name :");
		lblDogName.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblDogName.setAlignment(SWT.RIGHT);
		lblDogName.setBounds(10, 93, 102, 21);
		

		Label lblAge = new Label(shlDogKennelManagement, SWT.NONE);
		lblAge.setText("Age :");
		lblAge.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblAge.setAlignment(SWT.RIGHT);
		lblAge.setBounds(10, 126, 102, 21);

		radioYes = new Button(shlDogKennelManagement, SWT.RADIO);
		radioYes.setBounds(120, 158, 44, 16);
		radioYes.setText("Yes");

		radioNo = new Button(shlDogKennelManagement, SWT.RADIO);
		radioNo.setText("No");
		radioNo.setBounds(173, 158, 44, 16);

		Label lblVaccinated = new Label(shlDogKennelManagement, SWT.NONE);
		lblVaccinated.setText("Vaccinated :");
		lblVaccinated.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblVaccinated.setAlignment(SWT.RIGHT);
		lblVaccinated.setBounds(10, 153, 102, 21);

		buttonBuy = new Button(shlDogKennelManagement, SWT.NONE);
		buttonBuy.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				MessageBox messageBox = new MessageBox(shlDogKennelManagement);
				messageBox.setText("Warning");
				if(comboSelectBreed.getText().equalsIgnoreCase("")){
					//MessageBox messageBox = new MessageBox(shell);
					//messageBox.setText("Warning");
					messageBox.setMessage("Please select Dog Breed");
					messageBox.open();
				}
				else if(textBoxDogName.getText().equalsIgnoreCase("")){
					messageBox.setMessage("Please enter Dog Name");
					messageBox.open();
				}
				else if(textBoxDogAge.getText().equalsIgnoreCase("")){
					messageBox.setMessage("Please enter Dog's Age");
					messageBox.open();
				}
				else if(radioYes.getSelection()==false & radioNo.getSelection()==false){

					messageBox.setMessage("Please select VACCINATION status");
					messageBox.open();
				}
				else if(dogMap.containsKey(textBoxDogName.getText())){
					messageBox.setMessage("This Dog Name is already Added");
					messageBox.open();
				}
				else{

					// create dialog with ok and cancel button and info icon
					MessageBox dialog = new MessageBox(shlDogKennelManagement, SWT.ICON_QUESTION | SWT.YES| SWT.NO);
					dialog.setText("Confirm");
					dialog.setMessage("Do you really want to buy this Dog");
					int returnCode = dialog.open(); //64=Yes , 128=No
					if(returnCode==64)
					{
						String dogBreed = comboSelectBreed.getText();
						String dogName = textBoxDogName.getText();
						//	Integer dogAge = Integer.parseInt(textBoxDogAge.getText());
						double dogAge = Double.parseDouble(textBoxDogAge.getText());
						boolean isVaccinated = radioYes.getSelection();

						if(dogBreedMap.containsKey(dogBreed)){
							int existingDogsCount = dogBreedMap.get(dogBreed);
							int newDogsCount = existingDogsCount+1;
							dogBreedMap.put(dogBreed, newDogsCount);
						}
						else{
							dogBreedMap.put(dogBreed, 1);
						}
						if(!(dogBreedList.contains(dogBreed))){
							dogBreedList.add(dogBreed);
						}

						List<Object> dogAttributesList = new ArrayList<>();
						dogAttributesList.add(dogBreed);
						dogAttributesList.add(dogAge);
						dogAttributesList.add(isVaccinated);

						dogMap.put(dogName, dogAttributesList);
						System.out.println("dog map : "+dogMap);

						//create an array to add items to comboBox select breed to sell
						String[] dogBreedArray = new String[dogBreedList.size()];
						dogBreedArray = dogBreedList.toArray(dogBreedArray);
						comboSelectBreedToSell.setItems(dogBreedArray);

						labelBought.setText("Added to Kennel");
						radioYes.setSelection(false);
						radioNo.setSelection(false);
					}
					else{
						labelBought.setText("Buying Cancelled");
					}
				}
			}
		});
		buttonBuy.setBounds(37, 201, 75, 25);
		buttonBuy.setText("BUY");

		Label label_1 = new Label(shlDogKennelManagement, SWT.NONE);
		label_1.setText("Select Breed :");
		label_1.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		label_1.setAlignment(SWT.RIGHT);
		label_1.setBounds(298, 57, 102, 21);

		Label lblSelectDog = new Label(shlDogKennelManagement, SWT.NONE);
		lblSelectDog.setText("Select Dog :");
		lblSelectDog.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblSelectDog.setAlignment(SWT.RIGHT);
		lblSelectDog.setBounds(298, 119, 102, 21);

		comboSelectDogName = new Combo(shlDogKennelManagement, SWT.READ_ONLY);
		comboSelectDogName.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				String dogNameSelected = comboSelectDogName.getText();

				List<Object> dogAttributList = dogMap.get(dogNameSelected);

				String dogBreed = dogAttributList.get(0).toString();
				//int dogAge = Integer.parseInt(dogAttributList.get(1).toString());
				double dogAge = Double.parseDouble(dogAttributList.get(1).toString());
				boolean dogVaccinationStatus =(Boolean)dogAttributList.get(2);

				String isVaccinated="No";
				if(dogVaccinationStatus){
					isVaccinated = "Yes";
				}
				textBoxGetAge.setText(Double.toString(dogAge));
				textBoxIsVaccinated.setText(isVaccinated);

			}
		});
		comboSelectDogName.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		comboSelectDogName.setBounds(406, 116, 138, 25);

		Label label_2 = new Label(shlDogKennelManagement, SWT.NONE);
		label_2.setText("Age :");
		label_2.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		label_2.setAlignment(SWT.RIGHT);
		label_2.setBounds(288, 153, 47, 21);

		textBoxGetAge = new Text(shlDogKennelManagement, SWT.BORDER | SWT.CENTER);
		textBoxGetAge.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		textBoxGetAge.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		textBoxGetAge.setEditable(false);
		textBoxGetAge.setBounds(341, 153, 47, 29);

		Label lblVaccinated_1 = new Label(shlDogKennelManagement, SWT.NONE);
		lblVaccinated_1.setText("Vaccinated :");
		lblVaccinated_1.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblVaccinated_1.setAlignment(SWT.RIGHT);
		lblVaccinated_1.setBounds(399, 153, 82, 21);

		textBoxIsVaccinated = new Text(shlDogKennelManagement, SWT.BORDER | SWT.CENTER);
		textBoxIsVaccinated.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		textBoxIsVaccinated.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		textBoxIsVaccinated.setEditable(false);
		textBoxIsVaccinated.setBounds(487, 153, 38, 29);

		buttonSell = new Button(shlDogKennelManagement, SWT.NONE);
		buttonSell.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				MessageBox messageBox = new MessageBox(shlDogKennelManagement);
				messageBox.setText("Warning");

				if(Integer.parseInt(textBoxDogsAvailableCount.getText())<1){
					messageBox.setMessage("No Dogs Available In This Breed");
					messageBox.open();
				}
				else if(comboSelectDogName.getText().isEmpty()){
					messageBox.setMessage("Please select Dog Name");
					messageBox.open();
				}
				else if(!(dogMap.containsKey(comboSelectDogName.getText()))){
					messageBox.setMessage("This Dog is already Sold");
					messageBox.open();
				}

				else{

					MessageBox dialog = new MessageBox(shlDogKennelManagement, SWT.ICON_QUESTION | SWT.YES| SWT.NO);
					dialog.setText("Confirm");
					dialog.setMessage("Do you really want to SELL this Dog");
					int returnCode = dialog.open(); //64=Yes , 128=No

					if(returnCode==64){
						String dogNameToSell = comboSelectDogName.getText();
						String dogBreedToSell = comboSelectBreedToSell.getText();

						dogMap.remove(dogNameToSell);
						int existingCountOfBreed = dogBreedMap.get(dogBreedToSell);
						int newCount = existingCountOfBreed-1;
						if(newCount==0){
							dogBreedMap.remove(dogBreedToSell);
							dogBreedList.remove(dogBreedToSell);

							String[] dogBreedArray = new String[dogBreedList.size()];
							dogBreedArray = dogBreedList.toArray(dogBreedArray);
							comboSelectBreedToSell.setItems(dogBreedArray);
						}
						else{
							dogBreedMap.put(dogBreedToSell, newCount);
						}

						textBoxDogsAvailableCount.setText(Integer.toString(newCount));

						//resetting the combo box for dog name after removing the name of dog sold
						//code to get all the dog names of the selected breed and display them in drop down
						List<String> dogNamesList = new ArrayList<>();
						Set<String> dogMapKeySet = dogMap.keySet();
						for(String key : dogMapKeySet){
							List<Object> dogMapList = dogMap.get(key);
							if(dogMapList.contains(dogBreedToSell)){
								dogNamesList.add(key);
							}
						}
						String[] dogNamesArray = new String[dogNamesList.size()];
						dogNamesArray = dogNamesList.toArray(dogNamesArray);
						comboSelectDogName.setItems(dogNamesArray);

						//comboSelectBreedToSell.setText("--select--");

						labelSold.setText("Sold");
						textBoxGetAge.setText("");
						textBoxIsVaccinated.setText("");
						System.out.println(dogBreedMap);
					}
					else{
						labelSold.setText("Selling Cancelled");
					}
				}
			}
		});
		buttonSell.setText("SELL");
		buttonSell.setBounds(304, 201, 75, 25);

		comboSelectBreedToSell = new Combo(shlDogKennelManagement, SWT.READ_ONLY);
		comboSelectBreedToSell.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				labelSold.setText("");
			}
		});
		comboSelectBreedToSell.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String dogBreedSelected = comboSelectBreedToSell.getText();
				int countOfDogsInBreed = dogBreedMap.get(dogBreedSelected);
				textBoxDogsAvailableCount.setText(Integer.toString(countOfDogsInBreed));
				//dogBreedMap.

				//code to get all the dog names of the selected breed and display them in drop down
				List<String> dogNamesList = new ArrayList<>();

				Set<String> dogMapKeySet = dogMap.keySet();
				for(String key : dogMapKeySet){
					List<Object> dogMapList = dogMap.get(key);
					if(dogMapList.contains(dogBreedSelected)){
						dogNamesList.add(key);
					}
				}

				String[] dogNamesArray = new String[dogNamesList.size()];
				dogNamesArray = dogNamesList.toArray(dogNamesArray);
				comboSelectDogName.setItems(dogNamesArray);
			}
		});
		comboSelectBreedToSell.setItems(new String[] {});
		comboSelectBreedToSell.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));
		comboSelectBreedToSell.setBounds(406, 54, 138, 25);

		textBoxDogsAvailableCount = new Text(shlDogKennelManagement, SWT.BORDER | SWT.READ_ONLY | SWT.CENTER);
		textBoxDogsAvailableCount.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				labelSold.setText("");
			}
		});
		textBoxDogsAvailableCount.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		textBoxDogsAvailableCount.setBounds(406, 84, 38, 25);

		lblAvailable = new Label(shlDogKennelManagement, SWT.NONE);
		lblAvailable.setText("Available :");
		lblAvailable.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblAvailable.setAlignment(SWT.RIGHT);
		lblAvailable.setBounds(298, 85, 102, 21);

		labelBought = new Label(shlDogKennelManagement, SWT.NONE);
		labelBought.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		labelBought.setBounds(37, 232, 100, 15);

		labelSold = new Label(shlDogKennelManagement, SWT.NONE);
		labelSold.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		labelSold.setBounds(306, 232, 100, 15);

	}
}
