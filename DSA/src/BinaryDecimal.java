
public class BinaryDecimal {
	
	void db(int n) {
			if(n == 0) {
				return;
			}
			int r = n % 2;
			db(n/2);
			System.out.print(" " + r);
		
	}
	
	void bd(int arr[]) {
		int ans = 0;
		int j = 0;
		for(int i = arr.length -1; i > -1 ; i--) {
			int p = (int)Math.pow(2, j);
			j++;
			if(arr[i] == 1) {
				ans = ans + p;
			}
		}
		System.out.println("\nDecimal : " + ans);
		
	}
	
	public static void main(String[] args) {
		
		BinaryDecimal a = new BinaryDecimal();
		int num = 100;
		int n[] = { 1, 1, 0, 0, 1, 0, 0};
		//		    64 32 16 8	4  2  1		
		//			6  5  4  3  2  1  0
		// 2*
		a.db(num);
		a.bd(n);
		//int k = (int)Math.pow(2, 6);
//		System.out.println("Ans : " + k);
	}

}
