package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteAndReadFromFile {

	static File file = new File("C:\\Users\\Raghav\\Documents\\Framework\\JavaTutorials\\Day1Java\\Files\\Text10.txt");
	
	public static void main(String[] args) {
		try{
		
		FileWriter fw = new FileWriter(file);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write Your Line");
		String str = scan.nextLine();
		
		bw.write(str);
		bw.close();
		
		///////////////////////////////////
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str1="";
		/*
		while( (str1=br.readLine()) != null ){
			System.out.println(str1);
		}*/
		
		int i=0;
		String str10="";
		for(i=0;((str10=br.readLine()) != null) ;i++){
			System.out.println(str10);
		}
			
		
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

}
