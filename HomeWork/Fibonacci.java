import java.util.*;

public class Fibonacci{
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 ...........
        System.out.print("Enter the Number how many Fibonacci series elements :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        if(num > 0){
            for(int i = 2; i <= num ; i++){
                System.out.print(b+" ");
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.err.println();
        }

    }
}