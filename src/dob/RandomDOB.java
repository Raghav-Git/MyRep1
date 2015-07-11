package dob;



public class RandomDOB {

	public static void main(String[] args) {
		try{
			for(int i=0; i<10; i++){
			//String returnDate = generateRandomDOB();
			//System.out.println(returnDate);
			
			String ssn = generateRandomSSN();
			System.out.println(ssn);
			}
			
			

		}catch(Exception exp){
			System.out.println(exp);
		}
	}

	public static String generateRandomDOB() throws Exception{

		int year = randBetween(1970, 1999);
		int month = randBetween(01,12);
		String monthString = ""+month;
		//0 - to pad with zeros
		//2 - to set width to 2
		monthString=  monthString.format("%02d", month);
		//System.out.println(monthString);
		int day = randBetween(01,27);
		String dayString = ""+day;
		dayString = dayString.format("%02d", day);
		String finalDate = year+"-"+monthString+"-"+dayString;
		System.out.println(finalDate);
		return finalDate;

	}

	public static String generateRandomSSN() throws Exception{
		//121-22-1234
		int randomPart =  randBetween(1111, 9999);
		String finalSSN = "121-22-"+randomPart;
		return finalSSN;
	}
	
	public static int randBetween(int start, int end) {
		return start + (int)Math.round(Math.random() * (end - start));
	}

}
