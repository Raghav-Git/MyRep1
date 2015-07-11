package file_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteFile2 {

	public static void main(String[] args) {
		try{
			
			String content = "abcd";
			File file = new File("C:/Users/Raghav/Documents/Framework/JavaTutorials/Day1Java/Files/Text4.txt");

			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			if(!file.exists()){
				file.createNewFile();
			}
			
			bw.write(content);
			bw.close();


		}catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
		}
	}

}
