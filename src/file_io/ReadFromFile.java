package file_io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {

	public static void main(String[] args) {
try{
		FileReader fr = new FileReader("C:/Users/Raghav/Documents/Framework/JavaTutorials/Day1Java/Files/Text1.txt");
		BufferedReader br = new BufferedReader(fr);
		String readStr = "";
		
		while( (readStr = br.readLine()) != null){
			System.out.println(readStr);
		}
		
}catch(Exception exp){
	System.out.println(exp.getCause());
	System.out.println(exp.getMessage());
}
	}

}
