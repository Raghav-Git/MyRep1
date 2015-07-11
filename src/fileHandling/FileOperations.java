package fileHandling;

import java.io.File;
import java.io.FileReader;

public class FileOperations {

	public static void main(String[] args) {

		try{
		
		File f = new File("C:/Users/Raghav/Documents/Framework/JavaTutorials/Day1Java/Files/Text1.txt");
		
		//File Operations
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getName());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.delete());

		f.createNewFile();
		
		
		
		
		
		
		//FileReader fr = new FileReader(f);  //compile time exception
											//checked exception	
		
		
		
		
		
		
		//int i = 20/0;		//run time exception
							//unchecked exception
		
		
		
		
		}catch(Exception exp){
			System.out.println(exp);
		}
		
	}

}
