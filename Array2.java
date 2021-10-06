import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        System.out.println("Enter the Size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Elements : ");
        for(int i  = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("You have Entered : ");
        for(int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }    
}
