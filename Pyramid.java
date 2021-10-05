public class Pyramid {
    public static void main(String[] args){
        int row = 5;
        for(int i = 1; i <= row; i++){
            int spaces = row - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print("   ");
            }

            int star = ( 2 * i )- 1;
            for(int j = 1; j<= star; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
    }    
}
