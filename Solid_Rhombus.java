public class Solid_Rhombus {
    public static void  main(String[] args) {
        
        int row = 10;
        int flag = row;
        for(int i = 1; i <= row ; i++){
            int spaces = row - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(' ');
            }
            
            for(int j = 1; j <= flag; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        
    }
}
