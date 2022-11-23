/*
@author : Nishant Sanjay Kumbhar
@goal : Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
*/

import java.util.*;


class Eligible{

	public static boolean isEligible(int age){
		if(age > 18){
			return true;
		}else if(age < 0){
			System.out.println("Invalid Age !");
			return false;
		}else{
			return false;
		}
	}


	public static void main(String args[]){
		System.out.println("Enter the Age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(isEligible(age)){
			System.out.println("You are Eligible To Vote !");
		}else{
			System.out.println("Sorry ! You can not Vote !");
		}
	}
}