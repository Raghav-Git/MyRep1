import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PrintHighestMarks {

	
	public static void main(String[] args) {
		
		//getHighestMarks();
		getHighestMarksLoop();
	}
	
	
	public static void getHighestMarksLoop(){
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> studentNamesList = new ArrayList<String>();
		ArrayList<Integer> studentMarksList = new ArrayList<Integer>();
		
		for(int i=1; i<5; i++){
			
			//String studentName = "student"+i;
			//String studentMarks = "student"+i+"Marks";
			
			System.out.println("Enter Name of Student "+i);
			String studentName=scan.next();
			studentNamesList.add(studentName);
			
			System.out.println("Enter Marks for "+studentName);
			int studentMarks=scan.nextInt();
			studentMarksList.add(studentMarks);
			
		}
		
		
		int lengthOfNameArray = studentNamesList.size();
		String HighestMarksStudent="";
		
		
		for(int i=0; i<(lengthOfNameArray-1); i++){
			
			
			// 50 60 70 80 60
			if(studentMarksList.get(i)>studentMarksList.get(i+1)){
				HighestMarksStudent=studentNamesList.get(i);
			}else{
				HighestMarksStudent=studentNamesList.get(i+1);
			}
		}
		
		Collections.sort(studentMarksList);
		int marks=studentMarksList.get(studentMarksList.size()-1);
		System.out.println("Highest marks are "+marks);
		
		
		System.out.println("Highest Marks Getting Student is : "+HighestMarksStudent);
		
	}
	
	
	public static void  getHighestMarks(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name of First Student");
		String student1 = scan.nextLine();
		
		System.out.println("Enter Name of Second Student");
		String student2 = scan.nextLine();
		
		System.out.println("Enter Marks of "+student1);
		int student1Marks = scan.nextInt();
		
		System.out.println("Enter Marks of "+student2);
		int student2Marks = scan.nextInt();
		
		if(student1Marks>student2Marks){
			System.out.println("Highest Marks got by "+student1);
		}else{
			System.out.println("Highest Marks got by "+student2);
		}
		
	}

}
