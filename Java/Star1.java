import java.util.*;

class Star1{
	public static void main(String args[]){
		System.out.println("Enter the Number of Rows : ");
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
}
/*

input-->5

 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *

 */