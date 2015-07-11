package constructorChaining;

public class Apple extends Fruit{

	public Apple(){
		super("Apple","Kiwi");
		System.out.println("Inside Apple default Constructor");
	}

	
	public static void main(String[] args){
		Apple ap = new Apple();
		
	}
}
