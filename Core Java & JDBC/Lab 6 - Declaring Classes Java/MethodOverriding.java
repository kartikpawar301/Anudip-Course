package inheritance.polymorphism;
/*
 * Explain with programs how the access specifiers can be changed in overridden methods.
 */
class Parent{
	
	public void sendResume() {
		
		System.out.println("Sending resume by post.....");
	}
	
	protected void display() {
		
		System.out.println("Hello Everyone.....");
	}
	
	private void show() {
		
		System.out.println("Bye Everyone.....");
	}
}

class Child extends Parent{
	
	public void sendResume(String s) {
		
		System.out.println("Sending resume by email.....");
	}
	/*
	 * in display we are overriding the inherited display method.
	 * here we have changed the access specifier from protected to public, this
	 * is allowed since we are increasing the visibility in child class.
	 */
	public void display() {
		
		super.display();
		System.out.println("Welcome Everyone.....");
	}
	
	public void show() {
		
		System.out.println("GoodBye Everyone.....");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.sendResume();
		c.sendResume("");
		c.display();
		c.show();
	}

}
