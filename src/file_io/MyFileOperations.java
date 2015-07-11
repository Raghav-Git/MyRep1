package file_io;

import java.io.File;

public class MyFileOperations {

	public static void main(String[] a){

		try{
			String path="C:\\Users\\Raghav\\Documents\\Framework\\JavaTutorials\\Day1Java\\Files\\";
			File file = new File("C:\\Users\\Raghav\\Documents\\Framework\\JavaTutorials\\Day1Java\\Files\\Text1.txt");
			//Tests whether the application can read the file
			
			System.out.println(file.compareTo(new File("C:\\Users\\Raghav\\Documents\\Framework\\JavaTutorials\\Day1Java\\Files\\Text1.txt")));
			
			file.createNewFile();
			
			String filePath=file.getAbsolutePath();
			String canonicalPath=file.getCanonicalPath();
			System.out.println(file.getTotalSpace());
			System.out.println(file.length());
			file.renameTo(new File("C:\\Users\\Raghav\\Documents\\Framework\\JavaTutorials\\Day1Java\\Files\\Text2.txt"));
			
			
			
			file.delete();
			file.createTempFile("Text2","txt");
			file.createTempFile("Text2.txt", path);
			
			System.out.println(file.canRead());
			//Tests whether the application can modify the file
			System.out.println(file.canWrite());
			//Tests whether the application can modify the file
			System.out.println(file.createNewFile());
			//Deletes the file or directory
			System.out.println(file.delete());
			//Tests whether the file or directory exists.
			//Tests whether the application can modify the file
			System.out.println(file.createNewFile());
			System.out.println(file.exists());
			//Returns the absolute pathname string.
			System.out.println(file.getAbsolutePath());
			//Tests whether the file is a directory or not.
			System.out.println(file.isDirectory());
			//Tests whether the file is a hidden file or not.
			System.out.println(file.isHidden());
			//Returns an array of strings naming the
			//files and directories in the directory.
			System.out.println(file.list());
		} catch(Exception ex){
			System.out.println("Exp Cause : "+ex.getCause());
			System.out.println("Exp Msg : "+ex.getMessage());
		}
	}
}