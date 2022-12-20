
public class BinaryOperation {
	static String onesCompliment(String str) {
		char[] s = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1') {
				s[i] = '0';
			}else {
				s[i] = '1';
			}
		}
		
		String si = new String(s);
		return si;
	}
	
	static void substractionBinary(String s1, String s2) {
		System.out.println("------------|");
		System.out.println("Substraction");
		char[] ans = new char[s1.length() + 1];
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("------------|");
		int carry = 0;
		String news2 = onesCompliment(s2);
//		

		System.out.println("------------|");
	}
	static void additionBinary(String s1, String s2) {
		System.out.println("------------|");
		System.out.println("Addition");
		char[] ans = new char[s1.length() + 1];
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("------------|");
		int carry = 0;
		for(int i = s1.length()-1; i > -1; i--) {
			if(s1.charAt(i) == '1' && s2.charAt(i) == '1') {
				if(carry == 1) {
					ans[i+1] = '1';
				}else {
					ans[i+1] = '0';
				}
				carry = 1;
			}else if((s1.charAt(i) == '0' && s2.charAt(i) == '1') || (s1.charAt(i) == '1' && s2.charAt(i) == '0')) {
				if(carry == 1) {
					ans[i+1] = '0';
					carry = 1;
				}else {
					ans[i+1] = '1';
					carry = 0;
				}
				
			}else {
				if(carry == 1) {
					ans[i+1] = '1';
					
				}else {
					ans[i+1] = '0';
				}
				carry = 0;
			}
		}
		if(carry == 0) {
			ans[0] = '0';
		}else {
			ans[0] = '1';
		}
		//System.out.println(carry);
		//System.out.println(ans[0]);
		System.out.println(ans);
		System.out.println("------------|");
	}
	static void createValid(String s1, String s2) {
		int l = (s1.length() > s2.length()) ? s1.length() : s2.length();
//		int i = Integer.parseInt(s2);
		
		char[] a1 = new char[l+1];
		char[] a2 = new char[l+1];
		System.out.println("Length : " + l);
		for(int i = 0; i < s1.length(); i++) {
			a1[i] = s1.charAt(i);
		}
		for(int i = 0; i < s2.length(); i++) {
			a2[i] = s2.charAt(i);
		}
		
		System.out.println(a1);
		System.out.println(a2);
		
	}
	
	public static void main(String[] args) {
		String s = "Welcome";
		System.out.println(s);
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		String n1 = "101";
		String n2 = "1101";
		System.out.println("------------");
		createValid(n1, n2);
		additionBinary("1111", "1101");
		substractionBinary("1111", "1101");
//		int l = (n1.length() > n2.length()) ? Integer.parseInt(n1) : Integer.parseInt(n2);
//		char[] fans = new char[l];
//		for(int i = l-1; i >= 0; i--) {
//			System.out.print(" " + n1.charAt(i));
//		}
		
	}
}
