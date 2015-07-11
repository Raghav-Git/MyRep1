package static_and_nonstatic;

public class TestCar {

	String model;
	
	public static void main(String[] args) {

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = "A";
		b.model = "B";
		c.model = "C";
		
		System.out.println(a.model);	// A
		System.out.println(b.model);	// B
		System.out.println(c.model);	// C
		System.out.println("+++++++++++++++++++");
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.model);	// B
		System.out.println(b.model);	// C
		System.out.println(c.model);	// B
		
		//"******************************"
		
	}

}
