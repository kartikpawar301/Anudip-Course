/*
 * Create a Food class. Each Food must have foodId, foodName, type(veg or non-veg), price, rating. 
 * Create an ArrayList of Food objects. Print the ArrayList in the ascending order of the food price.
 */

package collections;

public class Food implements Comparable<Food>{
	
	private Integer foodId;
	private String foodName;
	private String type;
	private Double price;
	private Float rating;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(Integer foodId, String foodName, String type, Double price, Float rating) {

		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.type = type;
		this.price = price;
		this.rating = rating;
	}

	@Override
	public String toString() {

		return "Food Info \nFoodId=" + foodId + "\nFoodName=" + foodName + "\nType=" + type + "\nPrice=" + price + "\nRating="
				+ rating + "\n________________________________________________________________________________\n";
	}

	public Integer getFoodId() {

		return foodId;
	}

	public void setFoodId(Integer foodId) {

		this.foodId = foodId;
	}

	public String getFoodName() {

		return foodName;
	}

	public void setFoodName(String foodName) {

		this.foodName = foodName;
	}

	public String getType() {

		return type;
	}

	public void setType(String type) {

		this.type = type;
	}

	public Double getPrice() {

		return price;
	}

	public void setPrice(Double price) {

		this.price = price;
	}

	public Float getRating() {

		return rating;
	}

	public void setRating(Float rating) {

		this.rating = rating;
	}

	@Override
	public int compareTo(Food o) {
		
		return this.price.compareTo(o.price);
	}	

}
