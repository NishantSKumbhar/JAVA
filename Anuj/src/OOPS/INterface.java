package OOPS;

public class INterface {
	public static void main(String[] args) {
		Audi a1 = new Audi();
		a1.start();
		a1.walk();
	}

}


interface car1{
	// default are public and abstract
	// all the functions are abstract
	// so, you can not write body
	void start();
}

interface person1{
	void walk();
}

class Audi implements car1, person1{
	public Audi() {
		System.out.println("Audi");
	}
	
	@Override
	public void start() {
		System.out.println("Audi Started....");
	}
	
	public void walk() {
		System.out.println("Walking......");
	}
}