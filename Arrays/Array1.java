import java.util.*;

class Array1{
	public static void main(String args[]){
		System.out.println("Enter the Count of Numbers : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		System.out.println("Enter the Marks -> ");
		int[] marks = new int[count];
		for(int i = 0; i < count; i++){
			marks[i] = sc.nextInt();
		}

		System.out.println("Marks are Displayed as -> ");
		for(int i = 0; i < count; i++){
			System.out.println(marks[i]);
		}

		System.out.println("Size using length : ");
		System.out.println("Size : " + marks.length);

	}
}