import java.util.*;

public class sumOfOdd {
    
    public static int sumOf(int num){
        if(num % 2 == 0){
            num = num - 1;
        }
        int sum = 0;
        for(int i = 1; i <= num; i = i + 2){
            sum = sum + i;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number till , You want Odd number Sum : ");
        int num = sc.nextInt();

        int sum = sumOf(num);

        System.out.println("Sum of Odd numbers till " + num + " is : " + sum + ".");

    }    
}
