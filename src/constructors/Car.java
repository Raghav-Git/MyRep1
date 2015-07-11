package constructors;

public class Car {

	String model;
	int price;
	
	//default constructor
	public Car(){   
		System.out.println("Inside Car Default Constructor");
	}
	
	
	
	//parameterized constructor
	public Car(String model, int price){ 	
		System.out.println("Inside parameterized constructor String | int");
		
		this.model=model;  //local variable always takes preferece over global variables when names are same
		this.price=price;
		
	}

	
	
	

	public void start(){
		
		System.out.println("Starting Car "+model);
		System.exit(0);
	}
	
}
