
public class Pyramids {


	public static void main(String[] args) {
		createPyramid();
		//output();
	}






	public static void output(){

		//print on console
		System.out.println("Hello World");

		int i = 10;

		System.out.println("Value of i is "+i);
		System.out.println("Hello "+"World");



		String str1 = "Hello ";
		str1 = "World";
		System.out.println(str1);
		
		int a=10;
		int b=20;
		System.out.println(a);


	}







	public static void createPyramid(){

		for(int x=1; x<10; x++){

			for(int y=0; y<x; y++){
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
