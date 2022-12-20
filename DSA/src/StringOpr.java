
public class StringOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generally, String is a sequence of characters. 
		// But in Java, string is an object that represents a sequence of characters. 
		// The java.lang.String class is used to create a string object.
		char[] car = {'e', 'r', 't', 'o', 's', 'o'};
		System.out.println(car);
		String s1 = new String(car);
		
		System.out.println(s1);
		
		String s2 = "Welcome";
		System.out.println(s2);
		// Each time you create a string literal, 
		// the JVM checks the "string constant pool" first. 
		// If the string already exists in the pool, 
		// a reference to the pooled instance is returned. 
		// If the string doesn't exist in the pool, a new string instance is created 
		// and placed in the pool. For example:
		
		String s3 = "Welcome";//It doesn't create a new instance  
		//  it will not create a new object but will return the reference to the same instance.
		// Note: String objects are stored in a special memory area known as the "string constant pool".
		// To make Java more memory efficient 
		// (because no new objects are created if it exists already in the string constant pool).
		
		String s4 = new String("JackNa ask");
		System.out.println(s4);
		// In such case, JVM
		// will create a new string object in normal (non-pool) heap memory, 
		//and the literal "JackNa ask" will be placed in the string constant pool. T
		// he variable s will refer to the object in a heap (non-pool).
		String[] sarr = {"C++", "C", "Python", "Java", "Php", "Ruby"};
		for(int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		System.out.println("------------------------------");
		for(String name:sarr) {
			System.out.println(name);
		}
	}

}
