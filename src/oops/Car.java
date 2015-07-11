package oops;
/**
 * How to create objects
 * new Car()  // creates a object in memory
 * Car c1 = new Car()  // c1 is the reference to the object // object is new Car()
 * How using c1 we can call all the non-static stuff.
 * How we can also create multiple objects c2, c3 ...
 * 
 * All cars have 4 wheels. If i create 1000 objects everytime i need to initialize it to 4
 * Why unnecessary occupy memory. So we can make it static
 * 
 * Static things do not reside inside objects but in common memory locations
 * From where it can be refererred by any calling Class, function
 * 
 * We can call static variables or functions 
 * Directly - wheels
 * With class name - Car.wheels
 * With object reference - c1.wheels
 * 
 * Why main functions is static. 
 * So that compiler can call it w/o creating an object of main func.
 * Gives a kind of root to start the program.
 * 
 * Creating multiple constructors with different arguments is called OVERLOADING
 * Same thing can be done with function.
 * Same name diff parameters - Constructor OVERLOADING, Function OVERLOADING
 * 
 *  This Keyword.
 *  This is the keyword in java that always points to the current object.
 *  i.e. whichever object is calling the constructor.
 *  When the name of local variable and global variable are same. local variable hides the global variable.
 *  Local takes precedence over global.
 *  To tell compiler that we are referring to the global variable we use keywork THIS.
 */
public class Car {

	String model;
	int price;
	//int wheels;
	static int wheels=4;
	
	
	//Constructor
	//have name same as class name
	//looks similar to func but is not func
	// no static no void
	
	//this is the constructor of class Car that takes 2 params
	
	//This concept of creating Constructors with diff arguments is called OVERLOADING.
	public Car(String model, int price){
		System.out.println("Inside Car Constructor - 2 Arguments");
		this.model=model;
		this.price=price;
	}
	
	public Car(){
		System.out.println("Inside Car Constructor - No arguments");
	}
	
	public static void main(String[] args) {
		//create object of the class
		new Car(); //in the memory an object will be created where all the non-static things will reside
		new Car();
		new Car();
		Car c1 = new Car();
		c1.model="Maruti";
		c1.price=500000;
	//	c1.wheels=4;
		c1.start();
		c1.accelerate();
		//can access only non static stuff with c1
		
		
		Car c2 = new Car();
		c2.model="Honda";
		c2.price=700000;
	//	c2.wheels=4;
		c2.start();
		c2.accelerate();
		//can access only non static stuff with c2
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		
		//STATIC
		System.out.println(wheels);
		System.out.println(Car.wheels);
		System.out.println(c1.wheels);
		c1.wheels=8;
		System.out.println(wheels);
		System.out.println(Car.wheels);
		System.out.println(c1.wheels);
		System.out.println(c2.wheels);
	
		//System.out.println(price);  //compiler gets confused which price you are talking about.
	
		fillFuel(10);
		Car.fillFuel(100);
		c1.fillFuel(200);
	
	}

	public void start(){  //non-static
		System.out.println(model+ " -Starting");
	}
	
	public void accelerate(){  //ns
		System.out.println(model+ " -Accelerating");
	}
	
	public void changeGear(){  //ns
		System.out.println(model+ " -Changing gear");
	}
	
	public static void fillFuel(int quantity){
		System.out.println("Filling fuel "+quantity+ " ltr");
	}
}
