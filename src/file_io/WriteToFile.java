package file_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) {
		try{
			String content = "This sentence will be written in file";

			File file = new File("C:/Users/Raghav/Documents/Framework/JavaTutorials/Day1Java/Files/Text3.txt");

			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			if(!file.exists()){
				file.createNewFile();
			}
			
			bw.write(content);
			bw.close();
			System.out.println("Done");
			
			

		}catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
		}

	}
}
