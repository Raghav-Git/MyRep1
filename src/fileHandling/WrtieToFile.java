package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WrtieToFile {

	public static void main(String[] args) {

		try{
		//create a File Object
		File f = new File("C:\\Users\\Raghav\\Documents\\Framework\\JavaTutorials\\Day1Java\\Files\\Text2.txt");
		
		String str = "Today is Wednesday";
		
		//FileWriter overwrite
		/////FileWriter fw = new FileWriter(f);
		//FileWriter append
		FileWriter fw = new FileWriter(f, true);
		//BufferedWriter
		BufferedWriter bw = new BufferedWriter(fw);
		
	//	bw.append("abcd");
		//bw.newLine();
		bw.write(str);
		bw.newLine();
		bw.write("\nToday is Feb-4-2015.******");
		
		bw.flush();
		
		bw.close(); //flush gets called automatically
		
		System.out.println("Written To File\nSuccess");
		
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
