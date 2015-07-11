package en;

public class TestCar {

	public static void main(String[] args) {

		Car c1 = new Car();
		
	//	c1.setCompany("Maruti");
		c1.setModel("Alto");
		c1.setPrice(300000);
		
		Car c2 = new Car();
	//	c2.setCompany("Honda");
		c2.setModel("Amaze");
		c2.setPrice(700000);
		
		
		System.out.println(c1.getCompany());
		System.out.println(c1.getModel());
		System.out.println(c1.getPrice());
		
		System.out.println("\n***************************\n");
		
		System.out.println(c2.getCompany());
		System.out.println(c2.getModel());
		System.out.println(c2.getPrice());
		
	}

}
