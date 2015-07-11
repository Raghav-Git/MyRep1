package file_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteToTextFile {
	public static void main(String[] args) {
try{
	
	String str = "Today is Wednesday";
	
	File file = new File("C:\\Users\\Raghav\\Documents\\Framework\\JavaTutorials\\Day1Java\\Files\\Text4.txt");
		
		if(!file.exists()){
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		
		
		
}catch(Exception e){
	System.out.println(e.getMessage());
	System.out.println(e);
}
		
	}

}
