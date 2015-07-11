package file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

public class FileIO {

	public static void main(String[] args) {
		try{
			File file = new File("C:/Users/Raghav/Documents/Framework/JavaTutorials/Day1Java/Files/Text1.txt");

			FileInputStream fileIn = new FileInputStream(file);
			
			int i;
			while((i = fileIn.read()) !=-1){
				System.out.println(fileIn.read());
			}
		}catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
		}

	}

}
