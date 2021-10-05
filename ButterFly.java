import java.util.*;
public class ButterFly {
    public static void main(String[] args){
        System.out.println("Enter the Number of Row to print ButterFly : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i <= row ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(" * ");
            }

            int spaces = 2 * (row - i);
            for(int j = 1 ; j <= spaces ; j++){
                System.out.print("   ");
            }

            for(int j = 1; j <= i ; j++){
                System.out.print(" * ");
            }


            System.out.println();
        }
        for(int i = row; i >= 1 ; i--){
            for(int j = 1; j <= i ; j++){
                System.out.print(" * ");
            }

            int spaces = 2 * (row - i);
            for(int j = 1 ; j <= spaces ; j++){
                System.out.print("   ");
            }

            for(int j = 1; j <= i ; j++){
                System.out.print(" * ");
            }


            System.out.println();
        }
    }
}
