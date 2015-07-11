import java.util.Scanner;


public class JavaClass_3 {

	public static void main(String[] args) {
/*
		//Concatenation
		String str1 = " Hello ";
		String str2 = " World ";
		//String str3 = str1 + str2;
		
		int i1 = 4;
		int i2 = 6;
		//int i3 = i1 + i2;
		
		System.out.println((i1 + i2) + str1 + str2);
		System.out.println(str1 + str2 + (i1 + i2));

		*/
		
		/****************************************/
		
		
		//Scanner
		//Java Scanner is used to take inputs from user.
		
		Scanner scan = new Scanner(System.in);
		
		//String str1 = scan.nextLine();
		//System.out.println("The output is "+str1);
		
		System.out.println("Enter first number:");
		int int1 = scan.nextInt();
		
		System.out.println("Enter second number:");
		int int2 = scan.nextInt();
		
		int int3 = int1 + int2;
		
		System.out.println("The Answer is "+int3);
		
		
		
		
		
	}

}
