/*
@author : Nishant Sanjay Kumbhar
@goal : Write a function which takes in 2 numbers and returns the greater of those two.
*/
import java.util.*;


class Greater{

	public static int whichGreater(int a, int b){
		if(a > b){
			return a;
		}return b;
	}

	public static void main(String args[]){
		System.out.println("Enter the Two Numbers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int greater = whichGreater(a, b);
		System.out.println("Greater Number : " + greater);
	}
}