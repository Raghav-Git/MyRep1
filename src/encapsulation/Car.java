package encapsulation;

public class Car {

	//encapsulation
	private String companyName="Maruti";
	private String model;
	private int price;
	
	
	//Getters and Setters
	public String getCompanyName() {
		return companyName;
	}
	
/*	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}*/
	
	public String getModel() {
		System.out.println("This is the latest model");
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
