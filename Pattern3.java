import java.util.*;

public class Pattern3 {
    public static void main(String[] args){
        System.out.println("Enter number of Row and coloumn , for printing Solid Rectangle : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int clm = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= clm ; j++){
                if(i==j || j==1 || i==row || i>j){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
