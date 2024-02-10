package d32_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		// Add "Ankara" object to arrayList
		arrayList.add("Ankara"); 
		
		arrayList.add(1);
		
		arrayList.add(true);
		
		// Change the value of 1. index (1) with 7.68
		arrayList.set(1, 7.68);
		
		// Remove the object which in 2. index (true);
		arrayList.remove(2);
		
		// Get the value of O. index ("Ankara");
		System.out.println(arrayList.get(0));
		
		// Get all elements of arrayList
		for(Object object: arrayList) {
			System.out.println(object);
		}
		
		// Clear the arrayList, So delete all elements
		arrayList.clear();
		
		// Write ArrayList as Type-Safed
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Ankara");
		cities.add("İstanbul");
		cities.add("İzmir");
		cities.add("Aydın");
		
		cities.remove("İstanbul");
		
		Collections.sort(cities);
		
		for(String city: cities) {
			System.out.println(city);
		}
	}

}
