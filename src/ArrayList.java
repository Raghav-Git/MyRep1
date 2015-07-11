import java.util.Collections;


public class ArrayList {

	public static void main(String[] args) {

		arrayListExample();
	}

	
	public static void arrayListExample(){
		
		java.util.ArrayList<Integer> arlist = new java.util.ArrayList<Integer>();
	
		arlist.add(1);
		arlist.add(2);
		arlist.add(4);
		arlist.add(3);
		arlist.add(6);
		arlist.add(5);
		
		arlist.remove(0);
		
		arlist.add(0, 5);
		
		arlist.get(2);
		
		arlist.isEmpty();
		
		arlist.size();
		
		System.out.println(arlist);
		
		Collections.sort(arlist);
		
		System.out.println(arlist);
		
		arlist.clear();
		
		
		
	}
	
}
