import java.util.*;

public class Strings3 {
    public static void main(String[] args) {
        System.out.println("Enter the Two Strings : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        // IMP : Strings are Immutable.........
        // IMP : here we can use == operator betwn two strings , but sometimes it fails.
        // better to uss compare operator.

        if(s1.compareTo(s2) > 0){                               // compare function working : 
            System.out.println("String1 [ " + s1 + " ] is greaater than String 2 [ " + s2 + " ]");  // if s1 > s2 then it will return +ve value;
        }else if(s1.compareTo(s2) == 0){
            System.out.println("Both the Strings are Equal.");
        }else{                                              // if s1 == s2 then return 0;
            System.out.println("String2 [ " + s2 + " ] is greaater than String 1 [ " + s1 + " ]");
             // if s1 < s2 then return -ve value;
        }

        System.out.println("*****************************************");
        // substring 
        String kame = "Toney Stark";
        String subString = kame.substring(0,kame.length());
        System.out.println(subString);

        System.out.println("*****************************************");

        // if there is a integer in string and if we want to take string and convert it into integer
        // vice versa then we can use following method
        String bun = "121";
        int number = Integer.parseInt(bun);
        System.out.println(number);
        int num = 9098;
        String vam = Integer.toString(num);
        System.out.println(vam);
        



    }    
}
