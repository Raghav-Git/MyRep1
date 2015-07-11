
public class SumOfNaturalNo {

	public static void main(String[] args) {

		getSum(0);
		getSum(1);
		getSum(10);
		getSum(100);
		getSum(200);
	
		
	}

	public static int getSum(int i){
		
		int Sum=0;
		for(int a=0; a<=i; a++){
			Sum = Sum+a;
		}
		
		System.out.println("Sum of "+i+" natural numbers is "+Sum);
		return Sum;
		
	}
	
}
