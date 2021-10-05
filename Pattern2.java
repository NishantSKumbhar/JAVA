import java.util.*;
// for pattern printing it is always good to start from i = 1 & j = 1 insted of 0;
public class Pattern2 {
    public static void main(String[] args){
        System.out.println("Enter number of Row and coloumn , for printing Solid Rectangle : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int clm = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= clm ; j++){
                if(i==1 || j==1 || i==row || j== clm){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        
    }   
    
}
