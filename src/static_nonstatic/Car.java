package static_nonstatic;

public class Car {

	String model;
	int price;
	int wheels;
	

	public static void main(String[] args) {
		//creating the object of the class
		Car c1 = new Car();
		c1.model="Honda";
		c1.price=500000;
		c1.wheels=4;
		c1.start();
		c1.stop();
		
		Car c2 = new Car();
		c2.model="BMW";
		c2.price=800000;
		c2.wheels=4;
		c2.start();
		c2.stop();
		
		System.out.println(c1.model);
		System.out.println(c2.model);
	}

	
	public void start(){ 	//ns
		System.out.println("Starting "+model);
	}
	
	public void changeGear(){	//ns
		System.out.println("Changing Gear "+model);
	}

	public void stop(){
		System.out.println("Stopping "+model);
	}
}
