/*
 * Create a user defined exception of AgeInvalidToVoteException 
 * which occurs if the user gives an age that is below 18.
 */
package exceptions.lab37;

import java.util.Scanner;

class AgeInvalidToVoteException extends Exception {

	public AgeInvalidToVoteException () {
				
		System.out.println("Your not eligible for voting because your below 18");
	}

	public String getMessage() {
	  
	return "age is too less";
	}
	
	public String toString() {
	  
	return "exceptionsPrograms.AgeInvalidToVoteException:age is too less";
  }
	
}

class AgeChecking{
	
	int age = 18;
	
	public void validAge(int newAge) throws AgeInvalidToVoteException {
		
		if (age>newAge) {
			
			throw new AgeInvalidToVoteException();
		}
		else {
			
			age=newAge;
			System.out.println("your eligible for voting because your above 18 ");
		}
	}
}

public class Age {

	public static void main(String[] args) {
		
		AgeChecking ag= new AgeChecking();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int newAge1 = sc.nextInt();
		try {
			
			ag.validAge(newAge1);
		} 
		catch (AgeInvalidToVoteException e) {
			
			e.printStackTrace();
		}
		
	}

}
