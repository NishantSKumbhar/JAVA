public class Array {
    public static void main(String[] args){
        int arr[] = new int[3]; // or int[]marks = new int[3];
        arr[0] = 45;
        arr[1] = 44;
        arr[2] = 43;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("*****************");

        for(int i = 0; i < 3; i++){
            System.out.println(arr[i]);
        }

    }
}
