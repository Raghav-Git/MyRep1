package constructorChaining;

public class Fruit {


	public Fruit(){
		System.out.println("Inside defualt Fruit Constructor");
	}


	public Fruit(String str){
		this();					//here calling constructor with no param
		System.out.println("Inside String Constructor of Fruit");
	}

	public Fruit(String str1, String str2){
		this("Hello");
		System.out.println("Inside String String Const of Fruit");
	}



	public static void main(String[] args) {

		Fruit fr = new Fruit("Apple","Banana");
	}

}
