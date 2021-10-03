import java.util.*;

public class Conditional {
    public static void main(String[] args){
        System.out.println("Enter Your Age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("You are Good to Go !");
        }else{
            System.out.println("Sorry To Young !");
        }

    }    
}
