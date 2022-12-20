
public class BitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = -9;
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(12>>2);
		System.out.println(12<<2);
		
		System.out.println(4>>1);
		System.out.println(4<<1);
		
		int n1 = 12;
		int n2 = 34;
		System.out.println("n1 : " + n1 + " and n2 : " + n2);
		n1 = n1 ^ n2;
		n2 = n1 ^ n2;
		n1 = n1 ^ n2;
		System.out.println("n1 : " + n1 + " and n2 : " + n2);
		
		if((n1&1) == 1) {
			System.out.println("ODD");
		}else {
			System.out.println("EVEN");
		}
		boolean ispass = true;
		
		System.out.println(!ispass);
		
		//For positive number, >> and >>> works same  
		System.out.println(20>>2);
		System.out.println(20>>>2);
		//For negative number, >>> changes parity bit (MSB) to 0  
		System.out.println(-20>>2);
		System.out.println(-20>>>2);
		
		int min = (n1 < n2) ? n1:n2;
		System.out.println("Min : " + min);
	}

}
