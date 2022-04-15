import java.util.*;

class Factorial{
	public static void main(String args[]){
		System.out.println("Jay Ganesh");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int facto = 1;
		for(int i = 1; i <= number; i++){
			facto = facto * i;
		}
		
		System.out.println("Factorial of " + number + " is " + facto);
	}
	
}