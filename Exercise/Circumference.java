/*
@author : Nishant Sanjay Kumbhar
@goal : Write a function that takes in the radius as input and returns the circumference of a circle.-> 2 pie r
*/
import java.util.*;


class Circumference{

	public static int getCircumference(int radius){
		int c = (2 * 3.14) * radius;
		return c;
	}

	public static void main(String args[]){
		System.out.println("Enter the Radius : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		int c = getCircumference(r);
		System.out.println("Circumference is : " + c);
	}
}