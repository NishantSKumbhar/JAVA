class DataType{
	int a = 10;  // This is Instance Variable
	static int b = 20;  // This is Instance Variable
	int s;
	static int p;
	public static void main(String args[]){
		System.out.println("Hello Nishant");
		//System.out.println("Instance Variable : " + a);
		DataType d1 = new DataType();
		System.out.println("Instance Variable : " + d1.a);
		System.out.println("Static Variable : " + d1.b);
	
		d1.a = 1001;
		d1.b = 2002;
		System.out.println("\nAfetr Change");
		System.out.println("Instance Variable : " + d1.a);
		System.out.println("Static Variable : " + d1.b);
		
		DataType d2 = new DataType();
		System.out.println("\nAfetr New Object Created");
		System.out.println("Instance Variable : " + d2.a);
		System.out.println("Static Variable : " + d2.b);
		System.out.println("Static Variable Unaltered.");
		
		
		int s;
		//System.out.println(s); 
		// this will give error;
		DataType j = new DataType();
		System.out.println("\n\nInstance & Local variable have default value : " + j.s +", "+ j.p);
	
	}
	
	void addition(){
		int x = 100;  // This is Local Variable
		int b = 101;
		System.out.println(x+b);
		System.out.println("Instance Variable : " + a);
	}
	
	
}