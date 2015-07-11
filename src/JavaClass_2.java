import java.util.Scanner;


public class JavaClass_2 {

	public static void main(String[] args) {

		// 123
		/*
		int i = 123; 
		double d = 123.13;
		long l = 123456789;
		String str = "Hello World";
		boolean b = true;
		char c = 'c';
		
		System.out.println("the integer valus is "+i);
		System.out.println(d);
		System.out.println(str);
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		*/
		
		
		//Conditional Statements
		//if else
		
		int a = 400;
		int b = 200;
		
		if(a>b){
			System.out.println("a is greater");
		}
		else{
			System.out.println("b is greater");
		}
		
		//nested if-else
		int a1=600;
		int b1=400;
		int c1=300;
		
		if(a1 > b1 & a1 > c1){
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1){
			System.out.println("b1 is the greatest");
		}
		else{
			System.out.println("c1 is the greatest");
		}
		
	}

}










/*
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

String input=scan.nextLine();
System.out.println(input);

System.out.println("Enter num 1");
int num1 = scan.nextInt();
System.out.println("Enter num 2");
int num2 = scan.nextInt();

int num3 = num1+num2;
System.out.println("Sum is "+num3);


	
}
*/