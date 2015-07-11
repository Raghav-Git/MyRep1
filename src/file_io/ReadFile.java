package file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	 
    public static void main(String a[]){
    	try {
    	BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/Raghav/Documents/Framework/JavaTutorials/Day1Java/Files/Text1.txt"));
    	String strLine1 = "";
    	
    	while((strLine1=br1.readLine()) != null){
    		System.out.println(strLine1);
    	}
    	
    	BufferedReader br = null;
        String strLine = "";
        
           
        	
        	br = new BufferedReader( new FileReader("fileName"));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            
            
            }
        } catch (FileNotFoundException e) {
            System.err.println("Unable to find the file: fileName");
        } catch (IOException e) {
            System.err.println("Unable to read the file: fileName");
        }
    }
}