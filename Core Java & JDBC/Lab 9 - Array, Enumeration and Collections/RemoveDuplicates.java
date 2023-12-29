// Create an ArrayList of String type and remove all the duplicates from this list.

package collections;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {

	ArrayList<String> fruits=new ArrayList<String>();
	fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("apple");
        fruits.add("dates");
        fruits.add("banana");

        System.out.println("Original ArrayList:\n" + fruits);

        ArrayList<String> uniqList = new ArrayList<>();

        for (String element : fruits) {

            if (!uniqList.contains(element)) {

                uniqList.add(element);
            }
        }

     
        fruits.clear();

        fruits.addAll(uniqList);

        System.out.println("\nArrayList after removing duplicates:\n" + fruits);
	}

}
