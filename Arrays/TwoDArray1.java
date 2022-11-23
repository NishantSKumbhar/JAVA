import java.util.*;

class TwoDArray1{
	public static void main(String args[]){
		System.out.println("Enter the Row : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("Enter the Coloumn  : ");
		int c = sc.nextInt();
		System.out.println("Enter the Marks -> ");
		int[][] marks = new int[r][c];

		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				marks[i][j] = sc.nextInt();
			}
		}

		System.out.println("Marks are Displayed as -> ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				System.out.print(marks[i][j] + ", ");
			}
			System.out.println();
		}

		System.out.println("Size using length : ");
		System.out.println("Size : " + marks.length);

	}
}