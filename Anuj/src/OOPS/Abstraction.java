package OOPS;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c1 = new Car();
//		c1.sayCar();
		
		BMW b1 = new BMW();
		b1.sayBMW();
		b1.run();
	}

}


class BMW extends Car{
	public BMW() {
		System.out.println("This is BMW Constructor");
	}
	
	void sayBMW() {
		System.out.println("hh. .hh..h .h.hhhhhhhh.");
	}
	
	@Override
	void run() {
		System.out.println("BMW is Running");
	}
}


// you can not make object of abstract class
// you can not put definition of abstract function only declaration and 
// must definition in the children.
// abstract function must be declared inside abstract class; 
abstract class Car{
	
	String name;
	int vTx;
	
	public Car() {
		System.out.println("Concept Car Constructor");
	}
	
	void sayCar() {
		System.out.println("Brhm...Brhm.............");
	}
	
	abstract void run();
	
}