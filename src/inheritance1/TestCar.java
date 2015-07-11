package inheritance1;

public class TestCar {

	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.model="";
		c.price=100000;
		c.start();
		c.stop();
		//c1.autoTransmission();  //cannot call this func
		
		BMW b = new BMW();
		b.model="BMW";
		b.price=800000;
		b.start();
		b.stop();
		b.autoTransmission();
		
		System.out.println("***************************");
		new Car();
		new BMW();
		
		
		Car c1 = new BMW();
		//will call func only present in the super class
		//if any func is overridden in child class, it will be called, not the parent class func.
		c1.start();  //BMW - overridden funcc
		c1.stop();   //Car - not overridden
		
		
		
		
	}

}
