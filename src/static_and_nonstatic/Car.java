package static_and_nonstatic;

public class Car {
	
	String model;
	int price;
	static int wheels=4;

	public static void main(String[] args) {

		Car c1 = new Car();		//creating object of class Car
		Car c2 = new Car();
		
		c1.model="Honda";
		c1.price=800000;
		//c1.wheels=4;
		c1.start();
		c1.stop();
		c1.fillFuel(100);
		fillFuel(100);
		Car.fillFuel(100);
		
		c2.model="Maruti";
		c2.price=500000;
		//c2.wheels=4;
		c2.start();
		c2.stop();
		c2.fillFuel(200);
		Car.fillFuel(200);
		fillFuel(200);
		
		
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.wheels);
		
		System.out.println(c2.model);
		System.out.println(c2.price);
		System.out.println(c2.wheels);
		
		System.out.println("====================");
		
		System.out.println(wheels);  	// 4
		System.out.println(Car.wheels);	// 4
		System.out.println(c1.wheels);	// 4
		System.out.println(c2.wheels);	// 4
		
		c1.wheels=8;
		
		System.out.println(wheels);		// 8
		System.out.println(Car.wheels);	// 8
		System.out.println(c1.wheels);	// 8
		System.out.println(c2.wheels);	// 8
		
	}
	
	
	public void start(){	//ns
		System.out.println(model+" - Starting");
	}
	
	public void stop(){		//ns
		System.out.println(model+" - Stopping");
	}
	
	public static void fillFuel(int quantity){
		
		System.out.println(" - Filling Fuel "+quantity+" ltr");
	}

}
