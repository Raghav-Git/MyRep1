package inheritance1;

//interface only has method Declaration / no body
//no static functions
//mandatory to initialize variables
//cannot change variable values

public interface CarInterface {

	int minPrice=100000;  //we need to initialize variable and its final (cannot change)
	
	public void start();
	public void changeGear();
	public void accelerate();
	public void applyBreak();
	public void stop();
	
}
