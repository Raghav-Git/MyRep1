package static_nonstatic;

public class THISTest {

	String name;
	
	public THISTest(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {

		
		THISTest t = new THISTest("Raghav");
		System.out.println(t.name);
	
		
	}

}
