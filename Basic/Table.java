import java.util.*;

class Table{
	public static void main(String args[]){
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i = 1; i <= 10; i++){
			System.out.println(number*i);
		}
	}
}