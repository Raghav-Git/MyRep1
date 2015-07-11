package inheritance1;

public class BMW extends Car{  //BMW is inheriting the Car Class //BMW is child or subClass
								//Car is Super or Parent Class

	public BMW(){
		System.out.println("BMW Constructor");
	}
	
	public void autoTransmission(){
		System.out.println("BMW AutoTransmission");
	}

	public void start(){
		System.out.println("Starting BMW");
	}
	
}
