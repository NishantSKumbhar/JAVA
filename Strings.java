import java.util.*;

public class Strings {   // here if the file name is only String then it will give Error.
    public static void main(String[] args) {
        System.out.println("Enter Your Name : ");
        Scanner sc = new Scanner(System.in);
           String name = sc.nextLine();
           System.out.println("Hi , "+name);
    }
}
