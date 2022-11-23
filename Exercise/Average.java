/*
@author : Nishant Sanjay Kumbhar
@goal : Enter 3 numbers from the user & make a function to print their average.
*/
import java.util.*;

class Average{

	public static int getAvg(int a, int b, int c){
		int avg = (a + b + c) / 3;
		return avg;
	}

	public static void main(String args[]){
		System.out.println("Enter the Three Numbers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int avg = getAvg(a, b, c);
		System.out.print("Average is : " + avg);
	}
}