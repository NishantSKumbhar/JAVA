import java.util.*;

public class EvenOdd {
    public static void main(String[] args){
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0){ 
            System.out.println("Number is Zero, neither odd nor even ! ");
        }else if(number % 2 == 0){
            System.out.println("Yes , It is Even.");
        }else{
            System.out.println("No , It is Odd");
        }
    }    
}
