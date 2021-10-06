import java.util.*;

import jdk.nashorn.api.tree.GotoTree;
public class Factorial {
    public static int blueSky(int num){
        int facto = 1;
        for(int i = 1; i <= num ;i ++){
            facto = facto * i;
        }
        return facto;
    }

    public static void main(String[] args){
        System.out.print(">>> Enter the Number :");
        Scanner nc = new Scanner(System.in);
        
        int n = nc.nextInt();
        if(n < 0){
            System.out.println("Invalid Input !");
            return ;
        }
        
        System.out.println("Factorial of Number is "+ blueSky(n));
    }
}
