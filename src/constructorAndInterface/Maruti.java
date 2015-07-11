package constructorAndInterface;

public class Maruti implements Car{

	static String model;
	
	public Maruti(){
		
	}
	
	public Maruti(String model){
		this.model=model;
	}
	
	@Override
	public void start() {
		System.out.println("Starting Maruti - "+model);
	}

	@Override
	public void stop() {
		System.out.println("Stopping Maruti - "+model);
	}

	

}
