import java.util.Iterator;
import java.util.TreeMap;



public class HashMap2 {

	public static void main(String[] args) {
		hashMapExample();
	}
	
	public static void hashMapExample(){
		
		java.util.HashMap<Integer, String>  map = new java.util.HashMap();
		
		
		map.put(31, "Thirty One");  
		map.put(21, "Twenty One");
		map.put(1, "One");
		map.put(51, "Fifty One");  
		
		//sorted hashmap
				System.out.println("Unsorted HashMap: " + map);
				TreeMap sortedHashMap = new TreeMap(map);     
				System.out.println("Sorted HashMap: " + sortedHashMap); 

		Iterator<Integer> keySetIterator = map.keySet().iterator();

		while(keySetIterator.hasNext()){
		  Integer key = keySetIterator.next();
		  System.out.println("key: " + key + " value: " + map.get(key));
		}

	
		//containsKey and containsValue example
		System.out.println(map.containsKey(21));
		System.out.println(map.containsValue("Twenty One"));
		
		//check if hashmap is emtpy
		System.out.println(map.isEmpty());
		
		

		
	}
}
