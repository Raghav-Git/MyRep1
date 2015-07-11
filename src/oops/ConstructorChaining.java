package oops;

public class ConstructorChaining {

	public ConstructorChaining(){
		System.out.println("Inside default constructor");
	}
	
	public ConstructorChaining(int j){
		System.out.println("Inside constructor with single parameter int");
	}
	
	public ConstructorChaining(int i,int j){
		this(j);
		System.out.println("This is constructor with double parameter int , int");
		
	}
	
	public static void main(String[] args) {

		ConstructorChaining c1 = new ConstructorChaining();
		ConstructorChaining c2 = new ConstructorChaining(10);
		ConstructorChaining c3 = new ConstructorChaining(100,200);
	}

}
