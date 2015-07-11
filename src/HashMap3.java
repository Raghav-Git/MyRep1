import java.util.Map;



public class HashMap3 {

	public static void main(String[] args) {
		hashMapExample();
	}

	public static void hashMapExample(){

		//Map<String, String> map = new Map<String, String>;
		
		
		java.util.HashMap<Integer, Integer> map1 = new java.util.HashMap<Integer, Integer>();

		for(int i=1; i<=10; i++){

			int j=i*100;

			map1.put(i, j);
		}

		System.out.println("Size of map "+map1.size());

		for(int i=1;i<=map1.size();i++){
			System.out.println(map1.get(i));
		}
	}
}
