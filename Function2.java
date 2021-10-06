import java.util.*;
public class Function2 {
    public static int blueSky(int num1, int num2){
        int sum;
        sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args){
        System.out.print(">>> Enter the Two Numbers :");
        Scanner nc = new Scanner(System.in);
        
        int n1 = nc.nextInt();
        int n2 = nc.nextInt();



        System.out.println("Sum of Two Numbers " + n1 + " & " + n2 + " is : " + blueSky(n1, n2));
    }
}
