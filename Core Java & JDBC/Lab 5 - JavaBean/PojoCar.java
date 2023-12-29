package practice;

class Car2{
	
	private int carId;
	private String engineType;
	private String color;
	private String brand;
	/*
	 * As seen below toString method is used to fetch/get all the data in all
	 * variables.
	 * Whenever we bring the reference variable of an object toString method is
	 * automatically called and we will be able to see all the data stored in the
	 * object	 
	 * */
	@Override
	public String toString() {
		return "PojoCar [carId=" + carId + ", engineType=" + engineType + 
				", color=" + color + ", brand=" + brand + "]";
	}
}
public class PojoCar {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
