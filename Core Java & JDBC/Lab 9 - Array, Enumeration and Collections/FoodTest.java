/*
 * Create a Food class. Each Food must have foodId, foodName, type(veg or non-veg), price, rating. 
 * Create an ArrayList of Food objects. Print the ArrayList in the ascending order of the food price.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;

public class FoodTest {

	public static void main(String[] args) {
		
		ArrayList<Food> foodList=new ArrayList<Food>();
		
		foodList.add(new Food(17,  "Paneer Butter Masala", "Veg", 180.00, 4f));
		foodList.add(new Food(9,  "Malai Kofta", "Veg", 150.00, 3.9f));
		foodList.add(new Food(24,  "Alo Paratha", "Veg", 70.00, 4f));
		foodList.add(new Food(33,  "Chicken Biryani", "Non-veg", 210.00, 4.5f));
		foodList.add(new Food(39,  "Mutton Thali", "Non-veg", 300.00, 4.9f));
		
		Collections.sort(foodList);
		
		System.out.println("\nAfter sorting price wise:\n" + foodList);
	}

}
