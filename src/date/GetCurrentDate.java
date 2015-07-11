package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDate {

	public static void main(String[] args) {
		try{
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("Start Time : "+dateFormat.format(date)); //2014/08/06 15:59:48
		Thread.sleep(2000);
		Date date2 = new Date();
		System.out.println("Start Time : "+dateFormat.format(date2)); //2014/08/06 15:59:48
		
		
		
		
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
