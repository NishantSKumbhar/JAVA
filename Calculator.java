import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Calculator {
    public static void main(String[] args){
        System.out.print("Enter the Two Numbers : ");
        Scanner ac = new Scanner(System.in);
        int num1 = ac.nextInt();
        int num2 = ac.nextInt();

        System.out.println("Press the Following Button to Perform the Operations : ");
        System.out.println("Press 1 : to add two numbers");
        System.out.println("Press 2 : to substract two numbers");
        System.out.println("Press 3 : to multiply two numbers");
        System.out.println("Press 4 : to divide two numbers");
        System.out.println("Press 5 : to get modulos numbers");
        int button = ac.nextInt();
        if(button == 1){
            int add = num1 + num2;
            System.out.println("Addition is : " + add);
        }else if(button == 2){
            int sub = num1 - num2;
            System.out.println("Substraction is : "+ sub);
        }else if(button == 3){
            int mul = num1 * num2;
            System.out.println("Multiplication is : "+ mul);
        }else if(button == 4){
            int div = num1 / num2;
            System.out.println("Division will be : "+ div);
        }else if(button == 5){
            int mod = num1 % num2;
            System.out.println(" Modulous is : "+ mod);
        }else{
            System.out.println("Invalid Input !");
        }

    }
    
}
