package oops;
/**
 * What is static keyword
 * Functions can be static and non-static
 * Global and local variables
 * Global Variables can be static and non-static
 * Local Variables are neither static nor non-static
 * Static functions can only access static things //func and variables
 * Non-static functions can access both static and non static things.
 */
public class OOP_1 {

	String nonStaticName="Raghav";  //non-static global variable 
	static String staticName="Raghav";   //static global variable  

	public static void main(String[] args) { // static function


		sum();
		//sendMail();

		staticName="";
		//nonStaticName="";

	}

	public static void sum(){
		int i = 100;  //local variable non-static	
	}

	public void sendMail(){

		sum();
		sendMail();

		staticName="";
		nonStaticName="";
	}


}
