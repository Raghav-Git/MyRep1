package examFeb9.Ques1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 1. Create a project to do the following:

Get following student data from user for 5 students.
RollNo
Name
Age
Subject
PhoneNo.

Store all the information in ArrayLists.

When a user ask for information for any particular student.
Display all the information of the student.
 *
 */
public class Program1 {

	public static void main(String[] args) {

		ArrayList<String> student1 = new ArrayList<>();
		ArrayList<String> student2 = new ArrayList<>();
		ArrayList<String> student3 = new ArrayList<>();
		ArrayList<String> student4 = new ArrayList<>();
		ArrayList<String> student5 = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int k=1;k<=5;k++){
			System.out.println("Student "+k+" RollNo : ");
			String rollNo = scan.next();
			if(k==1){
				student1.add(rollNo);
			}
			System.out.println("Student "+k+" Name : ");
			String name = scan.next();
			if(k==1){
				student1.add(name);
			}
		}
		/*
		student1.add("1");
		student1.add("Raghav");
		student1.add("27");
		student1.add("Automation");
		student1.add("7837585616");
		
		student2.add("2");
		student2.add("Manpreet");
		student2.add("20");
		student2.add("Java");
		student2.add("980000000");
		
		student3.add("3");
		student3.add("Gurjit");
		student3.add("20");
		student3.add("OOPS");
		student3.add("990000000");
		
		student4.add("4");
		student4.add("Shiv");
		student4.add("27");
		student4.add("PHP");
		student4.add("9090909090");
		
		student5.add("5");
		student5.add("John");
		student5.add("27");
		student5.add("Env");
		student5.add("987890000");
		*/
		
		
		System.out.println("Enter Name of Student : ");
		String studentName = scan.next();
		//System.out.println(studentName);
		System.out.println("================================");
		
		ArrayList<String> al=null;
		
		if(studentName.equalsIgnoreCase("Raghav")){
			al = student1;
		}else if(studentName.equalsIgnoreCase("Manpreet")){
			al = student2;
		}else if(studentName.equalsIgnoreCase("Gurjit")){
			al = student3;
		}else if(studentName.equalsIgnoreCase("Shiv")){
			al = student4;
		}else if(studentName.equalsIgnoreCase("John")){
			al = student5;
		}
		else{
			System.out.println("Not a Valid Student Name");
			System.exit(0);
		}
			for(int i=0;i<5;i++){
				System.out.println(al.get(i));
			}
		
	}

}
