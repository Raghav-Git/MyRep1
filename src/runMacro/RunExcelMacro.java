package runMacro;

import java.lang.Runtime;  
import java.lang.Process;  
import java.util.*;  

public class RunExcelMacro {


	public static void main(String[] args) {
		CallExcelMacro();
	}

	public static void CallExcelMacro(){

		try{  
			Runtime.getRuntime().exec("cmd /c Raj_vbs.vbs");  
		}catch(Exception e)  
		{ System.out.println(e);}  
	}  


}


