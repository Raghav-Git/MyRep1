package file_io;

import java.io.File;

public class GetFileList {
    
    public static void main(String a[]){
        File file = new File("C:/Users/Raghav/Documents/Framework/JavaTutorials/Day1Java/Files/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}