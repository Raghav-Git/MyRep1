package static_and_nonstatic;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Static_NonStatic {

	String name;		//non static global variable
	static int age;		//static global variable
	
	public static void main(String[] args) {
		
		sub();
		//add();
		
		age=100;
		//name="John";
	}
	
	public  void add(){ 	// non static
		int a = 10;		//local
		
		sub();
		add();
		
		age=100;
		name="John";
	}

	public static void sub(){	//static
		int x=100;		//local
	}
}
