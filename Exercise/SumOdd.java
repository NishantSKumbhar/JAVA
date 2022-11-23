/*
@author : Nishant Sanjay Kumbhar
@goal : Write a function to print the sum of all odd numbers from 1 to n.
*/
import java.util.*;

class SumOdd{

	public static int getSumOdd(int num){
		int s = 0;
		for(int i = 1; i <= num; i = i + 2){
			s = s + i;
		}
		return s;
	}

	public static void main(String args[]){
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = getSumOdd(number);
		System.out.println("Sum of Odd Numbers : " + sum);
	}
}