package constructorAndInterface;

public class TestCar {

	public static void main(String[] args) {

		Alto alto = new Alto();
		alto.start();
		alto.stop();
		alto.features();
		System.out.println("*******************************");
		
		Esteem esteem = new Esteem();
		esteem.start();
		esteem.stop();
		esteem.features();
		
		
		
	}

}
