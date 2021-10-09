import java.util.*;

public class Strings2 {
    public static void main(String[] args) {
        System.out.println("Enter any String  : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = name.length();
        System.out.println("Length of the String [ " + name + " ] is : " + length);
        
        for(int i = 0; i < length ; i++){
            System.out.println(name.charAt(i));
        }
    }
}
