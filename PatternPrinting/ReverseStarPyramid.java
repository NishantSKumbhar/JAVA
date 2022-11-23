import java.util.*;

class ReverseStarPyramid{
	public static void main(String args[]){
		System.out.println("Enter the Number of Rows : ");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int flag = n;
		for(int i = 1; i <= n; i++){

			for(int j = 1; j <= (i-1); j++){
				System.out.print("   ");
			}

			for(int j = 1; j <= (n + (flag - i)); j++){
				System.out.print(" * ");
			}
			flag--;
			System.out.println();
		}
		
	}
}

