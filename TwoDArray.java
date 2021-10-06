import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Enter the Row and Coloumn : ");
        Scanner sc  = new Scanner(System.in);
        int row = sc.nextInt();
        int coloumn = sc.nextInt();
        int arr[][] = new int[row][coloumn];

        System.out.println("Enter the Elements : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                arr[i][j] = sc.nextInt();
            }
            System.err.println();
        }


        System.out.println("You have Entered : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }    
}
