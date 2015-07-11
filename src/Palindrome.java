
public class Palindrome {

	
	public static void main(String[] args) {
		isPalindrome(121);
	}
	
	public static void isPalindrome(int num){
		
		int palindrome = num;
		int reverse = 0;
		
		System.out.println("No = "+palindrome);
		
		while(palindrome !=0 ){
			
			int remainder = palindrome % 10;
			reverse = reverse*10+remainder;
			palindrome = palindrome/10;
			
		}
		
		System.out.println("Reverse = "+reverse);
	
		if(reverse==num){
			System.out.println("This is a Palindrome No.");
		}
		else{
			System.out.println("This is not a Palindrome No.");
		}
		
	}

}
