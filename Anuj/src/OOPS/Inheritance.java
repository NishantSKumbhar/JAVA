package OOPS;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p1 = new Person("HomoSepian", 100000);
//		p1.walk();
//		p1.speak();
//		
//		Manager m1 = new Manager("John Aryn", 9823, 890000);
//		m1.walk();
//		m1.speak();
//		m1.saySalary();
		


	}
	public void fun2() {
		System.out.println("This is in Package OOPS of class Inheritance");
	}

}



class Person{
	String name;
	int age;
	public Person(String name, int age) {
		
		System.out.println("Constructor of a Person Class");
		this.name = name;
		this.age = age;
		
	}
	
	void walk() {
		System.out.println("Person can walk");
	}
	
	void speak() {
		System.out.println("Person can speak");
	}
	
}

class Manager extends Person{
	String name;
	int age;
	int salary;
	public Manager(String name, int age, int salary) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("Constructor of a Manager");
	}
	
	void walk() {
		System.out.println("Manager can walk");
	}
	
	void saySalary() {
		System.out.println("Salary : " + this.salary);
	}
	
}