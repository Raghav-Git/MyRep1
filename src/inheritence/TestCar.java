package inheritence;

public class TestCar {

	public static void main(String[] args) {

		Car c = new Car();
		c.start();
		c.stop();

		System.out.println("*******************");

		BMW b = new BMW();
		b.autoBreak();
		b.start();  //OverRiding
		b.stop();

		System.out.println("+++++++++++++++++++++++");

		Car c1 = new BMW();
		//Reference of Parent Class = Object Of Child Class
		c1.model="ABC";
		c1.price=700000;
		c1.start();  //Child Class func Start
		c1.stop();
		//c1.autoBreak();
		
		
	}
}
