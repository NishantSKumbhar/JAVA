import java.util.*;

class Star3{
	public static void main(String args[]){
		System.out.println("Jay Ganesh ....");
		System.out.println("Enter the Number of Rows : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			// inner loop for spaces
			for(int j = 1; j <= (n-i); j++){
				System.out.print("   ");
			}

			// inner loop for stars
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