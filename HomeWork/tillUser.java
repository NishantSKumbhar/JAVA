import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class tillUser {
    public static void main(String[] args) {
        System.out.println("How many Numbers do you want to insert : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the " + num + " Elements : ");
        int arr[] = new int[num];
        
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        int pCount = 0;
        int nCount = 0;
        int zCount = 0;

        for(int i = 0; i < num; i++){
            if(arr[i] > 0){
                pCount++;
            }else if(arr[i] == 0){
                zCount++;
            }else{
                nCount++;
            }    
        }

        System.out.println("Positive Count :  "+ pCount + "\nNegative Count : "+ nCount + "\nZeros : " + zCount);

    }
}
