/*
@author : Nishant Sanjay Kumbhar
@goal : Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
*/
import java.util.*;


class TillUser{
	public static void main(String args[]){
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		Scanner sc = new Scanner(System.in);
		
		char choice;
		do{

			System.out.println("Enter the Number : ");
			int num = sc.nextInt();
			if(num > 0){
				positive++;
			}else if(num < 0){
				negative++;
			}else{
				zeros++;
			}

			System.out.println("If you want to continue press Y , For Quit Press Q : ");
			choice = sc.next().charAt(0);

		}while(choice == 'y' || choice == 'Y');

		System.out.println("Positive Numbers : " + positive);
		System.out.println("Negative Numbers : " + negative);
		System.out.println("Zeros Numbers : " + zeros);
	}
}