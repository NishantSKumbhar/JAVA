public class Sample {
    public static void main(String args[]){
        System.out.println("Jay Ganesh");
        int i = 0, j = 0;
        for(i = 2; i <= 100; i = i + 2){
            int flag = 1;
            for(j = 2; j < i; j++){
                if(i % j == 0){
                    flag = 0;
                }
            }
            if(flag == 1){
                System.out.println(i);
            }else{
                System.out.println('*');
            }
        }
    }
}
