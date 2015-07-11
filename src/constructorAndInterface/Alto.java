package constructorAndInterface;

public class Alto extends Maruti{

	public Alto(){
		Maruti m = new Maruti("ALTO");
	}
	
	public static void features(){
		System.out.println("This Car has air bags");
	}

}
