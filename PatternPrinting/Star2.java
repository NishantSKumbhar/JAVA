import java.util.*;

class Star2{
	public static void main(String args[]){
		System.out.println("Enter the Number of Rows : ");
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		
		for(int i = row; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
}
/*

input-->5

 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *

 */