
public class PrimeNumber {

	
	public static void main(String[] args) {
		isPrimeNo(4);
	}
	
	public static void isPrimeNo(int num){
		
		int flag=0;
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				System.out.println("This is not a Prime No");
				flag=1;
				break;
			}
		}
			if(flag==0)
		System.out.println("This is a Prime Number");
	}

}
