/*
 * Take two inputs. Eg 3 and 4. Find the value of 3^4 i.e. 3 raised to 4. 
 * You cannot use Math.pow() method.
 */

package practice;

public class CalculatePower {

	    public static void main(String[] args) {
	    	
	        int base = 3;
	        int exponent = 4;

	        int result = calculatePower(base, exponent);

	        System.out.println(base + "^" + exponent + " = " + result);
	    }

	    public static int calculatePower(int base, int exponent) {
	    	
	        int result = 1;
	        
	        for (int i = 0; i < exponent; i++) {
	            result *= base;
	        }
	        return result;
	    }
	}
