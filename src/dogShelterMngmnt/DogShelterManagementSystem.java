package dogShelterMngmnt;

/**
Dog Shelter Management
======================
1. Create a map dogBreeds 
key - breed of dog
value - no of dogs of that breed.

2. Create a map for DogNames
key - name of dog
value - breed of dog

3. Ask user to enter the breed of dog.
Display the total no of dogs of that breed.
Display the names of dogs of that breed.

4. If the breed is not present display:
"No dogs found for this breed."
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DogShelterManagementSystem {

	static HashMap<String, Integer> mapOfBreeds = new HashMap<>();
	static HashMap<String, String> mapOfDogs = new HashMap<>();
	static String dogBreed = "";
	static int dogsInBreed;
	
	public static void main(String[] args) {
		populateMapOfBreeds();
		populateMapOfDogs();
		getUserInput();
		getNumberOfDogsInBreed();
		getDogNamesInBreed();
	}

	public static void populateMapOfBreeds(){
		mapOfBreeds.put("Labrador", 2);
		mapOfBreeds.put("BullDog", 1);
		mapOfBreeds.put("German Shephered", 1);
		mapOfBreeds.put("Goldern Retriever", 0);
	}

	public static void populateMapOfDogs(){
		mapOfDogs.put("Jackie", "Labrador");
		mapOfDogs.put("Jimmy", "Labrador");
		mapOfDogs.put("Tommy", "BullDog");
		mapOfDogs.put("Tiger", "German Shephered");
	}

	public static void getUserInput(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Breed Of Dog");
		dogBreed = scan.nextLine();
		scan.close();
	}
	
	public static void getNumberOfDogsInBreed(){
		if(mapOfBreeds.keySet().contains(dogBreed)){
		dogsInBreed = mapOfBreeds.get(dogBreed);
		System.out.println("Number of Dogs Available in "+dogBreed+" = "+dogsInBreed);
		}
		else{
			System.out.println("This breed is not currently availabe - "+dogBreed);
			System.exit(0);
		}
	}

	public static void getDogNamesInBreed(){
		System.out.println("Names of Dogs of Breed "+dogBreed);
		Set<String> keySet = mapOfDogs.keySet();
		for(String key : keySet){
			if(mapOfDogs.get(key).equalsIgnoreCase(dogBreed)){
				System.out.println(key);
			}
		}
	}
}
