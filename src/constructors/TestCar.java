package constructors;

public class TestCar {

	public static void main(String[] args) {

//	Car c = new Car();
	
	Car c = new Car("Honda", 50000);
	

	System.out.println("Model is "+c.model);  //Honda
	System.out.println("Price is "+c.price);  //500000	
	c.start();
	

	}

}
