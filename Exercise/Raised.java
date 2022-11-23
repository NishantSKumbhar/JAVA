/*
@author : Nishant Sanjay Kumbhar
@goal : Two numbers are entered by the user, x and n. 
		Write a function to find the value of one number raised to the power of another i.e. x ^ n.

*/
import java.util.*;


class Raised{

	public static int raised(int b, int p){
		int r = 1;
		for(int i = 1; i <= p; i++){
			r = r * b;
		}
		return r;
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base Value : ");
		int base = sc.nextInt();
		System.out.println("Enter the Power Value : ");
		int power = sc.nextInt();

		int result = raised(base, power);
		System.out.println("Result : " + result);
	}
}


/*

2 ^ 3 --> 2*2*2
4 ^ 3 --> 4*4*4
2 ^ 5 --> 2*2*2*2*2
*/