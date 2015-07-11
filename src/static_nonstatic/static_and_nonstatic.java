package static_nonstatic;

public class static_and_nonstatic {

	//global variables
	String name;		//non static
	static int age;  	// static


	public static void main(String[] args) {

		add();
		//subtract();

		age=20;
		//name="Raghav";
	}

	public static void add(){   //static func
		int a=10;				//local variable - is neither static nor non-static
	}

	public void subtract(){     //non static func
		int x=100;				//local variable

		add();
		subtract();
 
		age=20;
		name="Raghav";


	}

}
