import java.util.*;

public class Switch {
    public static void main(String[] args){
        System.out.print(">>> Enter the Number : ");
        Scanner nc = new Scanner(System.in);
        int button  = nc.nextInt();
        System.out.println("You have Entered the Number : "+button);

        switch(button){
            case 1 : System.out.println("Coding java");
            break;
            case 2 : System.out.println("Problems statements.");
            break;
            case 3: System.out.println("Take a Nap.");
            break;
            case 4: System.out.println("code");
            default: System.out.println("Sleep");
        }

    }    
}
