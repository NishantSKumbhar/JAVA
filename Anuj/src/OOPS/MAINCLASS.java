package OOPS;

public class MAINCLASS {
	public static void main(String []args) {
		System.out.println("This is Main Class");
	
		Mobile m1 = new Mobile();
		m1.price = 11000;
		m1.color = "Product Red";
		m1.isEnv = false;
		m1.name = "Note 10 Pro";
		m1.ram = 8;
	
		
		System.out.println(m1.color);
		
		m1.sayName();
		
		int asa = m1.sayName(88);
		System.out.println("Compile Time : " + asa);
		
		Mobile m2 = new Mobile(12);
		System.out.println("Count : " + Mobile.count);
		
		
		Mobile m3 = new Mobile("Note 5", 192112, 6, "Pink", true);
		System.out.println("Count : " + Mobile.count);
		
	}
	
	

}


class Mobile{
	String name;
	int price;
	int ram;
	String color;
	boolean isEnv;
	static int count = 0;
	
	public Mobile() {   // This is Default Constructor. 
		System.out.println("Constrctor Called");
		count++;
	}
	public Mobile(int price) {    // This is Parameterized Constructor. 
		System.out.println("Parameterized Constrctor Called");
		count++;
		this.price = price;
	}
	
	public Mobile(String nAme, int pRice, int rAm, String cOlor, boolean iSEnv) {
		this();  // here we called the Default Constructor
				 // because of () only paranthesis, this is default
		name = nAme;
		price = pRice;
		ram = rAm;
		color = cOlor;
		isEnv = iSEnv;
	}
	
	void sayName() {
		System.out.println(name);
	}
	
	int sayName(int num) {
		System.out.println("This Compile time Polymorphism " + num + " : " + name);
		return num + 10;
	}
	
}