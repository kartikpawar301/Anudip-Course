// Create a HashSet of String and sort the members according to the alphabetical order.

package collections;

import java.util.*;

public class  HashsetAlphaOrder{

	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("Cherry");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Dates");
        fruits.add("Banana");
        
        System.out.println("Original HashSet:\n" + fruits);
        
        //As set not maintained insertion order.so Convert the HashSet to a List
        List<String> sortedList = new ArrayList<String>(fruits);

        // Sort the List
        Collections.sort(sortedList);
        
        System.out.println("\nAlphabetically sorted list:\n" + sortedList);

	}

}
