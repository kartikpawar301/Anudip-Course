package practice;

public class StaticVariable2 {

	public static void main(String[] args) {
		
		StaticVariable svp = new StaticVariable();
		System.out.println("Sum is:" + svp.sum);
		//with creating object
		
		System.out.println("Sum is:" + StaticVariable.sum);
		//without creating object 
	}

}
