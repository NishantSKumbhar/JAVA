import java.util.*;
public class Power {
    
    public static int blueSky(int n1, int n2){
        int power = 1;
        for(int i = 1; i <= n2; i++){
            power = power * n1;
        }

        return power;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the Two Number i.e second number is power of First : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int power = blueSky(num1, num2);

        System.out.println(num1 + " ^ " + num2 + " :  "+ power);
        
    }
    
}
