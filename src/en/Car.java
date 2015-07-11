package en;

public class Car {

	private String model;
	private int price;
	private String company="My Car Company";

	
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
	public String getCompany() {
		return company;
	}
/*	public void setCompany(String company) {
		this.company = company;
	}*/
	
	

}
