import java.util.*;

public class Loop {
    public static void main(String[] args){
        for(int i = 0; i <= 100 ; i++){   // if i<=100 is not there then loop will be infinite.
            System.out.println(i);
        }

        int j = 0;
        while(j<20){
            System.out.println("Hi");
            j = j+1;
        }

        int k = 0;
        do{
            System.out.println("***");
            k++;
        }while(k<=10);            // imp ; terminator 

    }    
}
