package file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile2 {

	public static void main(String[] args) {
		try{
			File file = new File("C:/Users/Raghav/Documents/Framework/JavaTutorials/Day1Java/Files/Text3.txt");

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String str="";
			
			while((str=br.readLine())!=null){
				System.out.println(str);
			}


		}catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
		}
	}

}
