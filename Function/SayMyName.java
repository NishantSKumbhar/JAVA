import java.util.*;


class SayMyName{

	public static void sayName(String name){
		System.out.println("Hello ! " + name);
	}

	public static void main(String args[]){
		System.out.println("Enter the Name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sayName(name);
	}
}