import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        //bydefault in java array
        //if it is int arr then -> 0
        //if it is float -> 0.0
        //if it is boolean -> false

        for(int i = 0; i <= size; i++){
            System.out.println(arr[i]);
        }
        
    }
    
    
}
