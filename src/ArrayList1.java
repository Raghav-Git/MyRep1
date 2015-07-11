import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class ArrayList1 {

	public static void main(String[] args) {

		arrayListExample();
		arrayListIterator();
		cloneArrayList();
		subList();
		shuffleList();
		swapListElements();
	}


	public static void arrayListExample(){

		ArrayList<String> arList = new ArrayList<String>();

		//store names of Cars

		arList.add("Maruti");  //0
		arList.add("BMW");     //1
		arList.add("Honda");   //2
		arList.add("Toyota");  //3
		arList.add("Hyundai"); //4 
		arList.add("Hyundai"); 

		System.out.println(arList);

		System.out.println(arList.get(4)); //Hyundai

		arList.remove(4);

		arList.add(4, "Chevrolet");

		System.out.println(arList.get(4)); //Chevrolet

		System.out.println(arList);

		System.out.println(arList.get(2));
		System.out.println(arList.get(0));


		System.out.println("Size of ArrayList is "+arList.size());


		//Sorting Array List
		System.out.println(arList);
		Collections.sort(arList);
		System.out.println(arList);


		System.out.println(arList.isEmpty());   //false
		arList.clear(); 
		System.out.println(arList.isEmpty());   //true

		//arList.clear();  // clears all elements of the arraylist

		System.out.println("============================");

		//ArrayList of Integers
		ArrayList<Integer> arList2 = new ArrayList<Integer>();

		arList2.add(4);
		arList2.add(2);
		arList2.add(5);
		arList2.add(1);
		arList2.add(3);
		arList2.add(6);

		System.out.println(arList2);  //[4,2,5,1,3,6]

		Collections.sort(arList2);
		System.out.println(arList2);  //[1,2,3,4,5,6]

		Comparator comparator = Collections.reverseOrder();
		Collections.sort(arList2,comparator);

		Collections.reverse(arList2);
		System.out.println(arList2);



	}

	public static void arrayListIterator(){
		ArrayList<String> arrl = new ArrayList<String>();
		
		
		ArrayList<Object> ar1 = new ArrayList<>();
		ar1.add(1);
		
		//adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		Iterator<String> itr = arrl.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void cloneArrayList(){
		ArrayList<String> arrl = new ArrayList<String>();
		//adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:"+arrl);
		
		ArrayList<String> copy = (ArrayList<String>) arrl.clone();
		System.out.println("Cloned ArrayList:"+copy);
	}
	
	public static void subList(){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arrl.add("Click");
        System.out.println("Actual ArrayList:"+arrl);
        
        List<String> list = arrl.subList(2, 4);
        System.out.println("Sub List: "+list);
    }

	
	
	public static void shuffleList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
         
        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for(String str: list){
            System.out.println(str);
        }
         
        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for(String str: list){
            System.out.println(str);
        }
    }
	
	
	
	
	
	  public static void swapListElements(){
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("Java");
	        list.add("Cric");
	        list.add("Play");
	        list.add("Watch");
	        list.add("Glass");
	        list.add("Movie");
	        list.add("Girl");
	         
	        Collections.swap(list, 2, 5);
	        System.out.println("Results after swap operation:");
	        for(String str: list){
	            System.out.println(str);
	        }
	    }
	
}