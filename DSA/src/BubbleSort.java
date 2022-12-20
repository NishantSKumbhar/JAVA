import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bubble Sort Algorithm ");
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("How manay Numbers : ");
//		int n = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9,1};
		
		BubbleSort m = new BubbleSort();
		System.out.println("Before Sorting : ");
		m.printArray(arr);
		m.bubbleSort(arr);
		System.out.println("\nAfter Sorting : ");
		m.printArray(arr);
	}
	
	
	void bubbleSort(int arr[]) {
		int flag = 1;
		int c = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				
				if(arr[j] > arr[j+1]) {
					flag = 0;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			c++;
			if(flag == 1) {
				break;
			}
		}
		System.out.println("\nTotal Iterations : " + c);
	}
	
	void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
