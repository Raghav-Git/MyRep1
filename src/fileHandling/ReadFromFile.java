package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile {

	public static void main(String[] args) {
		
	
		
		try{
			
			//File f = new File("C:/Users/Raghav/Documents/Framework/JavaTutorials/Day1Java/Files/Text1.txt");
			File f = new File("C:/Users/Raghav/Desktop/ToSend/April-13/Test1.xls");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String str="";
			
			while( (str=br.readLine()) != null ){
				System.out.println(str);
			}
			br.close();
			fr.close();
			
			
		}catch(Exception exp){
			System.out.println(exp);
		}finally{
			System.out.println("Inside Finally");
			//br.close();
			//fr.close();
		}
		System.out.println("Completed");
	}

}
