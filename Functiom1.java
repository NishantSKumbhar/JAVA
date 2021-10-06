import java.util.*;
public class Functiom1 {
    public static void blueSky(String name){
        System.out.println(name);
    }

    public static void main(String[] args){
        System.out.print(">>> Enter Your Name :");
        Scanner nc = new Scanner(System.in);
        String name = nc.next();

        blueSky(name);
    }
}
