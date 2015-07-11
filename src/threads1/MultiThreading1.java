package threads1;

public class MultiThreading1 implements Runnable{

	@Override
	public void run() {
		//calls start() implicitly
		 System.out.println("My thread is in running state.");  
	}
	
	public static void main(String[] args) {

		MultiThreading1 obj = new MultiThreading1();
		Thread toObj = new Thread(obj);
		toObj.start();
	}

}
