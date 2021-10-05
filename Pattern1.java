import java.util.*;
// for pattern printing it is always good to start from i = 1 & j = 1 insted of 0;
public class Pattern1 {
    public static void main(String[] args){
        System.out.println("Enter number of Row and coloumn , for printing Solid Rectangle : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int clm = sc.nextInt();

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < clm ; j++){
                System.out.print('*');
            }
            System.out.println();               // it will give error when only System.out.print();
        }
    }   
}
