import java.util.*;

public class TwoNumbers {
    
    public static void main(String[] args){
        System.out.println("Enter the Numbers : ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if(number1 == number2){
            System.out.println("Both Numbers are Equal.");
        }else{
            if(number1 > number2){
                System.out.println("Number1 is Greater than Number2");
            }else{
                System.out.println("Number2 is Greater than Number1");
            }
        }
    }    
}
