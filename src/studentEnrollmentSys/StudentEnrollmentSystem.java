package studentEnrollmentSys;

/**
  Student Enrollment System
   =========================

1. Create 4 student maps
student1
student2
student3
student4

Add the following data in the maps:
Name, RollNo, Age, Dept

Take the following input from user.
Name:
LaptopToBeIssued:

Add the key Laptop with Model given by user to the particular student map.

Display the updated students map
 */
import java.util.HashMap;
import java.util.Scanner;

public class StudentEnrollmentSystem {

	static HashMap<String, String> student1 = new HashMap<>();
	static HashMap<String, String> student2 = new HashMap<>();
	static HashMap<String, String> student3 = new HashMap<>();
	static HashMap<String, String> student4 = new HashMap<>();
	
	static String studentName="";
	static String laptopModel="";
	
	public static void main(String[] args) {
		populateStudentMaps();
		displayStudentMap();
		getUserInput();
		updateStudentMap();
		displayStudentMap();
	}

	public static void populateStudentMaps(){
		
		student1.put("Name", "Raghav");
		student1.put("Age", "27");
		student1.put("RollNo", "100");
		student1.put("Dept", "Automation");
		
		student2.put("Name", "Shiv");
		student2.put("Age", "27");
		student2.put("RollNo", "200");
		student2.put("Dept", "Development");
		
		student3.put("Name", "Manpreet");
		student3.put("Age", "24");
		student3.put("RollNo", "300");
		student3.put("Dept", "Java1");
		
		student4.put("Name", "Gurjit");
		student4.put("Age", "23");
		student4.put("RollNo", "400");
		student4.put("Dept", "Java2");
		
	}
	
	
	public static void getUserInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		studentName = scan.next();
		System.out.println("Enter Laptop Model to be Issued : ");
		laptopModel = scan.next();
		scan.close();
	}
	
	public static void updateStudentMap(){
		
		if(student1.values().contains(studentName)){
			student1.put("Laptop", laptopModel);
		}
		else if(student2.values().contains(studentName)){
			student2.put("Laptop", laptopModel);
		}
		else if(student3.values().contains(studentName)){
			student3.put("Laptop", laptopModel);
		}
		else if(student4.values().contains(studentName)){
			student4.put("Laptop", laptopModel);
		}
		else{
			System.out.println("Student Name NOT FOUND in any map");
			System.exit(0);
		}
	}
	
	public static void displayStudentMap(){
		System.out.println("*************************************************");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println("*************************************************");
	}
	
}
