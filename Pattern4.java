import java.util.*;

import jdk.internal.module.SystemModuleFinders;

public class Pattern4 {
    public static void main(String[] args){
        System.out.println("Enter number of Row and coloumn , for printing Solid Rectangle : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int clm = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= clm ; j++){
                if(i==1 || j==1 || i+j==row+1 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }    
}

//        for(int i = row ; i>=1 ; i--){
 //           for(int j = 1; j<=1 ; j++){
   //             System.out.print("*");
     //       }
       //     System.out.println();
        //  }