package HashMapWithList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapWithListValues {

	static HashMap<String, List<Object>> map1 = new HashMap<>();

	public static void main(String[] args) {
		HashMapWithListValues();
	}

	public static void HashMapWithListValues(){

		List<Object> list1 = new ArrayList<>();

		list1.add("Labrador");
		list1.add(2);
		list1.add(true);

		map1.put("Pluto", list1);

		List<Object> list2 = new ArrayList<>();

		list2.add("Labrador");
		list2.add(2);
		list2.add(false);

		map1.put("Jupitor", list2);
		System.out.println(map1);
		
		int count = 0;
		List<String> dogNameList = new ArrayList<>();
		Set<String> keySet = map1.keySet();
		for(String key : keySet){
			List<Object> listFetched = map1.get(key);
			if(listFetched.contains("Labrador")){
				count = count + 1;
				dogNameList.add(key);
			}
			
		}
		System.out.println("Count of Labra = "+count);
		
		List<Object> getDogAttributes = map1.get("Jupitor");
		System.out.println(getDogAttributes.get(0));
		System.out.println(getDogAttributes.get(1));
		System.out.println(getDogAttributes.get(2));
	}

}
