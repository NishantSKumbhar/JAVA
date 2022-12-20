
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort m = new SelectionSort();
		System.out.println("Slection Sort Algorithm");
		System.out.println("Before Sorting : ");
		int arr[] = {12, 2, 12, 454, 2, 23,5, 24, 67, 2, 1, 9, 56};
		m.printArray(arr);
		m.selectionSort(arr);
		System.out.println("\nAfter Sorting : ");
		m.printArray(arr);

	}
	
	void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	void selectionSort(int arr[]) {
		
		int l = arr.length;
		for(int i = 0; i < l-1; i++) {
			int minIndx = i;
			for(int j = i+1; j < l; j++) {
				
				if(arr[j] < arr[minIndx]) {
					
					minIndx = j;
				}
			}
			int temp = arr[minIndx];
			arr[minIndx] = arr[i];
			arr[i] = temp;
		}
	}

}
