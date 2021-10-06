import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class GreaterNum {
    public static int greater(int num1, int num2){
        int gr = 0;
        if(num1 > num2 ){
            gr = num1;
        }else if(num2 > num1){
            gr = num2;
        }else{
            gr = num1 = num2;
        }
        return gr;

    }
    public static void main(String[] args) {
        System.out.println("Enter the Two Number, to find maximum from both :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int g = greater(num1, num2);
        System.out.println("Greater Number from two number is : " + g);
    }
    
}
