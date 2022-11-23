
public class First {
	public static void main(String[] args) {
		System.out.println("Jay Ganesh");
		int i = 1;
//		for(i = 1; i < 100; i++) {
//			System.out.println(i + " Jay Ganesh");
//		}
		
		int a = 12;
		System.out.println(a);
		float b = 12.3f;
		System.out.println(b);
		double d = 23.23;
		System.out.println(d);
		float f = a;
		System.out.println(f);
		
		// Type casting
		int h = (int)b;
		System.out.println("Typecasting : " + h);
		
		int max = 1234567891;
		System.out.println("Maximum Integer : " + max);
	
		byte j = 23;
		System.out.println("Byte : " + j);
		byte jk = 12;
		byte addi = (byte)(j + jk);
		System.out.println("Addition : " + addi);
		
		boolean remark = true;
		System.out.println(remark);
	
		// byte range (-128 to 127)
		byte n1 = 127;
		System.out.println(n1);
	
		// short range (-32768 to 32767)
		short s1 = 32767;
		System.out.println(s1);
	
		int i1 = 12;
		// int range ( -2^31 to 2^31 -1)
		
		// long range ( -2^63 to 2^63 - 1)
		
		// The float data type is a single-precision 32-bit IEEE 754 floating point.
		//Its value range is unlimited. 
		//It is recommended to use a float (instead of double) 
		//if you need to save memory in large arrays of floating point numbers. 
		//The float data type should never be used for precise values, 
		//such as currency. Its default value is 0.0F.
		
		int op = 23;
		System.out.println(op++);
		System.out.println(++op);
		System.out.println(op--);
		System.out.println(--op);
		
		System.out.println(op++ + ++op);
		// 23 + 25
		op = 23;
		System.out.println(op++ + op++);
		// 23 + 24
		
		int r1 = 11;
		System.out.println(~r1);
		int r2 = -10;
		System.out.println(~r2);
		
		boolean y = false;
		System.out.println(!y);
		
	}

}
