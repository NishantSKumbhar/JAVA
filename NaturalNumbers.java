import java.util.*;

public class NaturalNumbers {
    public static void main(String[] args){
        // Sum of n Natural numbers:
        System.out.println("Enter the Number till you want Sum : ");
        Scanner nc = new Scanner(System.in);
        int num = nc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num ; i++){
            sum = sum + i;
        }
        System.out.println("Sum till "+num+ " is : "+sum);
    }
}
