import java.util.*;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter the Two Numbers to Find Greatest Common Divisor :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int n1 = num1;
        int n2 = num2;
        while(num1 != num2){
            if(num1 > num2){
                num1 = num1 - num2;
            }else{
                num2 = num2 - num1;
            }
        }

        System.out.println("Greates Common Divisor of " + n1 + " and " + n2 + " is :" + num2);
    }    
}
